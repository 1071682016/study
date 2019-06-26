package com.zyf.study.dao;

import com.zyf.study.dataobject.CompanyDO;

import java.util.List;

public interface CompanyDOMapper {
    int deleteByPrimaryKey(String companyId);

    int insert(CompanyDO record);

    int insertSelective(CompanyDO record);

    CompanyDO selectByPrimaryKey(String companyId);

    int updateByPrimaryKeySelective(CompanyDO record);

    int updateByPrimaryKey(CompanyDO record);

    Integer selectCompanyList();
}