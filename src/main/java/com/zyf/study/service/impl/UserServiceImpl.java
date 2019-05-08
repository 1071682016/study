package com.zyf.study.service.impl;

import com.zyf.study.dao.UserDOMapper;
import com.zyf.study.dao.UserPasswordDOMapper;
import com.zyf.study.dataobject.UserDO;
import com.zyf.study.dataobject.UserPasswordDO;
import com.zyf.study.service.UserService;
import com.zyf.study.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * user实现类
 * Created by yxf on 2019/5/8.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDOMapper userDOMapper;

    @Autowired
    UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public UserModel getUserById(Integer id) {

        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if (userDO == null) {
            return null;
        }
        //通过用户id获取加密 密码信息
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(userDO.getId());

        return convertFromDataObject(userDO, userPasswordDO);

    }

    private UserModel convertFromDataObject(UserDO userDO, UserPasswordDO userPasswordDO) {
        if (userDO == null) {
            return null;
        }

        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDO, userModel);
        if (userPasswordDO != null) {
            userModel.setEncrtpPassword(userPasswordDO.getEncrtpPassword());
        }
        return userModel;


    }
}
