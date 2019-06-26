package com.zyf.study.controller;

import com.zyf.study.controller.viewObject.ObjectVO;
import com.zyf.study.service.CompanyService;
import com.zyf.study.service.impl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController extends BaseController{

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/select")
    @ResponseBody
    public List<Object> demo(){
        List<Object> data = new ArrayList<>();
        int number = companyService.selectCompany();
        ObjectVO objectVO = new ObjectVO();
        objectVO.setName("商家总数");
        objectVO.setValue(number);
        data.add(objectVO);
        return data;
    }
}
