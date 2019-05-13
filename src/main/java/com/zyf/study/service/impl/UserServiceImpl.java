package com.zyf.study.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.zyf.study.dao.UserDOMapper;
import com.zyf.study.dao.UserPasswordDOMapper;
import com.zyf.study.dataobject.UserDO;
import com.zyf.study.dataobject.UserPasswordDO;
import com.zyf.study.error.BusinessException;
import com.zyf.study.error.EmBusinessError;
import com.zyf.study.service.UserService;
import com.zyf.study.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional
    public UserModel register(UserModel userModel) throws BusinessException {
        if (userModel == null) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);

        }
        //将UserModel 转成 dataObject
        UserDO userDO = convertFromModel(userModel);
        userDOMapper.insertSelective(userDO);

        UserPasswordDO userPasswordDO = converPasswordFromMoodel(userModel);
        userPasswordDOMapper.insertSelective(userPasswordDO);


        return userModel;
    }


    private UserDO convertFromModel(UserModel userModel) {
        if (userModel == null) {
            return null;
        }
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userModel, userDO);
        return userDO;
    }

    private UserPasswordDO converPasswordFromMoodel(UserModel userModel) {
        if (userModel == null) {
            return null;
        }
        UserPasswordDO userPasswordDO = new UserPasswordDO();
        userPasswordDO.setUserId(userModel.getId());
        userPasswordDO.setEncrtpPassword(userModel.getEncrtpPassword());
        return userPasswordDO;
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
