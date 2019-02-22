package com.sss.oem.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class ViewWmsOperation implements Serializable {
    private Integer dId;

    private Integer tType;

    private String dParentid;

    private String parentid;

    private String contractno;

    private String proNo;

    private String proName;

    private String dType;

    private String dSteel;

    private String dSpec;

    private String dFurnaceno;

    private String dUnit;

    private Integer dQuantity;

    private BigDecimal dWeight;

    private BigDecimal dNumbers;

    private String warehousecode;

    private String bincode;

    private String dCreate;

    private String dCreatedate;

    private String dBarcode;

    private String dRfid;

    private String binname;

    private String warehousename;

    private String dStandards;

    private static final long serialVersionUID = 1L;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer gettType() {
        return tType;
    }

    public void settType(Integer tType) {
        this.tType = tType;
    }

    public String getdParentid() {
        return dParentid;
    }

    public void setdParentid(String dParentid) {
        this.dParentid = dParentid == null ? null : dParentid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno == null ? null : contractno.trim();
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo == null ? null : proNo.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
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

    public String getdFurnaceno() {
        return dFurnaceno;
    }

    public void setdFurnaceno(String dFurnaceno) {
        this.dFurnaceno = dFurnaceno == null ? null : dFurnaceno.trim();
    }

    public String getdUnit() {
        return dUnit;
    }

    public void setdUnit(String dUnit) {
        this.dUnit = dUnit == null ? null : dUnit.trim();
    }

    public Integer getdQuantity() {
        return dQuantity;
    }

    public void setdQuantity(Integer dQuantity) {
        this.dQuantity = dQuantity;
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

    public String getWarehousecode() {
        return warehousecode;
    }

    public void setWarehousecode(String warehousecode) {
        this.warehousecode = warehousecode == null ? null : warehousecode.trim();
    }

    public String getBincode() {
        return bincode;
    }

    public void setBincode(String bincode) {
        this.bincode = bincode == null ? null : bincode.trim();
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

    public String getdBarcode() {
        return dBarcode;
    }

    public void setdBarcode(String dBarcode) {
        this.dBarcode = dBarcode == null ? null : dBarcode.trim();
    }

    public String getdRfid() {
        return dRfid;
    }

    public void setdRfid(String dRfid) {
        this.dRfid = dRfid == null ? null : dRfid.trim();
    }

    public String getBinname() {
        return binname;
    }

    public void setBinname(String binname) {
        this.binname = binname == null ? null : binname.trim();
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename == null ? null : warehousename.trim();
    }

    public String getdStandards() {
        return dStandards;
    }

    public void setdStandards(String dStandards) {
        this.dStandards = dStandards == null ? null : dStandards.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dId=").append(dId);
        sb.append(", tType=").append(tType);
        sb.append(", dParentid=").append(dParentid);
        sb.append(", parentid=").append(parentid);
        sb.append(", contractno=").append(contractno);
        sb.append(", proNo=").append(proNo);
        sb.append(", proName=").append(proName);
        sb.append(", dType=").append(dType);
        sb.append(", dSteel=").append(dSteel);
        sb.append(", dSpec=").append(dSpec);
        sb.append(", dFurnaceno=").append(dFurnaceno);
        sb.append(", dUnit=").append(dUnit);
        sb.append(", dQuantity=").append(dQuantity);
        sb.append(", dWeight=").append(dWeight);
        sb.append(", dNumbers=").append(dNumbers);
        sb.append(", warehousecode=").append(warehousecode);
        sb.append(", bincode=").append(bincode);
        sb.append(", dCreate=").append(dCreate);
        sb.append(", dCreatedate=").append(dCreatedate);
        sb.append(", dBarcode=").append(dBarcode);
        sb.append(", dRfid=").append(dRfid);
        sb.append(", binname=").append(binname);
        sb.append(", warehousename=").append(warehousename);
        sb.append(", dStandards=").append(dStandards);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}