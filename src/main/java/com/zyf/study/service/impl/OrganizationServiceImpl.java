package com.zyf.study.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zyf.study.controller.viewObject.OrganizationVO;
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

    /**
     * 查询不同区的投诉数量
     * @return
     */
    @Override
    public List<OrganizationVO> selectList() {
        List<OrgDO> list = orgDOMapper.selectOrg();
        List<OrganizationVO> listVO = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            OrganizationVO organizationVO = new OrganizationVO();
            organizationVO.setX(list.get(i).getName());
            organizationVO.setY(list.get(i).getNum());
            organizationVO.setS(1);
            listVO.add(organizationVO);
        }
        return listVO;
    }
}
