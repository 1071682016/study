package com.zyf.study.service.impl;

import com.zyf.study.dao.UserDOMapper;
import com.zyf.study.dao.UserPasswordDOMapper;
import com.zyf.study.dataobject.UserDO;
import com.zyf.study.dataobject.UserPasswordDO;
import com.zyf.study.error.BusinessException;
import com.zyf.study.error.EmBusinessError;
import com.zyf.study.service.UserService;
import com.zyf.study.service.model.UserModel;
import com.zyf.study.utils.MD5Util;
import com.zyf.study.validator.ValidatorImpl;
import com.zyf.study.validator.ValidatorResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * user实现类
 * Created by yxf on 2019/5/8.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Autowired
    private ValidatorImpl validator;

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
        ValidatorResult ruselt = validator.validate(userModel);
        if (ruselt.isHasErrors()) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, ruselt.getErrMsg());

        }

        //生成密钥
        Random random = new Random();
        int randomInt = random.nextInt(9999) + 1000;
        String key = String.valueOf(randomInt);
        userModel.setSecretKey(key);
        userModel.setEncrtpPassword(MD5Util.md5(userModel.getEncrtpPassword(),key));


        //将UserModel 转成 dataObject
        UserDO userDO = convertFromModel(userModel);
        userDOMapper.insertSelective(userDO);

        userModel.setId(userDO.getId());

        UserPasswordDO userPasswordDO = converPasswordFromModel(userModel);
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

    private UserPasswordDO converPasswordFromModel(UserModel userModel) {
        if (userModel == null) {
            return null;
        }
        UserPasswordDO userPasswordDO = new UserPasswordDO();
        userPasswordDO.setUserId(userModel.getId());
        userPasswordDO.setSecretKey(userModel.getSecretKey());
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
