package com.zyf.study.response;

/**
 * 返回结果处理
 * Created by yxf on 2019/5/9.
 */
public class CommonReturnType {
    //请求的返回处理结果 "success"或"fail"
    private String status;

    private Object data;

    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");
    }

    public static CommonReturnType create(Object result,String status){
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
