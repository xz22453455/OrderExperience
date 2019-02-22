package com.sss.oem.domain.entity;

import java.io.Serializable;

public class DeliverySchedulesWithBLOBs extends DeliverySchedules implements Serializable {
    private String specialRequirements;

    private String spraywordRequirements;

    private String packageRequirementsext;

    private String tolerances;

    private String settlementext;

    private String dUrgencytext;

    private static final long serialVersionUID = 1L;

    public String getSpecialRequirements() {
        return specialRequirements;
    }

    public void setSpecialRequirements(String specialRequirements) {
        this.specialRequirements = specialRequirements == null ? null : specialRequirements.trim();
    }

    public String getSpraywordRequirements() {
        return spraywordRequirements;
    }

    public void setSpraywordRequirements(String spraywordRequirements) {
        this.spraywordRequirements = spraywordRequirements == null ? null : spraywordRequirements.trim();
    }

    public String getPackageRequirementsext() {
        return packageRequirementsext;
    }

    public void setPackageRequirementsext(String packageRequirementsext) {
        this.packageRequirementsext = packageRequirementsext == null ? null : packageRequirementsext.trim();
    }

    public String getTolerances() {
        return tolerances;
    }

    public void setTolerances(String tolerances) {
        this.tolerances = tolerances == null ? null : tolerances.trim();
    }

    public String getSettlementext() {
        return settlementext;
    }

    public void setSettlementext(String settlementext) {
        this.settlementext = settlementext == null ? null : settlementext.trim();
    }

    public String getdUrgencytext() {
        return dUrgencytext;
    }

    public void setdUrgencytext(String dUrgencytext) {
        this.dUrgencytext = dUrgencytext == null ? null : dUrgencytext.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", specialRequirements=").append(specialRequirements);
        sb.append(", spraywordRequirements=").append(spraywordRequirements);
        sb.append(", packageRequirementsext=").append(packageRequirementsext);
        sb.append(", tolerances=").append(tolerances);
        sb.append(", settlementext=").append(settlementext);
        sb.append(", dUrgencytext=").append(dUrgencytext);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}