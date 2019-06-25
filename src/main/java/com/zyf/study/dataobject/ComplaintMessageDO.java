package com.zyf.study.dataobject;

import java.math.BigDecimal;

public class ComplaintMessageDO {
    private String complaintId;

    private String szciaOriginId;

    private Integer szciaExchangeStatus;

    private String userId;

    private String orgId;

    private String orgUserId;

    private String companyId;

    private String branchId;

    private String complaintRegisterNo;

    private String receiveType;

    private String districtId;

    private String complaintPropertyId;

    private String complaintTypeId;

    private Integer isService;

    private String productName;

    private String brand;

    private String serviceType;

    private Integer shoppingType;

    private String otherShoppingType;

    private BigDecimal price;

    private String consumeDate;

    private String description;

    private String consult;

    private String demands;

    private BigDecimal revertMoney;

    private BigDecimal compensation;

    private String evidence;

    private String mertEvidence;

    private String CCEvidence;

    private String arbitration;

    private String arbitralAward;

    private String addition;

    private Integer complaintStatus;

    private Integer froms;

    private String complaintName;

    private String complaintContact;

    private String complaintPhone;

    private String provAndCity;

    private String complaintAddress;

    private String complaintWeb;

    private String complainChannels;

    private String clientIp;

    private String province;

    private String city;

    private Integer mediateStatus;

    private Integer isHelp;

    private String helpUserId;

    private Integer isReject;

    private String rejectReason;

    private Integer isSupply;

    private Integer isCompanyBack;

    private Integer againTimes;

    private Boolean showEmail;

    private Boolean showCardId;

    private String createdOn;

    private String createdBy;

    private String modifiedOn;

    private String modifiedBy;

    private Integer isTop;

