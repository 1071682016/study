package com.zyf.study.service;

import org.springframework.stereotype.Service;

/**
 * Created by yxf on 2019/5/8.
 */
@Service
public interface UserService {
    //通过用户id获取用户对象
    void getUserById(Integer id);
}
