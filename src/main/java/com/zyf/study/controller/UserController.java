package com.zyf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yxf on 2019/5/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    public void getUesr(@RequestParam("id") Integer id){

    }
}
