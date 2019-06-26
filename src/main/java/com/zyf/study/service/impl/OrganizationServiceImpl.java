package com.zyf.study.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zyf.study.dao.OrgDOMapper;
import com.zyf.study.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrgDOMapper orgDOMapper;

    @Override
    public List<JSONObject> selectList() {
//        OrganizationVO organizationVO = new OrganizationVO();
        List<JSONObject> list = orgDOMapper.selectOrg();
        for (Object lists : list){
            System.out.println(lists);
        }
//        organizationVO.setX("");
//        organizationVO.setY("");
//        organizationVO.setS(1);
//        list.add(organizationVO);
        return list;
    }
}
