package com.zyf.study.controller;

import com.zyf.study.controller.viewObject.UserVO;
import com.zyf.study.error.BusinessException;
import com.zyf.study.error.EmBusinessError;
import com.zyf.study.response.CommonReturnType;
import com.zyf.study.service.UserService;
import com.zyf.study.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yxf on 2019/5/8.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public CommonReturnType getUser(@RequestParam("id") Integer id) throws BusinessException {

        UserModel userModel = userService.getUserById(id);
        if (userModel == null) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);

        }

        //将核心领域模型用户对象转化为可供前端使用的viewObject
        UserVO userVO = convertFromModel(userModel);

        //返回通用对象。
        return CommonReturnType.create(userVO);

    }

    private UserVO convertFromModel(UserModel userModel) {
        if (userModel == null) {
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userModel, userVO);
        return userVO;
    }


}
