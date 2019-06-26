package com.zyf.study.service;

import com.zyf.study.error.BusinessException;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: 012
 * Date: 2019/6/25
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public interface ComplaintMessageService {

    int getAnnualComplaintNumber(String createdOn) throws BusinessException;



}
