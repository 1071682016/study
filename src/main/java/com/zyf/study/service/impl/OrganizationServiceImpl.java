package com.zyf.study.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zyf.study.dao.OrgDOMapper;
import com.zyf.study.dataobject.OrgDO;
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
    public List<OrgDO> selectList() {
        List<OrgDO> list = orgDOMapper.selectOrg();
//        for (int i = 0; i<list.size(); i++){
//            System.out.println(list.get(i).getName());
//        }
        return list;
    }
}