    private Integer isReadCount;

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId == null ? null : complaintId.trim();
    }

    public String getSzciaOriginId() {
        return szciaOriginId;
    }

    public void setSzciaOriginId(String szciaOriginId) {
        this.szciaOriginId = szciaOriginId == null ? null : szciaOriginId.trim();
    }

    public Integer getSzciaExchangeStatus() {
        return szciaExchangeStatus;
    }

    public void setSzciaExchangeStatus(Integer szciaExchangeStatus) {
        this.szciaExchangeStatus = szciaExchangeStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgUserId() {
        return orgUserId;
    }

    public void setOrgUserId(String orgUserId) {
        this.orgUserId = orgUserId == null ? null : orgUserId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId == null ? null : branchId.trim();
    }

    public String getComplaintRegisterNo() {
        return complaintRegisterNo;
    }

    public void setComplaintRegisterNo(String complaintRegisterNo) {
        this.complaintRegisterNo = complaintRegisterNo == null ? null : complaintRegisterNo.trim();
    }

    public String getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(String receiveType) {
        this.receiveType = receiveType == null ? null : receiveType.trim();
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId == null ? null : districtId.trim();
    }

    public String getComplaintPropertyId() {
        return complaintPropertyId;
    }

    public void setComplaintPropertyId(String complaintPropertyId) {
        this.complaintPropertyId = complaintPropertyId == null ? null : complaintPropertyId.trim();
    }

    public String getComplaintTypeId() {
        return complaintTypeId;
    }

    public void setComplaintTypeId(String complaintTypeId) {
        this.complaintTypeId = complaintTypeId == null ? null : complaintTypeId.trim();
    }

    public Integer getIsService() {
        return isService;
    }

    public void setIsService(Integer isService) {
        this.isService = isService;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public Integer getShoppingType() {
        return shoppingType;
    }

    public void setShoppingType(Integer shoppingType) {
        this.shoppingType = shoppingType;
    }

    public String getOtherShoppingType() {
        return otherShoppingType;
    }

    public void setOtherShoppingType(String otherShoppingType) {
        this.otherShoppingType = otherShoppingType == null ? null : otherShoppingType.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(String consumeDate) {
        this.consumeDate = consumeDate == null ? null : consumeDate.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getConsult() {
        return consult;
    }

    public void setConsult(String consult) {
        this.consult = consult == null ? null : consult.trim();
    }

    public String getDemands() {
        return demands;
    }

    public void setDemands(String demands) {
        this.demands = demands == null ? null : demands.trim();
    }

    public BigDecimal getRevertMoney() {
        return revertMoney;
    }

    public void setRevertMoney(BigDecimal revertMoney) {
        this.revertMoney = revertMoney;
    }

    public BigDecimal getCompensation() {
        return compensation;
    }

    public void setCompensation(BigDecimal compensation) {
        this.compensation = compensation;
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence == null ? null : evidence.trim();
    }

    public String getMertEvidence() {
        return mertEvidence;
    }

    public void setMertEvidence(String mertEvidence) {
        this.mertEvidence = mertEvidence == null ? null : mertEvidence.trim();
    }

    public String getCCEvidence() {
        return CCEvidence;
    }

    public void setCCEvidence(String CCEvidence) {
        this.CCEvidence = CCEvidence == null ? null : CCEvidence.trim();
    }

    public String getArbitration() {
        return arbitration;
    }

    public void setArbitration(String arbitration) {
        this.arbitration = arbitration == null ? null : arbitration.trim();
    }

    public String getArbitralAward() {
        return arbitralAward;
    }

    public void setArbitralAward(String arbitralAward) {
        this.arbitralAward = arbitralAward == null ? null : arbitralAward.trim();
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition == null ? null : addition.trim();
    }

    public Integer getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(Integer complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public Integer getFroms() {
        return froms;
    }

    public void setFroms(Integer froms) {
        this.froms = froms;
    }

    public String getComplaintName() {
        return complaintName;
    }

    public void setComplaintName(String complaintName) {
        this.complaintName = complaintName == null ? null : complaintName.trim();
    }

    public String getComplaintContact() {
        return complaintContact;
    }

    public void setComplaintContact(String complaintContact) {
        this.complaintContact = complaintContact == null ? null : complaintContact.trim();
    }

    public String getComplaintPhone() {
        return complaintPhone;
    }

    public void setComplaintPhone(String complaintPhone) {
        this.complaintPhone = complaintPhone == null ? null : complaintPhone.trim();
    }

    public String getProvAndCity() {
        return provAndCity;
    }

    public void setProvAndCity(String provAndCity) {
        this.provAndCity = provAndCity == null ? null : provAndCity.trim();
    }

    public String getComplaintAddress() {
        return complaintAddress;
    }

    public void setComplaintAddress(String complaintAddress) {
        this.complaintAddress = complaintAddress == null ? null : complaintAddress.trim();
    }

    public String getComplaintWeb() {
        return complaintWeb;
    }

    public void setComplaintWeb(String complaintWeb) {
        this.complaintWeb = complaintWeb == null ? null : complaintWeb.trim();
    }

    public String getComplainChannels() {
        return complainChannels;
    }

    public void setComplainChannels(String complainChannels) {
        this.complainChannels = complainChannels == null ? null : complainChannels.trim();
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getMediateStatus() {
        return mediateStatus;
    }

    public void setMediateStatus(Integer mediateStatus) {
        this.mediateStatus = mediateStatus;
    }

    public Integer getIsHelp() {
        return isHelp;
    }

    public void setIsHelp(Integer isHelp) {
        this.isHelp = isHelp;
    }

    public String getHelpUserId() {
        return helpUserId;
    }

    public void setHelpUserId(String helpUserId) {
        this.helpUserId = helpUserId == null ? null : helpUserId.trim();
    }

    public Integer getIsReject() {
        return isReject;
    }

    public void setIsReject(Integer isReject) {
        this.isReject = isReject;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    public Integer getIsSupply() {
        return isSupply;
    }

    public void setIsSupply(Integer isSupply) {
        this.isSupply = isSupply;
    }

    public Integer getIsCompanyBack() {
        return isCompanyBack;
    }

    public void setIsCompanyBack(Integer isCompanyBack) {
        this.isCompanyBack = isCompanyBack;
    }

    public Integer getAgainTimes() {
        return againTimes;
    }

    public void setAgainTimes(Integer againTimes) {
        this.againTimes = againTimes;
    }

    public Boolean getShowEmail() {
        return showEmail;
    }

    public void setShowEmail(Boolean showEmail) {
        this.showEmail = showEmail;
    }

    public Boolean getShowCardId() {
        return showCardId;
    }

    public void setShowCardId(Boolean showCardId) {
        this.showCardId = showCardId;
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

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getIsReadCount() {
        return isReadCount;
    }

    public void setIsReadCount(Integer isReadCount) {
        this.isReadCount = isReadCount;
    }
}