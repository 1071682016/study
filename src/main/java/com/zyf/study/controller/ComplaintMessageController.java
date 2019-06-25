package com.zyf.study.controller;

import com.zyf.study.response.CommonReturnType;
import com.zyf.study.service.ComplaintMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: 012
 * Date: 2019/6/25
 * Time: 15:11
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RequestMapping("/api")
public class ComplaintMessageController extends BaseController {
    @Autowired
    ComplaintMessageService complaintMessageService;

    @RequestMapping("annualComplaintNumber")
    @ResponseBody
    public CommonReturnType annualComplaintNumber(){
        return null;
    }



}
