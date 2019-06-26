package com.zyf.study.dao;

import com.zyf.study.dataobject.OrganizationDO;

import java.util.List;

public interface OrganizationDOMapper {
    int deleteByPrimaryKey(String orgId);

    int insert(OrganizationDO record);

    int insertSelective(OrganizationDO record);

    OrganizationDO selectByPrimaryKey(String orgId);

    int updateByPrimaryKeySelective(OrganizationDO record);

    int updateByPrimaryKey(OrganizationDO record);

    List<Object> selectOrganization();

}