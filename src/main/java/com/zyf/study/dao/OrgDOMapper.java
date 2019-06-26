package com.zyf.study.dao;

import com.alibaba.fastjson.JSONObject;
import com.zyf.study.dataobject.OrgDO;

import java.util.List;

public interface OrgDOMapper {

    List<OrgDO> selectOrg();

}
