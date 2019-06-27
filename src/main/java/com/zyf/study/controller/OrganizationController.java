package com.zyf.study.controller;

import com.alibaba.fastjson.JSONObject;
import com.zyf.study.controller.viewObject.OrganizationVO;
import com.zyf.study.dataobject.OrgDO;
import com.zyf.study.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/org")
public class OrganizationController extends BaseController{

    @Autowired
    private OrganizationService organizationService;

    /**
     * 查询深圳不同区的投诉数量
     * @return
     */
    @RequestMapping("/data")
    @ResponseBody
    public List<OrganizationVO> selectOrganization(){
        return organizationService.selectList();
    }
}
