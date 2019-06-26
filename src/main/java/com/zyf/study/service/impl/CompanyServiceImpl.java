package com.zyf.study.service.impl;

import com.zyf.study.dao.CompanyDOMapper;
import com.zyf.study.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDOMapper companyDOMapper;

    @Override
    public Integer selectCompany() {
        Integer number = companyDOMapper.selectCompanyList();
        System.out.println(number);
        return number;
    }
}
