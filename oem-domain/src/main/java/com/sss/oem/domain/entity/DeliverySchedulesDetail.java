package com.sss.oem.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class DeliverySchedulesDetail implements Serializable {
    private Integer dId;

    private String dNo;

    private Integer dOrder;

    private String contractno;

    private String dName;

    private String dType;

    private String dSteel;

    private String dSpec;

    private String dNps;

    private Integer dQuantity;

    private String dUnit;

    private Integer dNumber;

    private BigDecimal dWeight;

    private BigDecimal dNumbers;

    private BigDecimal dWeights;

    private Integer sQuantity;

    private String sUnit;

    private Integer sNumber;

    private BigDecimal sWeight;

    private BigDecimal sNumbers;

    private BigDecimal sWeights;

    private Integer mQuantity;

    private String mUnit;

    private Integer mNumber;

    private BigDecimal mWeight;

    private BigDecimal mNumbers;

    private BigDecimal mWeights;

    private Integer rQuantity;

    private String rUnit;

    private Integer rNumber;

    private BigDecimal rWeight;

    private BigDecimal rNumbers;

    private BigDecimal rWeights;

    private BigDecimal dExternal;

    private String dExternalStart;

    private String dExternalEnd;

    private BigDecimal dPhysicochemical;

    private String dPhysicochemicalStart;

    private String dPhysicochemicalEnd;

    private BigDecimal dCheck;

    private String dCheckStart;

    private String dCheckEnd;

    private BigDecimal dLossless;

    private String dLosslessStart;

    private String dLosslessEnd;

    private BigDecimal dPackaging;

    private String dPackagingStart;

    private String dPackagingEnd;

    private Integer dPercent;

    private String dVerify;

    private String dCheckType;

    private String dStandards;

    private String dSupply;

    private String dFurnaceno;

    private String dHeatno;

    private String dBoxno;

    private Integer dState;

    private Integer dIssingle;

    private Integer deptid;

    private Integer isshow;

    private String dRemark;

    private static final long serialVersionUID = 1L;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdNo() {
        return dNo;
    }

    public void setdNo(String dNo) {
        this.dNo = dNo == null ? null : dNo.trim();
    }

    public Integer getdOrder() {
        return dOrder;
    }

    public void setdOrder(Integer dOrder) {
        this.dOrder = dOrder;
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno == null ? null : contractno.trim();
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdType() {
        return dType;
    }

    public void setdType(String dType) {
        this.dType = dType == null ? null : dType.trim();
    }

    public String getdSteel() {
        return dSteel;
    }

    public void setdSteel(String dSteel) {
        this.dSteel = dSteel == null ? null : dSteel.trim();
    }

    public String getdSpec() {
        return dSpec;
    }

    public void setdSpec(String dSpec) {
        this.dSpec = dSpec == null ? null : dSpec.trim();
    }

    public String getdNps() {
        return dNps;
    }

    public void setdNps(String dNps) {
        this.dNps = dNps == null ? null : dNps.trim();
    }

    public Integer getdQuantity() {
        return dQuantity;
    }

    public void setdQuantity(Integer dQuantity) {
        this.dQuantity = dQuantity;
    }

    public String getdUnit() {
        return dUnit;
    }

    public void setdUnit(String dUnit) {
        this.dUnit = dUnit == null ? null : dUnit.trim();
    }

    public Integer getdNumber() {
        return dNumber;
    }

    public void setdNumber(Integer dNumber) {
        this.dNumber = dNumber;
    }

    public BigDecimal getdWeight() {
        return dWeight;
    }

    public void setdWeight(BigDecimal dWeight) {
        this.dWeight = dWeight;
    }

    public BigDecimal getdNumbers() {
        return dNumbers;
    }

    public void setdNumbers(BigDecimal dNumbers) {
        this.dNumbers = dNumbers;
    }

    public BigDecimal getdWeights() {
        return dWeights;
    }

    public void setdWeights(BigDecimal dWeights) {
        this.dWeights = dWeights;
    }

    public Integer getsQuantity() {
        return sQuantity;
    }

    public void setsQuantity(Integer sQuantity) {
        this.sQuantity = sQuantity;
    }

    public String getsUnit() {
        return sUnit;
    }

    public void setsUnit(String sUnit) {
        this.sUnit = sUnit == null ? null : sUnit.trim();
    }

    public Integer getsNumber() {
        return sNumber;
    }

    public void setsNumber(Integer sNumber) {
        this.sNumber = sNumber;
    }

    public BigDecimal getsWeight() {
        return sWeight;
    }

    public void setsWeight(BigDecimal sWeight) {
        this.sWeight = sWeight;
    }

    public BigDecimal getsNumbers() {
        return sNumbers;
    }

    public void setsNumbers(BigDecimal sNumbers) {
        this.sNumbers = sNumbers;
    }

    public BigDecimal getsWeights() {
        return sWeights;
    }

    public void setsWeights(BigDecimal sWeights) {
        this.sWeights = sWeights;
    }

    public Integer getmQuantity() {
        return mQuantity;
    }

    public void setmQuantity(Integer mQuantity) {
        this.mQuantity = mQuantity;
    }

    public String getmUnit() {
        return mUnit;
    }

    public void setmUnit(String mUnit) {
        this.mUnit = mUnit == null ? null : mUnit.trim();
    }

    public Integer getmNumber() {
        return mNumber;
    }

    public void setmNumber(Integer mNumber) {
        this.mNumber = mNumber;
    }

    public BigDecimal getmWeight() {
        return mWeight;
    }

    public void setmWeight(BigDecimal mWeight) {
        this.mWeight = mWeight;
    }

    public BigDecimal getmNumbers() {
        return mNumbers;
    }

    public void setmNumbers(BigDecimal mNumbers) {
        this.mNumbers = mNumbers;
    }

    public BigDecimal getmWeights() {
        return mWeights;
    }

    public void setmWeights(BigDecimal mWeights) {
        this.mWeights = mWeights;
    }

    public Integer getrQuantity() {
        return rQuantity;
    }

    public void setrQuantity(Integer rQuantity) {
        this.rQuantity = rQuantity;
    }

    public String getrUnit() {
        return rUnit;
    }

    public void setrUnit(String rUnit) {
        this.rUnit = rUnit == null ? null : rUnit.trim();
    }

    public Integer getrNumber() {
        return rNumber;
    }

    public void setrNumber(Integer rNumber) {
        this.rNumber = rNumber;
    }

    public BigDecimal getrWeight() {
        return rWeight;
    }

    public void setrWeight(BigDecimal rWeight) {
        this.rWeight = rWeight;
    }

    public BigDecimal getrNumbers() {
        return rNumbers;
    }

    public void setrNumbers(BigDecimal rNumbers) {
        this.rNumbers = rNumbers;
    }

    public BigDecimal getrWeights() {
        return rWeights;
    }

    public void setrWeights(BigDecimal rWeights) {
        this.rWeights = rWeights;
    }

    public BigDecimal getdExternal() {
        return dExternal;
    }

    public void setdExternal(BigDecimal dExternal) {
        this.dExternal = dExternal;
    }

    public String getdExternalStart() {
        return dExternalStart;
    }

    public void setdExternalStart(String dExternalStart) {
        this.dExternalStart = dExternalStart == null ? null : dExternalStart.trim();
    }

    public String getdExternalEnd() {
        return dExternalEnd;
    }

    public void setdExternalEnd(String dExternalEnd) {
        this.dExternalEnd = dExternalEnd == null ? null : dExternalEnd.trim();
    }

    public BigDecimal getdPhysicochemical() {
        return dPhysicochemical;
    }

    public void setdPhysicochemical(BigDecimal dPhysicochemical) {
        this.dPhysicochemical = dPhysicochemical;
    }

    public String getdPhysicochemicalStart() {
        return dPhysicochemicalStart;
    }

    public void setdPhysicochemicalStart(String dPhysicochemicalStart) {
        this.dPhysicochemicalStart = dPhysicochemicalStart == null ? null : dPhysicochemicalStart.trim();
    }

    public String getdPhysicochemicalEnd() {
        return dPhysicochemicalEnd;
    }

    public void setdPhysicochemicalEnd(String dPhysicochemicalEnd) {
        this.dPhysicochemicalEnd = dPhysicochemicalEnd == null ? null : dPhysicochemicalEnd.trim();
    }

    public BigDecimal getdCheck() {
        return dCheck;
    }

    public void setdCheck(BigDecimal dCheck) {
        this.dCheck = dCheck;
    }

    public String getdCheckStart() {
        return dCheckStart;
    }

    public void setdCheckStart(String dCheckStart) {
        this.dCheckStart = dCheckStart == null ? null : dCheckStart.trim();
    }

    public String getdCheckEnd() {
        return dCheckEnd;
    }

    public void setdCheckEnd(String dCheckEnd) {
        this.dCheckEnd = dCheckEnd == null ? null : dCheckEnd.trim();
    }

    public BigDecimal getdLossless() {
        return dLossless;
    }

    public void setdLossless(BigDecimal dLossless) {
        this.dLossless = dLossless;
    }

    public String getdLosslessStart() {
        return dLosslessStart;
    }

    public void setdLosslessStart(String dLosslessStart) {
        this.dLosslessStart = dLosslessStart == null ? null : dLosslessStart.trim();
    }

    public String getdLosslessEnd() {
        return dLosslessEnd;
    }

    public void setdLosslessEnd(String dLosslessEnd) {
        this.dLosslessEnd = dLosslessEnd == null ? null : dLosslessEnd.trim();
    }

    public BigDecimal getdPackaging() {
        return dPackaging;
    }

    public void setdPackaging(BigDecimal dPackaging) {
        this.dPackaging = dPackaging;
    }

    public String getdPackagingStart() {
        return dPackagingStart;
    }

    public void setdPackagingStart(String dPackagingStart) {
        this.dPackagingStart = dPackagingStart == null ? null : dPackagingStart.trim();
    }

    public String getdPackagingEnd() {
        return dPackagingEnd;
    }

    public void setdPackagingEnd(String dPackagingEnd) {
        this.dPackagingEnd = dPackagingEnd == null ? null : dPackagingEnd.trim();
    }

    public Integer getdPercent() {
        return dPercent;
    }

    public void setdPercent(Integer dPercent) {
        this.dPercent = dPercent;
    }

    public String getdVerify() {
        return dVerify;
    }

    public void setdVerify(String dVerify) {
        this.dVerify = dVerify == null ? null : dVerify.trim();
    }

    public String getdCheckType() {
        return dCheckType;
    }

    public void setdCheckType(String dCheckType) {
        this.dCheckType = dCheckType == null ? null : dCheckType.trim();
    }

    public String getdStandards() {
        return dStandards;
    }

    public void setdStandards(String dStandards) {
        this.dStandards = dStandards == null ? null : dStandards.trim();
    }

    public String getdSupply() {
        return dSupply;
    }

    public void setdSupply(String dSupply) {
        this.dSupply = dSupply == null ? null : dSupply.trim();
    }

    public String getdFurnaceno() {
        return dFurnaceno;
    }

    public void setdFurnaceno(String dFurnaceno) {
        this.dFurnaceno = dFurnaceno == null ? null : dFurnaceno.trim();
    }

    public String getdHeatno() {
        return dHeatno;
    }

    public void setdHeatno(String dHeatno) {
        this.dHeatno = dHeatno == null ? null : dHeatno.trim();
    }

    public String getdBoxno() {
        return dBoxno;
    }

    public void setdBoxno(String dBoxno) {
        this.dBoxno = dBoxno == null ? null : dBoxno.trim();
    }

    public Integer getdState() {
        return dState;
    }

    public void setdState(Integer dState) {
        this.dState = dState;
    }

    public Integer getdIssingle() {
        return dIssingle;
    }

    public void setdIssingle(Integer dIssingle) {
        this.dIssingle = dIssingle;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public String getdRemark() {
        return dRemark;
    }

    public void setdRemark(String dRemark) {
        this.dRemark = dRemark == null ? null : dRemark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dId=").append(dId);
        sb.append(", dNo=").append(dNo);
        sb.append(", dOrder=").append(dOrder);
        sb.append(", contractno=").append(contractno);
        sb.append(", dName=").append(dName);
        sb.append(", dType=").append(dType);
        sb.append(", dSteel=").append(dSteel);
        sb.append(", dSpec=").append(dSpec);
        sb.append(", dNps=").append(dNps);
        sb.append(", dQuantity=").append(dQuantity);
        sb.append(", dUnit=").append(dUnit);
        sb.append(", dNumber=").append(dNumber);
        sb.append(", dWeight=").append(dWeight);
        sb.append(", dNumbers=").append(dNumbers);
        sb.append(", dWeights=").append(dWeights);
        sb.append(", sQuantity=").append(sQuantity);
        sb.append(", sUnit=").append(sUnit);
        sb.append(", sNumber=").append(sNumber);
        sb.append(", sWeight=").append(sWeight);
        sb.append(", sNumbers=").append(sNumbers);
        sb.append(", sWeights=").append(sWeights);
        sb.append(", mQuantity=").append(mQuantity);
        sb.append(", mUnit=").append(mUnit);
        sb.append(", mNumber=").append(mNumber);
        sb.append(", mWeight=").append(mWeight);
        sb.append(", mNumbers=").append(mNumbers);
        sb.append(", mWeights=").append(mWeights);
        sb.append(", rQuantity=").append(rQuantity);
        sb.append(", rUnit=").append(rUnit);
        sb.append(", rNumber=").append(rNumber);
        sb.append(", rWeight=").append(rWeight);
        sb.append(", rNumbers=").append(rNumbers);
        sb.append(", rWeights=").append(rWeights);
        sb.append(", dExternal=").append(dExternal);
        sb.append(", dExternalStart=").append(dExternalStart);
        sb.append(", dExternalEnd=").append(dExternalEnd);
        sb.append(", dPhysicochemical=").append(dPhysicochemical);
        sb.append(", dPhysicochemicalStart=").append(dPhysicochemicalStart);
        sb.append(", dPhysicochemicalEnd=").append(dPhysicochemicalEnd);
        sb.append(", dCheck=").append(dCheck);
        sb.append(", dCheckStart=").append(dCheckStart);
        sb.append(", dCheckEnd=").append(dCheckEnd);
        sb.append(", dLossless=").append(dLossless);
        sb.append(", dLosslessStart=").append(dLosslessStart);
        sb.append(", dLosslessEnd=").append(dLosslessEnd);
        sb.append(", dPackaging=").append(dPackaging);
        sb.append(", dPackagingStart=").append(dPackagingStart);
        sb.append(", dPackagingEnd=").append(dPackagingEnd);
        sb.append(", dPercent=").append(dPercent);
        sb.append(", dVerify=").append(dVerify);
        sb.append(", dCheckType=").append(dCheckType);
        sb.append(", dStandards=").append(dStandards);
        sb.append(", dSupply=").append(dSupply);
        sb.append(", dFurnaceno=").append(dFurnaceno);
        sb.append(", dHeatno=").append(dHeatno);
        sb.append(", dBoxno=").append(dBoxno);
        sb.append(", dState=").append(dState);
        sb.append(", dIssingle=").append(dIssingle);
        sb.append(", deptid=").append(deptid);
        sb.append(", isshow=").append(isshow);
        sb.append(", dRemark=").append(dRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}