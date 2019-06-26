package com.zyf.study.dataobject;

public class OrganizationDO {
    private String orgId;

    private String name;

    private String image;

    private Integer levels;

    private Integer orderNo;

    private Integer assignType;

    private Integer needLeaderApprove;

    private String assigndUserId;

    private String description;

    private String createdOn;

    private String createdBy;

    private String modifiedOn;

    private String modifiedBy;

    private String szciaOrgId;

    private String newSzaicOrgId;

    private String ccaOrgId;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getAssignType() {
        return assignType;
    }

    public void setAssignType(Integer assignType) {
        this.assignType = assignType;
    }

    public Integer getNeedLeaderApprove() {
        return needLeaderApprove;
    }

    public void setNeedLeaderApprove(Integer needLeaderApprove) {
        this.needLeaderApprove = needLeaderApprove;
    }

    public String getAssigndUserId() {
        return assigndUserId;
    }

    public void setAssigndUserId(String assigndUserId) {
        this.assigndUserId = assigndUserId == null ? null : assigndUserId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn == null ? null : createdOn.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn == null ? null : modifiedOn.trim();
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    public String getSzciaOrgId() {
        return szciaOrgId;
    }

    public void setSzciaOrgId(String szciaOrgId) {
        this.szciaOrgId = szciaOrgId == null ? null : szciaOrgId.trim();
    }

    public String getNewSzaicOrgId() {
        return newSzaicOrgId;
    }

    public void setNewSzaicOrgId(String newSzaicOrgId) {
        this.newSzaicOrgId = newSzaicOrgId == null ? null : newSzaicOrgId.trim();
    }

    public String getCcaOrgId() {
        return ccaOrgId;
    }

    public void setCcaOrgId(String ccaOrgId) {
        this.ccaOrgId = ccaOrgId == null ? null : ccaOrgId.trim();
    }
}