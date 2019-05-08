package com.zyf.study.error;

/**
 * Created by yxf on 2019/5/9.
 */
public interface CommonError {
    public int getErrCode();

    public String getErrMsg();

    public CommonError setErrMsg(String errMsg);
}
