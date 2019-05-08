package com.zyf.study.service;

import com.zyf.study.service.model.UserModel;
import org.springframework.stereotype.Service;

/**
 * Created by yxf on 2019/5/8.
 */
@Service
public interface UserService {
    //通过用户id获取用户对象
    UserModel getUserById(Integer id);
}
