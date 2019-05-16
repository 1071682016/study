package com.zyf.study.validator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 校验器
 * Created by yxf on 2019/5/14.
 */
public class ValidatorResult {
    //效验结果是否有误
    private boolean hasErrors = false;

    //存放错误信息
    private Map<String, String> errorMsgMap = new HashMap<>();

    public boolean isHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public Map<String, String> getErrorMsgMap() {
        return errorMsgMap;
    }

    public void setErrorMsgMap(Map<String, String> errorMsgMap) {
        this.errorMsgMap = errorMsgMap;
    }

    //获取错误信息的msg方法
    public String getErrMsg() {
        Collection<String> values = errorMsgMap.values();
        String[] valuesArray = new String[values.size()];

        return String.join(",",errorMsgMap.values().toArray(valuesArray));
    }
}

