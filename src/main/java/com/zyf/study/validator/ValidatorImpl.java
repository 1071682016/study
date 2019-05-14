package com.zyf.study.validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;

/**
 * Created by yxf on 2019/5/14.
 */
@Component
public class ValidatorImpl implements InitializingBean {
    private Validator validator;

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
