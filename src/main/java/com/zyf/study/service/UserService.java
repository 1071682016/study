package com.zyf.study.service;

import com.zyf.study.error.BusinessException;
import com.zyf.study.service.model.UserModel;
import org.springframework.stereotype.Service;

/**
 * Created by yxf on 2019/5/8.
 */
@Service
public interface UserService {
    //通过用户id获取用户对象
    UserModel getUserById(Integer id);

    //用户注册
    UserModel register(UserModel userModel) throws BusinessException;

    //用户登录
    void validateLogin(String telphone,String password) throws BusinessException;
}
