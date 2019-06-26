package com.zyf.study.service.impl;

import com.zyf.study.dao.ComplaintMessageDOMapper;
import com.zyf.study.service.ComplaintMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: 012
 * Date: 2019/6/25
 * Time: 17:54
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class ComplaintMessageServiceImpl implements ComplaintMessageService {

    @Autowired
    ComplaintMessageDOMapper complaintMessageDOMapper;

    @Override
    public int getAnnualComplaintNumber(String createdOn) {

        int count = complaintMessageDOMapper.selectComplaintNumber(createdOn);

        return count;
    }
}
