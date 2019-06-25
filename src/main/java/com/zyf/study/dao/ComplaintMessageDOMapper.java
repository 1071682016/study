package com.zyf.study.dao;

import com.zyf.study.dataobject.ComplaintMessageDO;

public interface ComplaintMessageDOMapper {
    int deleteByPrimaryKey(String complaintid);

    int insert(ComplaintMessageDO record);

    int insertSelective(ComplaintMessageDO record);

    ComplaintMessageDO selectByPrimaryKey(String complaintid);

    int updateByPrimaryKeySelective(ComplaintMessageDO record);

    int updateByPrimaryKey(ComplaintMessageDO record);

}