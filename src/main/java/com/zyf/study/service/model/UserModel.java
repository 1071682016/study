package com.zyf.study.service.model;

/**
 * 定义这个model,是因为dataobject直接映射数据库的不能直接返回前端
 * <p>
 * Created by yxf on 2019/5/8.
 */
public class UserModel {
    private Integer id;

    private String name;

    private Byte gender;

    private Integer age;

    private String telphone;

    private String registerMode;

    private String thirdPartyId;

    private String encrtpPassword;

    public UserModel() {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.telphone = telphone;
        this.registerMode = registerMode;
        this.thirdPartyId = thirdPartyId;
        this.encrtpPassword = encrtpPassword;
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
