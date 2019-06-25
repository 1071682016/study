package com.zyf.study.service;

import com.zyf.study.dataobject.ComplaintMessageDO;
import com.zyf.study.error.BusinessException;

/**
 * Created with IntelliJ IDEA.
 * User: 012
 * Date: 2019/6/25
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface ComplaintMessageService {

    //全年实时投诉量
    ComplaintMessageDO annualComplaintNumber() throws BusinessException;

}
