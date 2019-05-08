package com.zyf.study.service.impl;

import com.zyf.study.dao.UserDOMapper;
import com.zyf.study.dataobject.UserDO;
import com.zyf.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yxf on 2019/5/8.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDOMapper userDOMapper;

    @Override
    public void getUserById(Integer id) {

        UserDO userDO = userDOMapper.selectByPrimaryKey(id);






    }
}
