package com.zyf.study.service.model;

import javax.validation.constraints.NotBlank;

/**
 * 定义这个model,是因为dataobject直接映射数据库的不能直接返回前端
 * <p>
 * Created by yxf on 2019/5/8.
 */
public class UserModel {
    private Integer id;

    @NotBlank(message = "昵称不能不填")
    private String name;

    private Byte gender;
    private Integer age;

    @NotBlank(message = "手机号不能为空")
    private String telphone;

    private String registerMode;


    private String thirdPartyId;

    //@NotBlank(message = "密钥不能为空")
    private String secretKey;

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    @NotBlank(message = "密码不能为空")
    private String encrtpPassword;

    public UserModel() {
    }

    public UserModel(Integer id, Byte gender, String registerMode, String thirdPartyId, String secretKey) {
        this.id = id;
        this.gender = gender;
        this.registerMode = registerMode;
        this.thirdPartyId = thirdPartyId;
        this.secretKey = secretKey;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getRegisterMode() {
        return registerMode;
    }

    public void setRegisterMode(String registerMode) {
        this.registerMode = registerMode;
    }

    public String getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    public String getEncrtpPassword() {
        return encrtpPassword;
    }

    public void setEncrtpPassword(String encrtpPassword) {
        this.encrtpPassword = encrtpPassword;
    }
}
