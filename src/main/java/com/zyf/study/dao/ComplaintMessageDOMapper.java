package com.zyf.study.dao;

import com.zyf.study.dataobject.ComplaintMessageDO;
import com.zyf.study.service.model.ComPropertyModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ComplaintMessageDOMapper {
    int deleteByPrimaryKey(String complaintId);

    int insert(ComplaintMessageDO record);

    int insertSelective(ComplaintMessageDO record);

    ComplaintMessageDO selectByPrimaryKey(String complaintId);

    int updateByPrimaryKeySelective(ComplaintMessageDO record);

    int updateByPrimaryKey(ComplaintMessageDO record);

    int selectComplaintNumber(String createdOn);

    List<ComPropertyModel> selectComPropertyNumber(String createdOn);

}