package com.zyf.study.dataobject;

public class UserPasswordDO {
    private Integer id;

    private Integer userId;

    private String key;

    private String encrtpPassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getEncrtpPassword() {
        return encrtpPassword;
    }

    public void setEncrtpPassword(String encrtpPassword) {
        this.encrtpPassword = encrtpPassword == null ? null : encrtpPassword.trim();
    }
}