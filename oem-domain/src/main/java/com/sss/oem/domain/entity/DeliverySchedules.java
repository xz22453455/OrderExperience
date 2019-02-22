package com.sss.oem.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeliverySchedules implements Serializable {
    private Integer dId;

    private String dNo;

    private String dSource;

    private String dCustomerno;

    private String dContractno;

    private String deliverydate;

    private String orderdate;

    private String packageRequirements;

    private ViewWmsOperation vwo;

    private String settlement;

    private Integer dState;

    private String dCreate;

    private String dCreatedate;

    private String dAudting;

    private String dAudtingdate;

    private Integer dUrgency;

    private Integer deptid;

    private String usercode;

    private String planDate;

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

    public String getdSource() {
        return dSource;
    }

    public void setdSource(String dSource) {
        this.dSource = dSource == null ? null : dSource.trim();
    }

    public String getdCustomerno() {
        return dCustomerno;
    }

    public void setdCustomerno(String dCustomerno) {
        this.dCustomerno = dCustomerno == null ? null : dCustomerno.trim();
    }

    public String getdContractno() {
        return dContractno;
    }

    public void setdContractno(String dContractno) {
        this.dContractno = dContractno == null ? null : dContractno.trim();
    }

    public String getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(String deliverydate) {
        this.deliverydate = deliverydate == null ? null : deliverydate.trim();
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate == null ? null : orderdate.trim();
    }

    public String getPackageRequirements() {
        return packageRequirements;
    }

    public void setPackageRequirements(String packageRequirements) {
        this.packageRequirements = packageRequirements == null ? null : packageRequirements.trim();
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement == null ? null : settlement.trim();
    }

    public Integer getdState() {
        return dState;
    }

    public void setdState(Integer dState) {
        this.dState = dState;
    }

    public String getdCreate() {
        return dCreate;
    }

    public void setdCreate(String dCreate) {
        this.dCreate = dCreate == null ? null : dCreate.trim();
    }

    public String getdCreatedate() {
        return dCreatedate;
    }

    public void setdCreatedate(String dCreatedate) {
        this.dCreatedate = dCreatedate == null ? null : dCreatedate.trim();
    }

    public String getdAudting() {
        return dAudting;
    }

    public void setdAudting(String dAudting) {
        this.dAudting = dAudting == null ? null : dAudting.trim();
    }

    public String getdAudtingdate() {
        return dAudtingdate;
    }

    public void setdAudtingdate(String dAudtingdate) {
        this.dAudtingdate = dAudtingdate == null ? null : dAudtingdate.trim();
    }

    public Integer getdUrgency() {
        return dUrgency;
    }

    public void setdUrgency(Integer dUrgency) {
        this.dUrgency = dUrgency;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String planDate) {
        this.planDate = planDate == null ? null : planDate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dId=").append(dId);
        sb.append(", dNo=").append(dNo);
        sb.append(", dSource=").append(dSource);
        sb.append(", dCustomerno=").append(dCustomerno);
        sb.append(", dContractno=").append(dContractno);
        sb.append(", deliverydate=").append(deliverydate);
        sb.append(", orderdate=").append(orderdate);
        sb.append(", packageRequirements=").append(packageRequirements);
        sb.append(", settlement=").append(settlement);
        sb.append(", dState=").append(dState);
        sb.append(", dCreate=").append(dCreate);
        sb.append(", dCreatedate=").append(dCreatedate);
        sb.append(", dAudting=").append(dAudting);
        sb.append(", dAudtingdate=").append(dAudtingdate);
        sb.append(", dUrgency=").append(dUrgency);
        sb.append(", deptid=").append(deptid);
        sb.append(", usercode=").append(usercode);
        sb.append(", planDate=").append(planDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}