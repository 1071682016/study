package com.zyf.study.validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * Created by yxf on 2019/5/14.
 */
@Component
public class ValidatorImpl implements InitializingBean {
    private Validator validator;

    public ValidatorResult validate(Object bean) {
        ValidatorResult result = new ValidatorResult();
        Set<ConstraintViolation<Object>> constraintViolationSet = validator.validate(bean);
        if (constraintViolationSet.size() > 0) {
            //有错误
            result.setHasErrors(true);
            constraintViolationSet.forEach(item -> {
                String message = item.getMessage();
                String propertyName = item.getPropertyPath().toString();
                result.getErrorMsgMap().put(propertyName, message);

            });
        }
        return result;


    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //将hibernate validatot 通过工厂的初始化方式实例化
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();

    }
}
