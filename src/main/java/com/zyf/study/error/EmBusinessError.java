package com.zyf.study.error;


/**
 * Created by yxf on 2019/5/9.
 */
public enum EmBusinessError implements CommonError {
    //通用错误类型10001
    PARAMETER_VALIDATION_ERROR(100001, "参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),

    //10000开头为用户信息相关错误码
    USER_NOT_EXIST(20001, "用户不存在");

    private EmBusinessError(int errCode, String errMsg) {
        this.errCoed = errCode;
        this.errMsg = errMsg;
    }

    private int errCoed;
    private String errMsg;

    @Override
    public int getErrCode() {
        return this.errCoed;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
