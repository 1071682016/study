package com.zyf.study.service;

import com.zyf.study.error.BusinessException;
import com.zyf.study.service.model.ComPropertyModel;
import org.springframework.stereotype.Service;

import java.util.List;

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

    List<ComPropertyModel> getComPropertyNumber(String createdOn) throws BusinessException;



}
