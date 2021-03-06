package com.zyf.study.controller;

import com.zyf.study.controller.viewObject.UserVO;
import com.zyf.study.error.BusinessException;
import com.zyf.study.error.EmBusinessError;
import com.zyf.study.response.CommonReturnType;
import com.zyf.study.service.UserService;
import com.zyf.study.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 * Created by yxf on 2019/5/8.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    UserService userService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    public CommonReturnType login(@RequestParam(name = "telphone") String telphone,
                                  @RequestParam(name = "password") String password) throws BusinessException {
        if (StringUtils.isEmpty(telphone) || StringUtils.isEmpty(password))
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);

        userService.validateLogin(telphone, password);

        //将登录凭证加入token

        return CommonReturnType.create(null);


    }


    //用户注册
    @RequestMapping("/register")
    @ResponseBody
    public CommonReturnType register(@RequestParam(name = "telphone") String telphone,
                                     @RequestParam(name = "name") String name,
                                     @RequestParam(name = "password") String password,
                                     @RequestParam(name = "otpCode") String otpCode) throws BusinessException {
        //TOTO验证otpcode
        String isSessionCode = (String) httpServletRequest.getSession().getAttribute(telphone);
//        if (!StringUtils.equals(otpCode, isSessionCode)) {
//            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, "短信验证码错误");
//        }
        UserModel userModel = new UserModel();
        userModel.setTelphone(telphone);
        userModel.setName(name);
        userModel.setEncrtpPassword(password);//加密密码

        userService.register(userModel);
        return CommonReturnType.create(null);
    }


    //用户获取Otp短信验证
    @RequestMapping("/getotp")
    @ResponseBody
    public CommonReturnType getOtp(@RequestParam(name = "telphone") String telphone) {
        Random random = new Random();
        int randomInt = random.nextInt(9999);
        randomInt += 1000;
        String otpCode = String.valueOf(randomInt);
        //使用http
        httpServletRequest.getSession().setAttribute(telphone, otpCode);
        System.out.println(otpCode);

        return CommonReturnType.create(null);

    }


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
