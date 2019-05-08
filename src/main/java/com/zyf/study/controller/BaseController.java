package com.zyf.study.controller;

import com.zyf.study.error.BusinessException;
import com.zyf.study.error.EmBusinessError;
import com.zyf.study.response.CommonReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yxf on 2019/5/9.
 */
public class BaseController {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception ex) {

        Map<String, Object> rsponseData = new HashMap<>();
        if (ex instanceof BusinessException) {
            BusinessException businessException = (BusinessException) ex;
            rsponseData.put("errCode", businessException.getErrCode());
            rsponseData.put("errMsg", businessException.getErrMsg());
        } else {
            rsponseData.put("errCode", EmBusinessError.UNKNOWN_ERROR.getErrCode());
            rsponseData.put("errMsg", EmBusinessError.UNKNOWN_ERROR.getErrMsg());
        }
        return CommonReturnType.create(rsponseData, "fail");

    }

}
