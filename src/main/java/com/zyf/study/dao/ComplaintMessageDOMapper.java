package com.zyf.study.dao;

import com.zyf.study.dataobject.ComplaintMessageDO;

public interface ComplaintMessageDOMapper {
    int deleteByPrimaryKey(String complaintId);

    int insert(ComplaintMessageDO record);

    int insertSelective(ComplaintMessageDO record);

    ComplaintMessageDO selectByPrimaryKey(String complaintId);

    int updateByPrimaryKeySelective(ComplaintMessageDO record);

    int updateByPrimaryKey(ComplaintMessageDO record);

    int selectByCreatedOn(String createdOn);
}