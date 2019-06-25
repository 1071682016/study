package com.zyf.study.service.impl;

import com.zyf.study.dao.ComplaintMessageDOMapper;
import com.zyf.study.dataobject.ComplaintMessageDO;
import com.zyf.study.error.BusinessException;
import com.zyf.study.service.ComplaintMessageService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: 012
 * Date: 2019/6/25
 * Time: 15:25
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ComplanitMessageServiveImpl implements ComplaintMessageService {

    @Autowired
    private ComplaintMessageDOMapper complaintMessageDOMapper;


    @Override
    public ComplaintMessageDO annualComplaintNumber(String CreatedOn) throws BusinessException {

        complaintMessageDOMapper.selectByCreatedOn(CreatedOn);






        return null;
    }
}
