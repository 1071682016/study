package com.zyf.study.service;

import com.alibaba.fastjson.JSONObject;
import com.zyf.study.controller.viewObject.OrganizationVO;
import com.zyf.study.dataobject.OrgDO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrganizationService {

    /**
     * 查询深圳不同区的投诉数量
     * @return
     */
    List<OrganizationVO> selectList();

}
