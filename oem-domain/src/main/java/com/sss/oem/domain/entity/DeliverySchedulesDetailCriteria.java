package com.sss.oem.domain.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DeliverySchedulesDetailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverySchedulesDetailCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDIdIsNull() {
            addCriterion("D_Id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("D_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("D_Id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("D_Id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("D_Id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_Id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("D_Id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("D_Id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("D_Id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("D_Id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("D_Id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("D_Id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNoIsNull() {
            addCriterion("D_No is null");
            return (Criteria) this;
        }

        public Criteria andDNoIsNotNull() {
            addCriterion("D_No is not null");
            return (Criteria) this;
        }

        public Criteria andDNoEqualTo(String value) {
            addCriterion("D_No =", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoNotEqualTo(String value) {
            addCriterion("D_No <>", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoGreaterThan(String value) {
            addCriterion("D_No >", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoGreaterThanOrEqualTo(String value) {
            addCriterion("D_No >=", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoLessThan(String value) {
            addCriterion("D_No <", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoLessThanOrEqualTo(String value) {
            addCriterion("D_No <=", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoLike(String value) {
            addCriterion("D_No like", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoNotLike(String value) {
            addCriterion("D_No not like", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoIn(List<String> values) {
            addCriterion("D_No in", values, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoNotIn(List<String> values) {
            addCriterion("D_No not in", values, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoBetween(String value1, String value2) {
            addCriterion("D_No between", value1, value2, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoNotBetween(String value1, String value2) {
            addCriterion("D_No not between", value1, value2, "dNo");
            return (Criteria) this;
        }

        public Criteria andDOrderIsNull() {
            addCriterion("D_Order is null");
            return (Criteria) this;
        }

        public Criteria andDOrderIsNotNull() {
            addCriterion("D_Order is not null");
            return (Criteria) this;
        }

        public Criteria andDOrderEqualTo(Integer value) {
            addCriterion("D_Order =", value, "dOrder");
            return (Criteria) this;
        }

        public Criteria andDOrderNotEqualTo(Integer value) {
            addCriterion("D_Order <>", value, "dOrder");
            return (Criteria) this;
        }

        public Criteria andDOrderGreaterThan(Integer value) {
            addCriterion("D_Order >", value, "dOrder");
            return (Criteria) this;
        }

        public Criteria andDOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_Order >=", value, "dOrder");
            return (Criteria) this;
        }

        public Criteria andDOrderLessThan(Integer value) {
            addCriterion("D_Order <", value, "dOrder");
            return (Criteria) this;
        }

        public Criteria andDOrderLessThanOrEqualTo(Integer value) {
            addCriterion("D_Order <=", value, "dOrder");
            return (Criteria) this;
        }

        public Criteria andDOrderIn(List<Integer> values) {
            addCriterion("D_Order in", values, "dOrder");
            return (Criteria) this;
        }

        public Criteria andDOrderNotIn(List<Integer> values) {
            addCriterion("D_Order not in", values, "dOrder");
            return (Criteria) this;
        }

        public Criteria andDOrderBetween(Integer value1, Integer value2) {
            addCriterion("D_Order between", value1, value2, "dOrder");
            return (Criteria) this;
        }

        public Criteria andDOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("D_Order not between", value1, value2, "dOrder");
            return (Criteria) this;
        }

        public Criteria andContractnoIsNull() {
            addCriterion("ContractNo is null");
            return (Criteria) this;
        }

        public Criteria andContractnoIsNotNull() {
            addCriterion("ContractNo is not null");
            return (Criteria) this;
        }

        public Criteria andContractnoEqualTo(String value) {
            addCriterion("ContractNo =", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotEqualTo(String value) {
            addCriterion("ContractNo <>", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThan(String value) {
            addCriterion("ContractNo >", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThanOrEqualTo(String value) {
            addCriterion("ContractNo >=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThan(String value) {
            addCriterion("ContractNo <", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThanOrEqualTo(String value) {
            addCriterion("ContractNo <=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLike(String value) {
            addCriterion("ContractNo like", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotLike(String value) {
            addCriterion("ContractNo not like", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoIn(List<String> values) {
            addCriterion("ContractNo in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotIn(List<String> values) {
            addCriterion("ContractNo not in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoBetween(String value1, String value2) {
            addCriterion("ContractNo between", value1, value2, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotBetween(String value1, String value2) {
            addCriterion("ContractNo not between", value1, value2, "contractno");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("D_Name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("D_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("D_Name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("D_Name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("D_Name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("D_Name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("D_Name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("D_Name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("D_Name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("D_Name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("D_Name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("D_Name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("D_Name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("D_Name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNull() {
            addCriterion("D_Type is null");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNotNull() {
            addCriterion("D_Type is not null");
            return (Criteria) this;
        }

        public Criteria andDTypeEqualTo(String value) {
            addCriterion("D_Type =", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotEqualTo(String value) {
            addCriterion("D_Type <>", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThan(String value) {
            addCriterion("D_Type >", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThanOrEqualTo(String value) {
            addCriterion("D_Type >=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThan(String value) {
            addCriterion("D_Type <", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThanOrEqualTo(String value) {
            addCriterion("D_Type <=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLike(String value) {
            addCriterion("D_Type like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotLike(String value) {
            addCriterion("D_Type not like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeIn(List<String> values) {
            addCriterion("D_Type in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotIn(List<String> values) {
            addCriterion("D_Type not in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeBetween(String value1, String value2) {
            addCriterion("D_Type between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotBetween(String value1, String value2) {
            addCriterion("D_Type not between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDSteelIsNull() {
            addCriterion("D_Steel is null");
            return (Criteria) this;
        }

        public Criteria andDSteelIsNotNull() {
            addCriterion("D_Steel is not null");
            return (Criteria) this;
        }

        public Criteria andDSteelEqualTo(String value) {
            addCriterion("D_Steel =", value, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSteelNotEqualTo(String value) {
            addCriterion("D_Steel <>", value, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSteelGreaterThan(String value) {
            addCriterion("D_Steel >", value, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSteelGreaterThanOrEqualTo(String value) {
            addCriterion("D_Steel >=", value, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSteelLessThan(String value) {
            addCriterion("D_Steel <", value, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSteelLessThanOrEqualTo(String value) {
            addCriterion("D_Steel <=", value, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSteelLike(String value) {
            addCriterion("D_Steel like", value, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSteelNotLike(String value) {
            addCriterion("D_Steel not like", value, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSteelIn(List<String> values) {
            addCriterion("D_Steel in", values, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSteelNotIn(List<String> values) {
            addCriterion("D_Steel not in", values, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSteelBetween(String value1, String value2) {
            addCriterion("D_Steel between", value1, value2, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSteelNotBetween(String value1, String value2) {
            addCriterion("D_Steel not between", value1, value2, "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSpecIsNull() {
            addCriterion("D_Spec is null");
            return (Criteria) this;
        }

        public Criteria andDSpecIsNotNull() {
            addCriterion("D_Spec is not null");
            return (Criteria) this;
        }

        public Criteria andDSpecEqualTo(String value) {
            addCriterion("D_Spec =", value, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDSpecNotEqualTo(String value) {
            addCriterion("D_Spec <>", value, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDSpecGreaterThan(String value) {
            addCriterion("D_Spec >", value, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDSpecGreaterThanOrEqualTo(String value) {
            addCriterion("D_Spec >=", value, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDSpecLessThan(String value) {
            addCriterion("D_Spec <", value, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDSpecLessThanOrEqualTo(String value) {
            addCriterion("D_Spec <=", value, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDSpecLike(String value) {
            addCriterion("D_Spec like", value, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDSpecNotLike(String value) {
            addCriterion("D_Spec not like", value, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDSpecIn(List<String> values) {
            addCriterion("D_Spec in", values, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDSpecNotIn(List<String> values) {
            addCriterion("D_Spec not in", values, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDSpecBetween(String value1, String value2) {
            addCriterion("D_Spec between", value1, value2, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDSpecNotBetween(String value1, String value2) {
            addCriterion("D_Spec not between", value1, value2, "dSpec");
            return (Criteria) this;
        }

        public Criteria andDNpsIsNull() {
            addCriterion("D_NPS is null");
            return (Criteria) this;
        }

        public Criteria andDNpsIsNotNull() {
            addCriterion("D_NPS is not null");
            return (Criteria) this;
        }

        public Criteria andDNpsEqualTo(String value) {
            addCriterion("D_NPS =", value, "dNps");
            return (Criteria) this;
        }

        public Criteria andDNpsNotEqualTo(String value) {
            addCriterion("D_NPS <>", value, "dNps");
            return (Criteria) this;
        }

        public Criteria andDNpsGreaterThan(String value) {
            addCriterion("D_NPS >", value, "dNps");
            return (Criteria) this;
        }

        public Criteria andDNpsGreaterThanOrEqualTo(String value) {
            addCriterion("D_NPS >=", value, "dNps");
            return (Criteria) this;
        }

        public Criteria andDNpsLessThan(String value) {
            addCriterion("D_NPS <", value, "dNps");
            return (Criteria) this;
        }

        public Criteria andDNpsLessThanOrEqualTo(String value) {
            addCriterion("D_NPS <=", value, "dNps");
            return (Criteria) this;
        }

        public Criteria andDNpsLike(String value) {
            addCriterion("D_NPS like", value, "dNps");
            return (Criteria) this;
        }

        public Criteria andDNpsNotLike(String value) {
            addCriterion("D_NPS not like", value, "dNps");
            return (Criteria) this;
        }

        public Criteria andDNpsIn(List<String> values) {
            addCriterion("D_NPS in", values, "dNps");
            return (Criteria) this;
        }

        public Criteria andDNpsNotIn(List<String> values) {
            addCriterion("D_NPS not in", values, "dNps");
            return (Criteria) this;
        }

        public Criteria andDNpsBetween(String value1, String value2) {
            addCriterion("D_NPS between", value1, value2, "dNps");
            return (Criteria) this;
        }

        public Criteria andDNpsNotBetween(String value1, String value2) {
            addCriterion("D_NPS not between", value1, value2, "dNps");
            return (Criteria) this;
        }

        public Criteria andDQuantityIsNull() {
            addCriterion("D_Quantity is null");
            return (Criteria) this;
        }

        public Criteria andDQuantityIsNotNull() {
            addCriterion("D_Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andDQuantityEqualTo(Integer value) {
            addCriterion("D_Quantity =", value, "dQuantity");
            return (Criteria) this;
        }

        public Criteria andDQuantityNotEqualTo(Integer value) {
            addCriterion("D_Quantity <>", value, "dQuantity");
            return (Criteria) this;
        }

        public Criteria andDQuantityGreaterThan(Integer value) {
            addCriterion("D_Quantity >", value, "dQuantity");
            return (Criteria) this;
        }

        public Criteria andDQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_Quantity >=", value, "dQuantity");
            return (Criteria) this;
        }

        public Criteria andDQuantityLessThan(Integer value) {
            addCriterion("D_Quantity <", value, "dQuantity");
            return (Criteria) this;
        }

        public Criteria andDQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("D_Quantity <=", value, "dQuantity");
            return (Criteria) this;
        }

        public Criteria andDQuantityIn(List<Integer> values) {
            addCriterion("D_Quantity in", values, "dQuantity");
            return (Criteria) this;
        }

        public Criteria andDQuantityNotIn(List<Integer> values) {
            addCriterion("D_Quantity not in", values, "dQuantity");
            return (Criteria) this;
        }

        public Criteria andDQuantityBetween(Integer value1, Integer value2) {
            addCriterion("D_Quantity between", value1, value2, "dQuantity");
            return (Criteria) this;
        }

        public Criteria andDQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("D_Quantity not between", value1, value2, "dQuantity");
            return (Criteria) this;
        }

        public Criteria andDUnitIsNull() {
            addCriterion("D_Unit is null");
            return (Criteria) this;
        }

        public Criteria andDUnitIsNotNull() {
            addCriterion("D_Unit is not null");
            return (Criteria) this;
        }

        public Criteria andDUnitEqualTo(String value) {
            addCriterion("D_Unit =", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitNotEqualTo(String value) {
            addCriterion("D_Unit <>", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitGreaterThan(String value) {
            addCriterion("D_Unit >", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitGreaterThanOrEqualTo(String value) {
            addCriterion("D_Unit >=", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitLessThan(String value) {
            addCriterion("D_Unit <", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitLessThanOrEqualTo(String value) {
            addCriterion("D_Unit <=", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitLike(String value) {
            addCriterion("D_Unit like", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitNotLike(String value) {
            addCriterion("D_Unit not like", value, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitIn(List<String> values) {
            addCriterion("D_Unit in", values, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitNotIn(List<String> values) {
            addCriterion("D_Unit not in", values, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitBetween(String value1, String value2) {
            addCriterion("D_Unit between", value1, value2, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDUnitNotBetween(String value1, String value2) {
            addCriterion("D_Unit not between", value1, value2, "dUnit");
            return (Criteria) this;
        }

        public Criteria andDNumberIsNull() {
            addCriterion("D_Number is null");
            return (Criteria) this;
        }

        public Criteria andDNumberIsNotNull() {
            addCriterion("D_Number is not null");
            return (Criteria) this;
        }

        public Criteria andDNumberEqualTo(Integer value) {
            addCriterion("D_Number =", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberNotEqualTo(Integer value) {
            addCriterion("D_Number <>", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberGreaterThan(Integer value) {
            addCriterion("D_Number >", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_Number >=", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberLessThan(Integer value) {
            addCriterion("D_Number <", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberLessThanOrEqualTo(Integer value) {
            addCriterion("D_Number <=", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberIn(List<Integer> values) {
            addCriterion("D_Number in", values, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberNotIn(List<Integer> values) {
            addCriterion("D_Number not in", values, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberBetween(Integer value1, Integer value2) {
            addCriterion("D_Number between", value1, value2, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("D_Number not between", value1, value2, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDWeightIsNull() {
            addCriterion("D_Weight is null");
            return (Criteria) this;
        }

        public Criteria andDWeightIsNotNull() {
            addCriterion("D_Weight is not null");
            return (Criteria) this;
        }

        public Criteria andDWeightEqualTo(BigDecimal value) {
            addCriterion("D_Weight =", value, "dWeight");
            return (Criteria) this;
        }

        public Criteria andDWeightNotEqualTo(BigDecimal value) {
            addCriterion("D_Weight <>", value, "dWeight");
            return (Criteria) this;
        }

        public Criteria andDWeightGreaterThan(BigDecimal value) {
            addCriterion("D_Weight >", value, "dWeight");
            return (Criteria) this;
        }

        public Criteria andDWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("D_Weight >=", value, "dWeight");
            return (Criteria) this;
        }

        public Criteria andDWeightLessThan(BigDecimal value) {
            addCriterion("D_Weight <", value, "dWeight");
            return (Criteria) this;
        }

        public Criteria andDWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("D_Weight <=", value, "dWeight");
            return (Criteria) this;
        }

        public Criteria andDWeightIn(List<BigDecimal> values) {
            addCriterion("D_Weight in", values, "dWeight");
            return (Criteria) this;
        }

        public Criteria andDWeightNotIn(List<BigDecimal> values) {
            addCriterion("D_Weight not in", values, "dWeight");
            return (Criteria) this;
        }

        public Criteria andDWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_Weight between", value1, value2, "dWeight");
            return (Criteria) this;
        }

        public Criteria andDWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_Weight not between", value1, value2, "dWeight");
            return (Criteria) this;
        }

        public Criteria andDNumbersIsNull() {
            addCriterion("D_Numbers is null");
            return (Criteria) this;
        }

        public Criteria andDNumbersIsNotNull() {
            addCriterion("D_Numbers is not null");
            return (Criteria) this;
        }

        public Criteria andDNumbersEqualTo(BigDecimal value) {
            addCriterion("D_Numbers =", value, "dNumbers");
            return (Criteria) this;
        }

        public Criteria andDNumbersNotEqualTo(BigDecimal value) {
            addCriterion("D_Numbers <>", value, "dNumbers");
            return (Criteria) this;
        }

        public Criteria andDNumbersGreaterThan(BigDecimal value) {
            addCriterion("D_Numbers >", value, "dNumbers");
            return (Criteria) this;
        }

        public Criteria andDNumbersGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("D_Numbers >=", value, "dNumbers");
            return (Criteria) this;
        }

        public Criteria andDNumbersLessThan(BigDecimal value) {
            addCriterion("D_Numbers <", value, "dNumbers");
            return (Criteria) this;
        }

        public Criteria andDNumbersLessThanOrEqualTo(BigDecimal value) {
            addCriterion("D_Numbers <=", value, "dNumbers");
            return (Criteria) this;
        }

        public Criteria andDNumbersIn(List<BigDecimal> values) {
            addCriterion("D_Numbers in", values, "dNumbers");
            return (Criteria) this;
        }

        public Criteria andDNumbersNotIn(List<BigDecimal> values) {
            addCriterion("D_Numbers not in", values, "dNumbers");
            return (Criteria) this;
        }

        public Criteria andDNumbersBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_Numbers between", value1, value2, "dNumbers");
            return (Criteria) this;
        }

        public Criteria andDNumbersNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_Numbers not between", value1, value2, "dNumbers");
            return (Criteria) this;
        }

        public Criteria andDWeightsIsNull() {
            addCriterion("D_Weights is null");
            return (Criteria) this;
        }

        public Criteria andDWeightsIsNotNull() {
            addCriterion("D_Weights is not null");
            return (Criteria) this;
        }

        public Criteria andDWeightsEqualTo(BigDecimal value) {
            addCriterion("D_Weights =", value, "dWeights");
            return (Criteria) this;
        }

        public Criteria andDWeightsNotEqualTo(BigDecimal value) {
            addCriterion("D_Weights <>", value, "dWeights");
            return (Criteria) this;
        }

        public Criteria andDWeightsGreaterThan(BigDecimal value) {
            addCriterion("D_Weights >", value, "dWeights");
            return (Criteria) this;
        }

        public Criteria andDWeightsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("D_Weights >=", value, "dWeights");
            return (Criteria) this;
        }

        public Criteria andDWeightsLessThan(BigDecimal value) {
            addCriterion("D_Weights <", value, "dWeights");
            return (Criteria) this;
        }

        public Criteria andDWeightsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("D_Weights <=", value, "dWeights");
            return (Criteria) this;
        }

        public Criteria andDWeightsIn(List<BigDecimal> values) {
            addCriterion("D_Weights in", values, "dWeights");
            return (Criteria) this;
        }

        public Criteria andDWeightsNotIn(List<BigDecimal> values) {
            addCriterion("D_Weights not in", values, "dWeights");
            return (Criteria) this;
        }

        public Criteria andDWeightsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_Weights between", value1, value2, "dWeights");
            return (Criteria) this;
        }

        public Criteria andDWeightsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_Weights not between", value1, value2, "dWeights");
            return (Criteria) this;
        }

        public Criteria andSQuantityIsNull() {
            addCriterion("S_Quantity is null");
            return (Criteria) this;
        }

        public Criteria andSQuantityIsNotNull() {
            addCriterion("S_Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andSQuantityEqualTo(Integer value) {
            addCriterion("S_Quantity =", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityNotEqualTo(Integer value) {
            addCriterion("S_Quantity <>", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityGreaterThan(Integer value) {
            addCriterion("S_Quantity >", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("S_Quantity >=", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityLessThan(Integer value) {
            addCriterion("S_Quantity <", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("S_Quantity <=", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityIn(List<Integer> values) {
            addCriterion("S_Quantity in", values, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityNotIn(List<Integer> values) {
            addCriterion("S_Quantity not in", values, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityBetween(Integer value1, Integer value2) {
            addCriterion("S_Quantity between", value1, value2, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("S_Quantity not between", value1, value2, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSUnitIsNull() {
            addCriterion("S_Unit is null");
            return (Criteria) this;
        }

        public Criteria andSUnitIsNotNull() {
            addCriterion("S_Unit is not null");
            return (Criteria) this;
        }

        public Criteria andSUnitEqualTo(String value) {
            addCriterion("S_Unit =", value, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitNotEqualTo(String value) {
            addCriterion("S_Unit <>", value, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitGreaterThan(String value) {
            addCriterion("S_Unit >", value, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitGreaterThanOrEqualTo(String value) {
            addCriterion("S_Unit >=", value, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitLessThan(String value) {
            addCriterion("S_Unit <", value, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitLessThanOrEqualTo(String value) {
            addCriterion("S_Unit <=", value, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitLike(String value) {
            addCriterion("S_Unit like", value, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitNotLike(String value) {
            addCriterion("S_Unit not like", value, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitIn(List<String> values) {
            addCriterion("S_Unit in", values, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitNotIn(List<String> values) {
            addCriterion("S_Unit not in", values, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitBetween(String value1, String value2) {
            addCriterion("S_Unit between", value1, value2, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitNotBetween(String value1, String value2) {
            addCriterion("S_Unit not between", value1, value2, "sUnit");
            return (Criteria) this;
        }

        public Criteria andSNumberIsNull() {
            addCriterion("S_Number is null");
            return (Criteria) this;
        }

        public Criteria andSNumberIsNotNull() {
            addCriterion("S_Number is not null");
            return (Criteria) this;
        }

        public Criteria andSNumberEqualTo(Integer value) {
            addCriterion("S_Number =", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotEqualTo(Integer value) {
            addCriterion("S_Number <>", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThan(Integer value) {
            addCriterion("S_Number >", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("S_Number >=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThan(Integer value) {
            addCriterion("S_Number <", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThanOrEqualTo(Integer value) {
            addCriterion("S_Number <=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberIn(List<Integer> values) {
            addCriterion("S_Number in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotIn(List<Integer> values) {
            addCriterion("S_Number not in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberBetween(Integer value1, Integer value2) {
            addCriterion("S_Number between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("S_Number not between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSWeightIsNull() {
            addCriterion("S_Weight is null");
            return (Criteria) this;
        }

        public Criteria andSWeightIsNotNull() {
            addCriterion("S_Weight is not null");
            return (Criteria) this;
        }

        public Criteria andSWeightEqualTo(BigDecimal value) {
            addCriterion("S_Weight =", value, "sWeight");
            return (Criteria) this;
        }

        public Criteria andSWeightNotEqualTo(BigDecimal value) {
            addCriterion("S_Weight <>", value, "sWeight");
            return (Criteria) this;
        }

        public Criteria andSWeightGreaterThan(BigDecimal value) {
            addCriterion("S_Weight >", value, "sWeight");
            return (Criteria) this;
        }

        public Criteria andSWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_Weight >=", value, "sWeight");
            return (Criteria) this;
        }

        public Criteria andSWeightLessThan(BigDecimal value) {
            addCriterion("S_Weight <", value, "sWeight");
            return (Criteria) this;
        }

        public Criteria andSWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_Weight <=", value, "sWeight");
            return (Criteria) this;
        }

        public Criteria andSWeightIn(List<BigDecimal> values) {
            addCriterion("S_Weight in", values, "sWeight");
            return (Criteria) this;
        }

        public Criteria andSWeightNotIn(List<BigDecimal> values) {
            addCriterion("S_Weight not in", values, "sWeight");
            return (Criteria) this;
        }

        public Criteria andSWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_Weight between", value1, value2, "sWeight");
            return (Criteria) this;
        }

        public Criteria andSWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_Weight not between", value1, value2, "sWeight");
            return (Criteria) this;
        }

        public Criteria andSNumbersIsNull() {
            addCriterion("S_Numbers is null");
            return (Criteria) this;
        }

        public Criteria andSNumbersIsNotNull() {
            addCriterion("S_Numbers is not null");
            return (Criteria) this;
        }

        public Criteria andSNumbersEqualTo(BigDecimal value) {
            addCriterion("S_Numbers =", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersNotEqualTo(BigDecimal value) {
            addCriterion("S_Numbers <>", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersGreaterThan(BigDecimal value) {
            addCriterion("S_Numbers >", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_Numbers >=", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersLessThan(BigDecimal value) {
            addCriterion("S_Numbers <", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_Numbers <=", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersIn(List<BigDecimal> values) {
            addCriterion("S_Numbers in", values, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersNotIn(List<BigDecimal> values) {
            addCriterion("S_Numbers not in", values, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_Numbers between", value1, value2, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_Numbers not between", value1, value2, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSWeightsIsNull() {
            addCriterion("S_Weights is null");
            return (Criteria) this;
        }

        public Criteria andSWeightsIsNotNull() {
            addCriterion("S_Weights is not null");
            return (Criteria) this;
        }

        public Criteria andSWeightsEqualTo(BigDecimal value) {
            addCriterion("S_Weights =", value, "sWeights");
            return (Criteria) this;
        }

        public Criteria andSWeightsNotEqualTo(BigDecimal value) {
            addCriterion("S_Weights <>", value, "sWeights");
            return (Criteria) this;
        }

        public Criteria andSWeightsGreaterThan(BigDecimal value) {
            addCriterion("S_Weights >", value, "sWeights");
            return (Criteria) this;
        }

        public Criteria andSWeightsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_Weights >=", value, "sWeights");
            return (Criteria) this;
        }

        public Criteria andSWeightsLessThan(BigDecimal value) {
            addCriterion("S_Weights <", value, "sWeights");
            return (Criteria) this;
        }

        public Criteria andSWeightsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_Weights <=", value, "sWeights");
            return (Criteria) this;
        }

        public Criteria andSWeightsIn(List<BigDecimal> values) {
            addCriterion("S_Weights in", values, "sWeights");
            return (Criteria) this;
        }

        public Criteria andSWeightsNotIn(List<BigDecimal> values) {
            addCriterion("S_Weights not in", values, "sWeights");
            return (Criteria) this;
        }

        public Criteria andSWeightsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_Weights between", value1, value2, "sWeights");
            return (Criteria) this;
        }

        public Criteria andSWeightsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_Weights not between", value1, value2, "sWeights");
            return (Criteria) this;
        }

        public Criteria andMQuantityIsNull() {
            addCriterion("M_Quantity is null");
            return (Criteria) this;
        }

        public Criteria andMQuantityIsNotNull() {
            addCriterion("M_Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMQuantityEqualTo(Integer value) {
            addCriterion("M_Quantity =", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityNotEqualTo(Integer value) {
            addCriterion("M_Quantity <>", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityGreaterThan(Integer value) {
            addCriterion("M_Quantity >", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_Quantity >=", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityLessThan(Integer value) {
            addCriterion("M_Quantity <", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("M_Quantity <=", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityIn(List<Integer> values) {
            addCriterion("M_Quantity in", values, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityNotIn(List<Integer> values) {
            addCriterion("M_Quantity not in", values, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityBetween(Integer value1, Integer value2) {
            addCriterion("M_Quantity between", value1, value2, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("M_Quantity not between", value1, value2, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMUnitIsNull() {
            addCriterion("M_Unit is null");
            return (Criteria) this;
        }

        public Criteria andMUnitIsNotNull() {
            addCriterion("M_Unit is not null");
            return (Criteria) this;
        }

        public Criteria andMUnitEqualTo(String value) {
            addCriterion("M_Unit =", value, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitNotEqualTo(String value) {
            addCriterion("M_Unit <>", value, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitGreaterThan(String value) {
            addCriterion("M_Unit >", value, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitGreaterThanOrEqualTo(String value) {
            addCriterion("M_Unit >=", value, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitLessThan(String value) {
            addCriterion("M_Unit <", value, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitLessThanOrEqualTo(String value) {
            addCriterion("M_Unit <=", value, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitLike(String value) {
            addCriterion("M_Unit like", value, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitNotLike(String value) {
            addCriterion("M_Unit not like", value, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitIn(List<String> values) {
            addCriterion("M_Unit in", values, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitNotIn(List<String> values) {
            addCriterion("M_Unit not in", values, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitBetween(String value1, String value2) {
            addCriterion("M_Unit between", value1, value2, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitNotBetween(String value1, String value2) {
            addCriterion("M_Unit not between", value1, value2, "mUnit");
            return (Criteria) this;
        }

        public Criteria andMNumberIsNull() {
            addCriterion("M_Number is null");
            return (Criteria) this;
        }

        public Criteria andMNumberIsNotNull() {
            addCriterion("M_Number is not null");
            return (Criteria) this;
        }

        public Criteria andMNumberEqualTo(Integer value) {
            addCriterion("M_Number =", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberNotEqualTo(Integer value) {
            addCriterion("M_Number <>", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberGreaterThan(Integer value) {
            addCriterion("M_Number >", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_Number >=", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberLessThan(Integer value) {
            addCriterion("M_Number <", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberLessThanOrEqualTo(Integer value) {
            addCriterion("M_Number <=", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberIn(List<Integer> values) {
            addCriterion("M_Number in", values, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberNotIn(List<Integer> values) {
            addCriterion("M_Number not in", values, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberBetween(Integer value1, Integer value2) {
            addCriterion("M_Number between", value1, value2, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("M_Number not between", value1, value2, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMWeightIsNull() {
            addCriterion("M_Weight is null");
            return (Criteria) this;
        }

        public Criteria andMWeightIsNotNull() {
            addCriterion("M_Weight is not null");
            return (Criteria) this;
        }

        public Criteria andMWeightEqualTo(BigDecimal value) {
            addCriterion("M_Weight =", value, "mWeight");
            return (Criteria) this;
        }

        public Criteria andMWeightNotEqualTo(BigDecimal value) {
            addCriterion("M_Weight <>", value, "mWeight");
            return (Criteria) this;
        }

        public Criteria andMWeightGreaterThan(BigDecimal value) {
            addCriterion("M_Weight >", value, "mWeight");
            return (Criteria) this;
        }

        public Criteria andMWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("M_Weight >=", value, "mWeight");
            return (Criteria) this;
        }

        public Criteria andMWeightLessThan(BigDecimal value) {
            addCriterion("M_Weight <", value, "mWeight");
            return (Criteria) this;
        }

        public Criteria andMWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("M_Weight <=", value, "mWeight");
            return (Criteria) this;
        }

        public Criteria andMWeightIn(List<BigDecimal> values) {
            addCriterion("M_Weight in", values, "mWeight");
            return (Criteria) this;
        }

        public Criteria andMWeightNotIn(List<BigDecimal> values) {
            addCriterion("M_Weight not in", values, "mWeight");
            return (Criteria) this;
        }

        public Criteria andMWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("M_Weight between", value1, value2, "mWeight");
            return (Criteria) this;
        }

        public Criteria andMWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("M_Weight not between", value1, value2, "mWeight");
            return (Criteria) this;
        }

        public Criteria andMNumbersIsNull() {
            addCriterion("M_Numbers is null");
            return (Criteria) this;
        }

        public Criteria andMNumbersIsNotNull() {
            addCriterion("M_Numbers is not null");
            return (Criteria) this;
        }

        public Criteria andMNumbersEqualTo(BigDecimal value) {
            addCriterion("M_Numbers =", value, "mNumbers");
            return (Criteria) this;
        }

        public Criteria andMNumbersNotEqualTo(BigDecimal value) {
            addCriterion("M_Numbers <>", value, "mNumbers");
            return (Criteria) this;
        }

        public Criteria andMNumbersGreaterThan(BigDecimal value) {
            addCriterion("M_Numbers >", value, "mNumbers");
            return (Criteria) this;
        }

        public Criteria andMNumbersGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("M_Numbers >=", value, "mNumbers");
            return (Criteria) this;
        }

        public Criteria andMNumbersLessThan(BigDecimal value) {
            addCriterion("M_Numbers <", value, "mNumbers");
            return (Criteria) this;
        }

        public Criteria andMNumbersLessThanOrEqualTo(BigDecimal value) {
            addCriterion("M_Numbers <=", value, "mNumbers");
            return (Criteria) this;
        }

        public Criteria andMNumbersIn(List<BigDecimal> values) {
            addCriterion("M_Numbers in", values, "mNumbers");
            return (Criteria) this;
        }

        public Criteria andMNumbersNotIn(List<BigDecimal> values) {
            addCriterion("M_Numbers not in", values, "mNumbers");
            return (Criteria) this;
        }

        public Criteria andMNumbersBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("M_Numbers between", value1, value2, "mNumbers");
            return (Criteria) this;
        }

        public Criteria andMNumbersNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("M_Numbers not between", value1, value2, "mNumbers");
            return (Criteria) this;
        }

        public Criteria andMWeightsIsNull() {
            addCriterion("M_Weights is null");
            return (Criteria) this;
        }

        public Criteria andMWeightsIsNotNull() {
            addCriterion("M_Weights is not null");
            return (Criteria) this;
        }

        public Criteria andMWeightsEqualTo(BigDecimal value) {
            addCriterion("M_Weights =", value, "mWeights");
            return (Criteria) this;
        }

        public Criteria andMWeightsNotEqualTo(BigDecimal value) {
            addCriterion("M_Weights <>", value, "mWeights");
            return (Criteria) this;
        }

        public Criteria andMWeightsGreaterThan(BigDecimal value) {
            addCriterion("M_Weights >", value, "mWeights");
            return (Criteria) this;
        }

        public Criteria andMWeightsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("M_Weights >=", value, "mWeights");
            return (Criteria) this;
        }

        public Criteria andMWeightsLessThan(BigDecimal value) {
            addCriterion("M_Weights <", value, "mWeights");
            return (Criteria) this;
        }

        public Criteria andMWeightsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("M_Weights <=", value, "mWeights");
            return (Criteria) this;
        }

        public Criteria andMWeightsIn(List<BigDecimal> values) {
            addCriterion("M_Weights in", values, "mWeights");
            return (Criteria) this;
        }

        public Criteria andMWeightsNotIn(List<BigDecimal> values) {
            addCriterion("M_Weights not in", values, "mWeights");
            return (Criteria) this;
        }

        public Criteria andMWeightsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("M_Weights between", value1, value2, "mWeights");
            return (Criteria) this;
        }

        public Criteria andMWeightsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("M_Weights not between", value1, value2, "mWeights");
            return (Criteria) this;
        }

        public Criteria andRQuantityIsNull() {
            addCriterion("R_Quantity is null");
            return (Criteria) this;
        }

        public Criteria andRQuantityIsNotNull() {
            addCriterion("R_Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andRQuantityEqualTo(Integer value) {
            addCriterion("R_Quantity =", value, "rQuantity");
            return (Criteria) this;
        }

        public Criteria andRQuantityNotEqualTo(Integer value) {
            addCriterion("R_Quantity <>", value, "rQuantity");
            return (Criteria) this;
        }

        public Criteria andRQuantityGreaterThan(Integer value) {
            addCriterion("R_Quantity >", value, "rQuantity");
            return (Criteria) this;
        }

        public Criteria andRQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("R_Quantity >=", value, "rQuantity");
            return (Criteria) this;
        }

        public Criteria andRQuantityLessThan(Integer value) {
            addCriterion("R_Quantity <", value, "rQuantity");
            return (Criteria) this;
        }

        public Criteria andRQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("R_Quantity <=", value, "rQuantity");
            return (Criteria) this;
        }

        public Criteria andRQuantityIn(List<Integer> values) {
            addCriterion("R_Quantity in", values, "rQuantity");
            return (Criteria) this;
        }

        public Criteria andRQuantityNotIn(List<Integer> values) {
            addCriterion("R_Quantity not in", values, "rQuantity");
            return (Criteria) this;
        }

        public Criteria andRQuantityBetween(Integer value1, Integer value2) {
            addCriterion("R_Quantity between", value1, value2, "rQuantity");
            return (Criteria) this;
        }

        public Criteria andRQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("R_Quantity not between", value1, value2, "rQuantity");
            return (Criteria) this;
        }

        public Criteria andRUnitIsNull() {
            addCriterion("R_Unit is null");
            return (Criteria) this;
        }

        public Criteria andRUnitIsNotNull() {
            addCriterion("R_Unit is not null");
            return (Criteria) this;
        }

        public Criteria andRUnitEqualTo(String value) {
            addCriterion("R_Unit =", value, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitNotEqualTo(String value) {
            addCriterion("R_Unit <>", value, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitGreaterThan(String value) {
            addCriterion("R_Unit >", value, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitGreaterThanOrEqualTo(String value) {
            addCriterion("R_Unit >=", value, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitLessThan(String value) {
            addCriterion("R_Unit <", value, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitLessThanOrEqualTo(String value) {
            addCriterion("R_Unit <=", value, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitLike(String value) {
            addCriterion("R_Unit like", value, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitNotLike(String value) {
            addCriterion("R_Unit not like", value, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitIn(List<String> values) {
            addCriterion("R_Unit in", values, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitNotIn(List<String> values) {
            addCriterion("R_Unit not in", values, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitBetween(String value1, String value2) {
            addCriterion("R_Unit between", value1, value2, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitNotBetween(String value1, String value2) {
            addCriterion("R_Unit not between", value1, value2, "rUnit");
            return (Criteria) this;
        }

        public Criteria andRNumberIsNull() {
            addCriterion("R_Number is null");
            return (Criteria) this;
        }

        public Criteria andRNumberIsNotNull() {
            addCriterion("R_Number is not null");
            return (Criteria) this;
        }

        public Criteria andRNumberEqualTo(Integer value) {
            addCriterion("R_Number =", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotEqualTo(Integer value) {
            addCriterion("R_Number <>", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThan(Integer value) {
            addCriterion("R_Number >", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("R_Number >=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThan(Integer value) {
            addCriterion("R_Number <", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThanOrEqualTo(Integer value) {
            addCriterion("R_Number <=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberIn(List<Integer> values) {
            addCriterion("R_Number in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotIn(List<Integer> values) {
            addCriterion("R_Number not in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberBetween(Integer value1, Integer value2) {
            addCriterion("R_Number between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("R_Number not between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRWeightIsNull() {
            addCriterion("R_Weight is null");
            return (Criteria) this;
        }

        public Criteria andRWeightIsNotNull() {
            addCriterion("R_Weight is not null");
            return (Criteria) this;
        }

        public Criteria andRWeightEqualTo(BigDecimal value) {
            addCriterion("R_Weight =", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightNotEqualTo(BigDecimal value) {
            addCriterion("R_Weight <>", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightGreaterThan(BigDecimal value) {
            addCriterion("R_Weight >", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("R_Weight >=", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightLessThan(BigDecimal value) {
            addCriterion("R_Weight <", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("R_Weight <=", value, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightIn(List<BigDecimal> values) {
            addCriterion("R_Weight in", values, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightNotIn(List<BigDecimal> values) {
            addCriterion("R_Weight not in", values, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("R_Weight between", value1, value2, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("R_Weight not between", value1, value2, "rWeight");
            return (Criteria) this;
        }

        public Criteria andRNumbersIsNull() {
            addCriterion("R_Numbers is null");
            return (Criteria) this;
        }

        public Criteria andRNumbersIsNotNull() {
            addCriterion("R_Numbers is not null");
            return (Criteria) this;
        }

        public Criteria andRNumbersEqualTo(BigDecimal value) {
            addCriterion("R_Numbers =", value, "rNumbers");
            return (Criteria) this;
        }

        public Criteria andRNumbersNotEqualTo(BigDecimal value) {
            addCriterion("R_Numbers <>", value, "rNumbers");
            return (Criteria) this;
        }

        public Criteria andRNumbersGreaterThan(BigDecimal value) {
            addCriterion("R_Numbers >", value, "rNumbers");
            return (Criteria) this;
        }

        public Criteria andRNumbersGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("R_Numbers >=", value, "rNumbers");
            return (Criteria) this;
        }

        public Criteria andRNumbersLessThan(BigDecimal value) {
            addCriterion("R_Numbers <", value, "rNumbers");
            return (Criteria) this;
        }

        public Criteria andRNumbersLessThanOrEqualTo(BigDecimal value) {
            addCriterion("R_Numbers <=", value, "rNumbers");
            return (Criteria) this;
        }

        public Criteria andRNumbersIn(List<BigDecimal> values) {
            addCriterion("R_Numbers in", values, "rNumbers");
            return (Criteria) this;
        }

        public Criteria andRNumbersNotIn(List<BigDecimal> values) {
            addCriterion("R_Numbers not in", values, "rNumbers");
            return (Criteria) this;
        }

        public Criteria andRNumbersBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("R_Numbers between", value1, value2, "rNumbers");
            return (Criteria) this;
        }

        public Criteria andRNumbersNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("R_Numbers not between", value1, value2, "rNumbers");
            return (Criteria) this;
        }

        public Criteria andRWeightsIsNull() {
            addCriterion("R_Weights is null");
            return (Criteria) this;
        }

        public Criteria andRWeightsIsNotNull() {
            addCriterion("R_Weights is not null");
            return (Criteria) this;
        }

        public Criteria andRWeightsEqualTo(BigDecimal value) {
            addCriterion("R_Weights =", value, "rWeights");
            return (Criteria) this;
        }

        public Criteria andRWeightsNotEqualTo(BigDecimal value) {
            addCriterion("R_Weights <>", value, "rWeights");
            return (Criteria) this;
        }

        public Criteria andRWeightsGreaterThan(BigDecimal value) {
            addCriterion("R_Weights >", value, "rWeights");
            return (Criteria) this;
        }

        public Criteria andRWeightsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("R_Weights >=", value, "rWeights");
            return (Criteria) this;
        }

        public Criteria andRWeightsLessThan(BigDecimal value) {
            addCriterion("R_Weights <", value, "rWeights");
            return (Criteria) this;
        }

        public Criteria andRWeightsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("R_Weights <=", value, "rWeights");
            return (Criteria) this;
        }

        public Criteria andRWeightsIn(List<BigDecimal> values) {
            addCriterion("R_Weights in", values, "rWeights");
            return (Criteria) this;
        }

        public Criteria andRWeightsNotIn(List<BigDecimal> values) {
            addCriterion("R_Weights not in", values, "rWeights");
            return (Criteria) this;
        }

        public Criteria andRWeightsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("R_Weights between", value1, value2, "rWeights");
            return (Criteria) this;
        }

        public Criteria andRWeightsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("R_Weights not between", value1, value2, "rWeights");
            return (Criteria) this;
        }

        public Criteria andDExternalIsNull() {
            addCriterion("D_External is null");
            return (Criteria) this;
        }

        public Criteria andDExternalIsNotNull() {
            addCriterion("D_External is not null");
            return (Criteria) this;
        }

        public Criteria andDExternalEqualTo(BigDecimal value) {
            addCriterion("D_External =", value, "dExternal");
            return (Criteria) this;
        }

        public Criteria andDExternalNotEqualTo(BigDecimal value) {
            addCriterion("D_External <>", value, "dExternal");
            return (Criteria) this;
        }

        public Criteria andDExternalGreaterThan(BigDecimal value) {
            addCriterion("D_External >", value, "dExternal");
            return (Criteria) this;
        }

        public Criteria andDExternalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("D_External >=", value, "dExternal");
            return (Criteria) this;
        }

        public Criteria andDExternalLessThan(BigDecimal value) {
            addCriterion("D_External <", value, "dExternal");
            return (Criteria) this;
        }

        public Criteria andDExternalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("D_External <=", value, "dExternal");
            return (Criteria) this;
        }

        public Criteria andDExternalIn(List<BigDecimal> values) {
            addCriterion("D_External in", values, "dExternal");
            return (Criteria) this;
        }

        public Criteria andDExternalNotIn(List<BigDecimal> values) {
            addCriterion("D_External not in", values, "dExternal");
            return (Criteria) this;
        }

        public Criteria andDExternalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_External between", value1, value2, "dExternal");
            return (Criteria) this;
        }

        public Criteria andDExternalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_External not between", value1, value2, "dExternal");
            return (Criteria) this;
        }

        public Criteria andDExternalStartIsNull() {
            addCriterion("D_External_Start is null");
            return (Criteria) this;
        }

        public Criteria andDExternalStartIsNotNull() {
            addCriterion("D_External_Start is not null");
            return (Criteria) this;
        }

        public Criteria andDExternalStartEqualTo(String value) {
            addCriterion("D_External_Start =", value, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalStartNotEqualTo(String value) {
            addCriterion("D_External_Start <>", value, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalStartGreaterThan(String value) {
            addCriterion("D_External_Start >", value, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalStartGreaterThanOrEqualTo(String value) {
            addCriterion("D_External_Start >=", value, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalStartLessThan(String value) {
            addCriterion("D_External_Start <", value, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalStartLessThanOrEqualTo(String value) {
            addCriterion("D_External_Start <=", value, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalStartLike(String value) {
            addCriterion("D_External_Start like", value, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalStartNotLike(String value) {
            addCriterion("D_External_Start not like", value, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalStartIn(List<String> values) {
            addCriterion("D_External_Start in", values, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalStartNotIn(List<String> values) {
            addCriterion("D_External_Start not in", values, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalStartBetween(String value1, String value2) {
            addCriterion("D_External_Start between", value1, value2, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalStartNotBetween(String value1, String value2) {
            addCriterion("D_External_Start not between", value1, value2, "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalEndIsNull() {
            addCriterion("D_External_End is null");
            return (Criteria) this;
        }

        public Criteria andDExternalEndIsNotNull() {
            addCriterion("D_External_End is not null");
            return (Criteria) this;
        }

        public Criteria andDExternalEndEqualTo(String value) {
            addCriterion("D_External_End =", value, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDExternalEndNotEqualTo(String value) {
            addCriterion("D_External_End <>", value, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDExternalEndGreaterThan(String value) {
            addCriterion("D_External_End >", value, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDExternalEndGreaterThanOrEqualTo(String value) {
            addCriterion("D_External_End >=", value, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDExternalEndLessThan(String value) {
            addCriterion("D_External_End <", value, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDExternalEndLessThanOrEqualTo(String value) {
            addCriterion("D_External_End <=", value, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDExternalEndLike(String value) {
            addCriterion("D_External_End like", value, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDExternalEndNotLike(String value) {
            addCriterion("D_External_End not like", value, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDExternalEndIn(List<String> values) {
            addCriterion("D_External_End in", values, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDExternalEndNotIn(List<String> values) {
            addCriterion("D_External_End not in", values, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDExternalEndBetween(String value1, String value2) {
            addCriterion("D_External_End between", value1, value2, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDExternalEndNotBetween(String value1, String value2) {
            addCriterion("D_External_End not between", value1, value2, "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalIsNull() {
            addCriterion("D_physicochemical is null");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalIsNotNull() {
            addCriterion("D_physicochemical is not null");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEqualTo(BigDecimal value) {
            addCriterion("D_physicochemical =", value, "dPhysicochemical");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalNotEqualTo(BigDecimal value) {
            addCriterion("D_physicochemical <>", value, "dPhysicochemical");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalGreaterThan(BigDecimal value) {
            addCriterion("D_physicochemical >", value, "dPhysicochemical");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("D_physicochemical >=", value, "dPhysicochemical");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalLessThan(BigDecimal value) {
            addCriterion("D_physicochemical <", value, "dPhysicochemical");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("D_physicochemical <=", value, "dPhysicochemical");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalIn(List<BigDecimal> values) {
            addCriterion("D_physicochemical in", values, "dPhysicochemical");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalNotIn(List<BigDecimal> values) {
            addCriterion("D_physicochemical not in", values, "dPhysicochemical");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_physicochemical between", value1, value2, "dPhysicochemical");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_physicochemical not between", value1, value2, "dPhysicochemical");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartIsNull() {
            addCriterion("D_physicochemical_Start is null");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartIsNotNull() {
            addCriterion("D_physicochemical_Start is not null");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartEqualTo(String value) {
            addCriterion("D_physicochemical_Start =", value, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartNotEqualTo(String value) {
            addCriterion("D_physicochemical_Start <>", value, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartGreaterThan(String value) {
            addCriterion("D_physicochemical_Start >", value, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartGreaterThanOrEqualTo(String value) {
            addCriterion("D_physicochemical_Start >=", value, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartLessThan(String value) {
            addCriterion("D_physicochemical_Start <", value, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartLessThanOrEqualTo(String value) {
            addCriterion("D_physicochemical_Start <=", value, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartLike(String value) {
            addCriterion("D_physicochemical_Start like", value, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartNotLike(String value) {
            addCriterion("D_physicochemical_Start not like", value, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartIn(List<String> values) {
            addCriterion("D_physicochemical_Start in", values, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartNotIn(List<String> values) {
            addCriterion("D_physicochemical_Start not in", values, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartBetween(String value1, String value2) {
            addCriterion("D_physicochemical_Start between", value1, value2, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartNotBetween(String value1, String value2) {
            addCriterion("D_physicochemical_Start not between", value1, value2, "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndIsNull() {
            addCriterion("D_physicochemical_End is null");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndIsNotNull() {
            addCriterion("D_physicochemical_End is not null");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndEqualTo(String value) {
            addCriterion("D_physicochemical_End =", value, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndNotEqualTo(String value) {
            addCriterion("D_physicochemical_End <>", value, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndGreaterThan(String value) {
            addCriterion("D_physicochemical_End >", value, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndGreaterThanOrEqualTo(String value) {
            addCriterion("D_physicochemical_End >=", value, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndLessThan(String value) {
            addCriterion("D_physicochemical_End <", value, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndLessThanOrEqualTo(String value) {
            addCriterion("D_physicochemical_End <=", value, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndLike(String value) {
            addCriterion("D_physicochemical_End like", value, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndNotLike(String value) {
            addCriterion("D_physicochemical_End not like", value, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndIn(List<String> values) {
            addCriterion("D_physicochemical_End in", values, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndNotIn(List<String> values) {
            addCriterion("D_physicochemical_End not in", values, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndBetween(String value1, String value2) {
            addCriterion("D_physicochemical_End between", value1, value2, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndNotBetween(String value1, String value2) {
            addCriterion("D_physicochemical_End not between", value1, value2, "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckIsNull() {
            addCriterion("D_Check is null");
            return (Criteria) this;
        }

        public Criteria andDCheckIsNotNull() {
            addCriterion("D_Check is not null");
            return (Criteria) this;
        }

        public Criteria andDCheckEqualTo(BigDecimal value) {
            addCriterion("D_Check =", value, "dCheck");
            return (Criteria) this;
        }

        public Criteria andDCheckNotEqualTo(BigDecimal value) {
            addCriterion("D_Check <>", value, "dCheck");
            return (Criteria) this;
        }

        public Criteria andDCheckGreaterThan(BigDecimal value) {
            addCriterion("D_Check >", value, "dCheck");
            return (Criteria) this;
        }

        public Criteria andDCheckGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("D_Check >=", value, "dCheck");
            return (Criteria) this;
        }

        public Criteria andDCheckLessThan(BigDecimal value) {
            addCriterion("D_Check <", value, "dCheck");
            return (Criteria) this;
        }

        public Criteria andDCheckLessThanOrEqualTo(BigDecimal value) {
            addCriterion("D_Check <=", value, "dCheck");
            return (Criteria) this;
        }

        public Criteria andDCheckIn(List<BigDecimal> values) {
            addCriterion("D_Check in", values, "dCheck");
            return (Criteria) this;
        }

        public Criteria andDCheckNotIn(List<BigDecimal> values) {
            addCriterion("D_Check not in", values, "dCheck");
            return (Criteria) this;
        }

        public Criteria andDCheckBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_Check between", value1, value2, "dCheck");
            return (Criteria) this;
        }

        public Criteria andDCheckNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_Check not between", value1, value2, "dCheck");
            return (Criteria) this;
        }

        public Criteria andDCheckStartIsNull() {
            addCriterion("D_Check_Start is null");
            return (Criteria) this;
        }

        public Criteria andDCheckStartIsNotNull() {
            addCriterion("D_Check_Start is not null");
            return (Criteria) this;
        }

        public Criteria andDCheckStartEqualTo(String value) {
            addCriterion("D_Check_Start =", value, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckStartNotEqualTo(String value) {
            addCriterion("D_Check_Start <>", value, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckStartGreaterThan(String value) {
            addCriterion("D_Check_Start >", value, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckStartGreaterThanOrEqualTo(String value) {
            addCriterion("D_Check_Start >=", value, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckStartLessThan(String value) {
            addCriterion("D_Check_Start <", value, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckStartLessThanOrEqualTo(String value) {
            addCriterion("D_Check_Start <=", value, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckStartLike(String value) {
            addCriterion("D_Check_Start like", value, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckStartNotLike(String value) {
            addCriterion("D_Check_Start not like", value, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckStartIn(List<String> values) {
            addCriterion("D_Check_Start in", values, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckStartNotIn(List<String> values) {
            addCriterion("D_Check_Start not in", values, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckStartBetween(String value1, String value2) {
            addCriterion("D_Check_Start between", value1, value2, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckStartNotBetween(String value1, String value2) {
            addCriterion("D_Check_Start not between", value1, value2, "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckEndIsNull() {
            addCriterion("D_Check_End is null");
            return (Criteria) this;
        }

        public Criteria andDCheckEndIsNotNull() {
            addCriterion("D_Check_End is not null");
            return (Criteria) this;
        }

        public Criteria andDCheckEndEqualTo(String value) {
            addCriterion("D_Check_End =", value, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckEndNotEqualTo(String value) {
            addCriterion("D_Check_End <>", value, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckEndGreaterThan(String value) {
            addCriterion("D_Check_End >", value, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckEndGreaterThanOrEqualTo(String value) {
            addCriterion("D_Check_End >=", value, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckEndLessThan(String value) {
            addCriterion("D_Check_End <", value, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckEndLessThanOrEqualTo(String value) {
            addCriterion("D_Check_End <=", value, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckEndLike(String value) {
            addCriterion("D_Check_End like", value, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckEndNotLike(String value) {
            addCriterion("D_Check_End not like", value, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckEndIn(List<String> values) {
            addCriterion("D_Check_End in", values, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckEndNotIn(List<String> values) {
            addCriterion("D_Check_End not in", values, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckEndBetween(String value1, String value2) {
            addCriterion("D_Check_End between", value1, value2, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckEndNotBetween(String value1, String value2) {
            addCriterion("D_Check_End not between", value1, value2, "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessIsNull() {
            addCriterion("D_lossless is null");
            return (Criteria) this;
        }

        public Criteria andDLosslessIsNotNull() {
            addCriterion("D_lossless is not null");
            return (Criteria) this;
        }

        public Criteria andDLosslessEqualTo(BigDecimal value) {
            addCriterion("D_lossless =", value, "dLossless");
            return (Criteria) this;
        }

        public Criteria andDLosslessNotEqualTo(BigDecimal value) {
            addCriterion("D_lossless <>", value, "dLossless");
            return (Criteria) this;
        }

        public Criteria andDLosslessGreaterThan(BigDecimal value) {
            addCriterion("D_lossless >", value, "dLossless");
            return (Criteria) this;
        }

        public Criteria andDLosslessGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("D_lossless >=", value, "dLossless");
            return (Criteria) this;
        }

        public Criteria andDLosslessLessThan(BigDecimal value) {
            addCriterion("D_lossless <", value, "dLossless");
            return (Criteria) this;
        }

        public Criteria andDLosslessLessThanOrEqualTo(BigDecimal value) {
            addCriterion("D_lossless <=", value, "dLossless");
            return (Criteria) this;
        }

        public Criteria andDLosslessIn(List<BigDecimal> values) {
            addCriterion("D_lossless in", values, "dLossless");
            return (Criteria) this;
        }

        public Criteria andDLosslessNotIn(List<BigDecimal> values) {
            addCriterion("D_lossless not in", values, "dLossless");
            return (Criteria) this;
        }

        public Criteria andDLosslessBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_lossless between", value1, value2, "dLossless");
            return (Criteria) this;
        }

        public Criteria andDLosslessNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_lossless not between", value1, value2, "dLossless");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartIsNull() {
            addCriterion("D_lossless_Start is null");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartIsNotNull() {
            addCriterion("D_lossless_Start is not null");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartEqualTo(String value) {
            addCriterion("D_lossless_Start =", value, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartNotEqualTo(String value) {
            addCriterion("D_lossless_Start <>", value, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartGreaterThan(String value) {
            addCriterion("D_lossless_Start >", value, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartGreaterThanOrEqualTo(String value) {
            addCriterion("D_lossless_Start >=", value, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartLessThan(String value) {
            addCriterion("D_lossless_Start <", value, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartLessThanOrEqualTo(String value) {
            addCriterion("D_lossless_Start <=", value, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartLike(String value) {
            addCriterion("D_lossless_Start like", value, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartNotLike(String value) {
            addCriterion("D_lossless_Start not like", value, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartIn(List<String> values) {
            addCriterion("D_lossless_Start in", values, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartNotIn(List<String> values) {
            addCriterion("D_lossless_Start not in", values, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartBetween(String value1, String value2) {
            addCriterion("D_lossless_Start between", value1, value2, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartNotBetween(String value1, String value2) {
            addCriterion("D_lossless_Start not between", value1, value2, "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndIsNull() {
            addCriterion("D_lossless_End is null");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndIsNotNull() {
            addCriterion("D_lossless_End is not null");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndEqualTo(String value) {
            addCriterion("D_lossless_End =", value, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndNotEqualTo(String value) {
            addCriterion("D_lossless_End <>", value, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndGreaterThan(String value) {
            addCriterion("D_lossless_End >", value, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndGreaterThanOrEqualTo(String value) {
            addCriterion("D_lossless_End >=", value, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndLessThan(String value) {
            addCriterion("D_lossless_End <", value, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndLessThanOrEqualTo(String value) {
            addCriterion("D_lossless_End <=", value, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndLike(String value) {
            addCriterion("D_lossless_End like", value, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndNotLike(String value) {
            addCriterion("D_lossless_End not like", value, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndIn(List<String> values) {
            addCriterion("D_lossless_End in", values, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndNotIn(List<String> values) {
            addCriterion("D_lossless_End not in", values, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndBetween(String value1, String value2) {
            addCriterion("D_lossless_End between", value1, value2, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndNotBetween(String value1, String value2) {
            addCriterion("D_lossless_End not between", value1, value2, "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingIsNull() {
            addCriterion("D_packaging is null");
            return (Criteria) this;
        }

        public Criteria andDPackagingIsNotNull() {
            addCriterion("D_packaging is not null");
            return (Criteria) this;
        }

        public Criteria andDPackagingEqualTo(BigDecimal value) {
            addCriterion("D_packaging =", value, "dPackaging");
            return (Criteria) this;
        }

        public Criteria andDPackagingNotEqualTo(BigDecimal value) {
            addCriterion("D_packaging <>", value, "dPackaging");
            return (Criteria) this;
        }

        public Criteria andDPackagingGreaterThan(BigDecimal value) {
            addCriterion("D_packaging >", value, "dPackaging");
            return (Criteria) this;
        }

        public Criteria andDPackagingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("D_packaging >=", value, "dPackaging");
            return (Criteria) this;
        }

        public Criteria andDPackagingLessThan(BigDecimal value) {
            addCriterion("D_packaging <", value, "dPackaging");
            return (Criteria) this;
        }

        public Criteria andDPackagingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("D_packaging <=", value, "dPackaging");
            return (Criteria) this;
        }

        public Criteria andDPackagingIn(List<BigDecimal> values) {
            addCriterion("D_packaging in", values, "dPackaging");
            return (Criteria) this;
        }

        public Criteria andDPackagingNotIn(List<BigDecimal> values) {
            addCriterion("D_packaging not in", values, "dPackaging");
            return (Criteria) this;
        }

        public Criteria andDPackagingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_packaging between", value1, value2, "dPackaging");
            return (Criteria) this;
        }

        public Criteria andDPackagingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("D_packaging not between", value1, value2, "dPackaging");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartIsNull() {
            addCriterion("D_packaging_Start is null");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartIsNotNull() {
            addCriterion("D_packaging_Start is not null");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartEqualTo(String value) {
            addCriterion("D_packaging_Start =", value, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartNotEqualTo(String value) {
            addCriterion("D_packaging_Start <>", value, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartGreaterThan(String value) {
            addCriterion("D_packaging_Start >", value, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartGreaterThanOrEqualTo(String value) {
            addCriterion("D_packaging_Start >=", value, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartLessThan(String value) {
            addCriterion("D_packaging_Start <", value, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartLessThanOrEqualTo(String value) {
            addCriterion("D_packaging_Start <=", value, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartLike(String value) {
            addCriterion("D_packaging_Start like", value, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartNotLike(String value) {
            addCriterion("D_packaging_Start not like", value, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartIn(List<String> values) {
            addCriterion("D_packaging_Start in", values, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartNotIn(List<String> values) {
            addCriterion("D_packaging_Start not in", values, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartBetween(String value1, String value2) {
            addCriterion("D_packaging_Start between", value1, value2, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartNotBetween(String value1, String value2) {
            addCriterion("D_packaging_Start not between", value1, value2, "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndIsNull() {
            addCriterion("D_packaging_End is null");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndIsNotNull() {
            addCriterion("D_packaging_End is not null");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndEqualTo(String value) {
            addCriterion("D_packaging_End =", value, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndNotEqualTo(String value) {
            addCriterion("D_packaging_End <>", value, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndGreaterThan(String value) {
            addCriterion("D_packaging_End >", value, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndGreaterThanOrEqualTo(String value) {
            addCriterion("D_packaging_End >=", value, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndLessThan(String value) {
            addCriterion("D_packaging_End <", value, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndLessThanOrEqualTo(String value) {
            addCriterion("D_packaging_End <=", value, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndLike(String value) {
            addCriterion("D_packaging_End like", value, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndNotLike(String value) {
            addCriterion("D_packaging_End not like", value, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndIn(List<String> values) {
            addCriterion("D_packaging_End in", values, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndNotIn(List<String> values) {
            addCriterion("D_packaging_End not in", values, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndBetween(String value1, String value2) {
            addCriterion("D_packaging_End between", value1, value2, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndNotBetween(String value1, String value2) {
            addCriterion("D_packaging_End not between", value1, value2, "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDPercentIsNull() {
            addCriterion("D_percent is null");
            return (Criteria) this;
        }

        public Criteria andDPercentIsNotNull() {
            addCriterion("D_percent is not null");
            return (Criteria) this;
        }

        public Criteria andDPercentEqualTo(Integer value) {
            addCriterion("D_percent =", value, "dPercent");
            return (Criteria) this;
        }

        public Criteria andDPercentNotEqualTo(Integer value) {
            addCriterion("D_percent <>", value, "dPercent");
            return (Criteria) this;
        }

        public Criteria andDPercentGreaterThan(Integer value) {
            addCriterion("D_percent >", value, "dPercent");
            return (Criteria) this;
        }

        public Criteria andDPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_percent >=", value, "dPercent");
            return (Criteria) this;
        }

        public Criteria andDPercentLessThan(Integer value) {
            addCriterion("D_percent <", value, "dPercent");
            return (Criteria) this;
        }

        public Criteria andDPercentLessThanOrEqualTo(Integer value) {
            addCriterion("D_percent <=", value, "dPercent");
            return (Criteria) this;
        }

        public Criteria andDPercentIn(List<Integer> values) {
            addCriterion("D_percent in", values, "dPercent");
            return (Criteria) this;
        }

        public Criteria andDPercentNotIn(List<Integer> values) {
            addCriterion("D_percent not in", values, "dPercent");
            return (Criteria) this;
        }

        public Criteria andDPercentBetween(Integer value1, Integer value2) {
            addCriterion("D_percent between", value1, value2, "dPercent");
            return (Criteria) this;
        }

        public Criteria andDPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("D_percent not between", value1, value2, "dPercent");
            return (Criteria) this;
        }

        public Criteria andDVerifyIsNull() {
            addCriterion("D_verify is null");
            return (Criteria) this;
        }

        public Criteria andDVerifyIsNotNull() {
            addCriterion("D_verify is not null");
            return (Criteria) this;
        }

        public Criteria andDVerifyEqualTo(String value) {
            addCriterion("D_verify =", value, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDVerifyNotEqualTo(String value) {
            addCriterion("D_verify <>", value, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDVerifyGreaterThan(String value) {
            addCriterion("D_verify >", value, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDVerifyGreaterThanOrEqualTo(String value) {
            addCriterion("D_verify >=", value, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDVerifyLessThan(String value) {
            addCriterion("D_verify <", value, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDVerifyLessThanOrEqualTo(String value) {
            addCriterion("D_verify <=", value, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDVerifyLike(String value) {
            addCriterion("D_verify like", value, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDVerifyNotLike(String value) {
            addCriterion("D_verify not like", value, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDVerifyIn(List<String> values) {
            addCriterion("D_verify in", values, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDVerifyNotIn(List<String> values) {
            addCriterion("D_verify not in", values, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDVerifyBetween(String value1, String value2) {
            addCriterion("D_verify between", value1, value2, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDVerifyNotBetween(String value1, String value2) {
            addCriterion("D_verify not between", value1, value2, "dVerify");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeIsNull() {
            addCriterion("D_Check_type is null");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeIsNotNull() {
            addCriterion("D_Check_type is not null");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeEqualTo(String value) {
            addCriterion("D_Check_type =", value, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeNotEqualTo(String value) {
            addCriterion("D_Check_type <>", value, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeGreaterThan(String value) {
            addCriterion("D_Check_type >", value, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("D_Check_type >=", value, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeLessThan(String value) {
            addCriterion("D_Check_type <", value, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("D_Check_type <=", value, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeLike(String value) {
            addCriterion("D_Check_type like", value, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeNotLike(String value) {
            addCriterion("D_Check_type not like", value, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeIn(List<String> values) {
            addCriterion("D_Check_type in", values, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeNotIn(List<String> values) {
            addCriterion("D_Check_type not in", values, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeBetween(String value1, String value2) {
            addCriterion("D_Check_type between", value1, value2, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeNotBetween(String value1, String value2) {
            addCriterion("D_Check_type not between", value1, value2, "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDStandardsIsNull() {
            addCriterion("D_Standards is null");
            return (Criteria) this;
        }

        public Criteria andDStandardsIsNotNull() {
            addCriterion("D_Standards is not null");
            return (Criteria) this;
        }

        public Criteria andDStandardsEqualTo(String value) {
            addCriterion("D_Standards =", value, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDStandardsNotEqualTo(String value) {
            addCriterion("D_Standards <>", value, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDStandardsGreaterThan(String value) {
            addCriterion("D_Standards >", value, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDStandardsGreaterThanOrEqualTo(String value) {
            addCriterion("D_Standards >=", value, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDStandardsLessThan(String value) {
            addCriterion("D_Standards <", value, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDStandardsLessThanOrEqualTo(String value) {
            addCriterion("D_Standards <=", value, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDStandardsLike(String value) {
            addCriterion("D_Standards like", value, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDStandardsNotLike(String value) {
            addCriterion("D_Standards not like", value, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDStandardsIn(List<String> values) {
            addCriterion("D_Standards in", values, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDStandardsNotIn(List<String> values) {
            addCriterion("D_Standards not in", values, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDStandardsBetween(String value1, String value2) {
            addCriterion("D_Standards between", value1, value2, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDStandardsNotBetween(String value1, String value2) {
            addCriterion("D_Standards not between", value1, value2, "dStandards");
            return (Criteria) this;
        }

        public Criteria andDSupplyIsNull() {
            addCriterion("D_Supply is null");
            return (Criteria) this;
        }

        public Criteria andDSupplyIsNotNull() {
            addCriterion("D_Supply is not null");
            return (Criteria) this;
        }

        public Criteria andDSupplyEqualTo(String value) {
            addCriterion("D_Supply =", value, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDSupplyNotEqualTo(String value) {
            addCriterion("D_Supply <>", value, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDSupplyGreaterThan(String value) {
            addCriterion("D_Supply >", value, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDSupplyGreaterThanOrEqualTo(String value) {
            addCriterion("D_Supply >=", value, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDSupplyLessThan(String value) {
            addCriterion("D_Supply <", value, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDSupplyLessThanOrEqualTo(String value) {
            addCriterion("D_Supply <=", value, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDSupplyLike(String value) {
            addCriterion("D_Supply like", value, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDSupplyNotLike(String value) {
            addCriterion("D_Supply not like", value, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDSupplyIn(List<String> values) {
            addCriterion("D_Supply in", values, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDSupplyNotIn(List<String> values) {
            addCriterion("D_Supply not in", values, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDSupplyBetween(String value1, String value2) {
            addCriterion("D_Supply between", value1, value2, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDSupplyNotBetween(String value1, String value2) {
            addCriterion("D_Supply not between", value1, value2, "dSupply");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoIsNull() {
            addCriterion("D_FurnaceNo is null");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoIsNotNull() {
            addCriterion("D_FurnaceNo is not null");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoEqualTo(String value) {
            addCriterion("D_FurnaceNo =", value, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoNotEqualTo(String value) {
            addCriterion("D_FurnaceNo <>", value, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoGreaterThan(String value) {
            addCriterion("D_FurnaceNo >", value, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoGreaterThanOrEqualTo(String value) {
            addCriterion("D_FurnaceNo >=", value, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoLessThan(String value) {
            addCriterion("D_FurnaceNo <", value, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoLessThanOrEqualTo(String value) {
            addCriterion("D_FurnaceNo <=", value, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoLike(String value) {
            addCriterion("D_FurnaceNo like", value, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoNotLike(String value) {
            addCriterion("D_FurnaceNo not like", value, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoIn(List<String> values) {
            addCriterion("D_FurnaceNo in", values, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoNotIn(List<String> values) {
            addCriterion("D_FurnaceNo not in", values, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoBetween(String value1, String value2) {
            addCriterion("D_FurnaceNo between", value1, value2, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoNotBetween(String value1, String value2) {
            addCriterion("D_FurnaceNo not between", value1, value2, "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoIsNull() {
            addCriterion("D_HeatNo is null");
            return (Criteria) this;
        }

        public Criteria andDHeatnoIsNotNull() {
            addCriterion("D_HeatNo is not null");
            return (Criteria) this;
        }

        public Criteria andDHeatnoEqualTo(String value) {
            addCriterion("D_HeatNo =", value, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoNotEqualTo(String value) {
            addCriterion("D_HeatNo <>", value, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoGreaterThan(String value) {
            addCriterion("D_HeatNo >", value, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoGreaterThanOrEqualTo(String value) {
            addCriterion("D_HeatNo >=", value, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoLessThan(String value) {
            addCriterion("D_HeatNo <", value, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoLessThanOrEqualTo(String value) {
            addCriterion("D_HeatNo <=", value, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoLike(String value) {
            addCriterion("D_HeatNo like", value, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoNotLike(String value) {
            addCriterion("D_HeatNo not like", value, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoIn(List<String> values) {
            addCriterion("D_HeatNo in", values, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoNotIn(List<String> values) {
            addCriterion("D_HeatNo not in", values, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoBetween(String value1, String value2) {
            addCriterion("D_HeatNo between", value1, value2, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoNotBetween(String value1, String value2) {
            addCriterion("D_HeatNo not between", value1, value2, "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoIsNull() {
            addCriterion("D_BoxNo is null");
            return (Criteria) this;
        }

        public Criteria andDBoxnoIsNotNull() {
            addCriterion("D_BoxNo is not null");
            return (Criteria) this;
        }

        public Criteria andDBoxnoEqualTo(String value) {
            addCriterion("D_BoxNo =", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoNotEqualTo(String value) {
            addCriterion("D_BoxNo <>", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoGreaterThan(String value) {
            addCriterion("D_BoxNo >", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoGreaterThanOrEqualTo(String value) {
            addCriterion("D_BoxNo >=", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoLessThan(String value) {
            addCriterion("D_BoxNo <", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoLessThanOrEqualTo(String value) {
            addCriterion("D_BoxNo <=", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoLike(String value) {
            addCriterion("D_BoxNo like", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoNotLike(String value) {
            addCriterion("D_BoxNo not like", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoIn(List<String> values) {
            addCriterion("D_BoxNo in", values, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoNotIn(List<String> values) {
            addCriterion("D_BoxNo not in", values, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoBetween(String value1, String value2) {
            addCriterion("D_BoxNo between", value1, value2, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoNotBetween(String value1, String value2) {
            addCriterion("D_BoxNo not between", value1, value2, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDStateIsNull() {
            addCriterion("D_State is null");
            return (Criteria) this;
        }

        public Criteria andDStateIsNotNull() {
            addCriterion("D_State is not null");
            return (Criteria) this;
        }

        public Criteria andDStateEqualTo(Integer value) {
            addCriterion("D_State =", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotEqualTo(Integer value) {
            addCriterion("D_State <>", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateGreaterThan(Integer value) {
            addCriterion("D_State >", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_State >=", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateLessThan(Integer value) {
            addCriterion("D_State <", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateLessThanOrEqualTo(Integer value) {
            addCriterion("D_State <=", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateIn(List<Integer> values) {
            addCriterion("D_State in", values, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotIn(List<Integer> values) {
            addCriterion("D_State not in", values, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateBetween(Integer value1, Integer value2) {
            addCriterion("D_State between", value1, value2, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotBetween(Integer value1, Integer value2) {
            addCriterion("D_State not between", value1, value2, "dState");
            return (Criteria) this;
        }

        public Criteria andDIssingleIsNull() {
            addCriterion("D_IsSingle is null");
            return (Criteria) this;
        }

        public Criteria andDIssingleIsNotNull() {
            addCriterion("D_IsSingle is not null");
            return (Criteria) this;
        }

        public Criteria andDIssingleEqualTo(Integer value) {
            addCriterion("D_IsSingle =", value, "dIssingle");
            return (Criteria) this;
        }

        public Criteria andDIssingleNotEqualTo(Integer value) {
            addCriterion("D_IsSingle <>", value, "dIssingle");
            return (Criteria) this;
        }

        public Criteria andDIssingleGreaterThan(Integer value) {
            addCriterion("D_IsSingle >", value, "dIssingle");
            return (Criteria) this;
        }

        public Criteria andDIssingleGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_IsSingle >=", value, "dIssingle");
            return (Criteria) this;
        }

        public Criteria andDIssingleLessThan(Integer value) {
            addCriterion("D_IsSingle <", value, "dIssingle");
            return (Criteria) this;
        }

        public Criteria andDIssingleLessThanOrEqualTo(Integer value) {
            addCriterion("D_IsSingle <=", value, "dIssingle");
            return (Criteria) this;
        }

        public Criteria andDIssingleIn(List<Integer> values) {
            addCriterion("D_IsSingle in", values, "dIssingle");
            return (Criteria) this;
        }

        public Criteria andDIssingleNotIn(List<Integer> values) {
            addCriterion("D_IsSingle not in", values, "dIssingle");
            return (Criteria) this;
        }

        public Criteria andDIssingleBetween(Integer value1, Integer value2) {
            addCriterion("D_IsSingle between", value1, value2, "dIssingle");
            return (Criteria) this;
        }

        public Criteria andDIssingleNotBetween(Integer value1, Integer value2) {
            addCriterion("D_IsSingle not between", value1, value2, "dIssingle");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DeptID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DeptID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("DeptID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("DeptID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("DeptID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeptID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("DeptID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("DeptID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("DeptID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("DeptID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("DeptID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("DeptID not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("IsShow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("IsShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Integer value) {
            addCriterion("IsShow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Integer value) {
            addCriterion("IsShow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Integer value) {
            addCriterion("IsShow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsShow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Integer value) {
            addCriterion("IsShow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Integer value) {
            addCriterion("IsShow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Integer> values) {
            addCriterion("IsShow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Integer> values) {
            addCriterion("IsShow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Integer value1, Integer value2) {
            addCriterion("IsShow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Integer value1, Integer value2) {
            addCriterion("IsShow not between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andDRemarkIsNull() {
            addCriterion("D_Remark is null");
            return (Criteria) this;
        }

        public Criteria andDRemarkIsNotNull() {
            addCriterion("D_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andDRemarkEqualTo(String value) {
            addCriterion("D_Remark =", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkNotEqualTo(String value) {
            addCriterion("D_Remark <>", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkGreaterThan(String value) {
            addCriterion("D_Remark >", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("D_Remark >=", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkLessThan(String value) {
            addCriterion("D_Remark <", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkLessThanOrEqualTo(String value) {
            addCriterion("D_Remark <=", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkLike(String value) {
            addCriterion("D_Remark like", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkNotLike(String value) {
            addCriterion("D_Remark not like", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkIn(List<String> values) {
            addCriterion("D_Remark in", values, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkNotIn(List<String> values) {
            addCriterion("D_Remark not in", values, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkBetween(String value1, String value2) {
            addCriterion("D_Remark between", value1, value2, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkNotBetween(String value1, String value2) {
            addCriterion("D_Remark not between", value1, value2, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDNoLikeInsensitive(String value) {
            addCriterion("upper(D_No) like", value.toUpperCase(), "dNo");
            return (Criteria) this;
        }

        public Criteria andContractnoLikeInsensitive(String value) {
            addCriterion("upper(ContractNo) like", value.toUpperCase(), "contractno");
            return (Criteria) this;
        }

        public Criteria andDNameLikeInsensitive(String value) {
            addCriterion("upper(D_Name) like", value.toUpperCase(), "dName");
            return (Criteria) this;
        }

        public Criteria andDTypeLikeInsensitive(String value) {
            addCriterion("upper(D_Type) like", value.toUpperCase(), "dType");
            return (Criteria) this;
        }

        public Criteria andDSteelLikeInsensitive(String value) {
            addCriterion("upper(D_Steel) like", value.toUpperCase(), "dSteel");
            return (Criteria) this;
        }

        public Criteria andDSpecLikeInsensitive(String value) {
            addCriterion("upper(D_Spec) like", value.toUpperCase(), "dSpec");
            return (Criteria) this;
        }

        public Criteria andDNpsLikeInsensitive(String value) {
            addCriterion("upper(D_NPS) like", value.toUpperCase(), "dNps");
            return (Criteria) this;
        }

        public Criteria andDUnitLikeInsensitive(String value) {
            addCriterion("upper(D_Unit) like", value.toUpperCase(), "dUnit");
            return (Criteria) this;
        }

        public Criteria andSUnitLikeInsensitive(String value) {
            addCriterion("upper(S_Unit) like", value.toUpperCase(), "sUnit");
            return (Criteria) this;
        }

        public Criteria andMUnitLikeInsensitive(String value) {
            addCriterion("upper(M_Unit) like", value.toUpperCase(), "mUnit");
            return (Criteria) this;
        }

        public Criteria andRUnitLikeInsensitive(String value) {
            addCriterion("upper(R_Unit) like", value.toUpperCase(), "rUnit");
            return (Criteria) this;
        }

        public Criteria andDExternalStartLikeInsensitive(String value) {
            addCriterion("upper(D_External_Start) like", value.toUpperCase(), "dExternalStart");
            return (Criteria) this;
        }

        public Criteria andDExternalEndLikeInsensitive(String value) {
            addCriterion("upper(D_External_End) like", value.toUpperCase(), "dExternalEnd");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalStartLikeInsensitive(String value) {
            addCriterion("upper(D_physicochemical_Start) like", value.toUpperCase(), "dPhysicochemicalStart");
            return (Criteria) this;
        }

        public Criteria andDPhysicochemicalEndLikeInsensitive(String value) {
            addCriterion("upper(D_physicochemical_End) like", value.toUpperCase(), "dPhysicochemicalEnd");
            return (Criteria) this;
        }

        public Criteria andDCheckStartLikeInsensitive(String value) {
            addCriterion("upper(D_Check_Start) like", value.toUpperCase(), "dCheckStart");
            return (Criteria) this;
        }

        public Criteria andDCheckEndLikeInsensitive(String value) {
            addCriterion("upper(D_Check_End) like", value.toUpperCase(), "dCheckEnd");
            return (Criteria) this;
        }

        public Criteria andDLosslessStartLikeInsensitive(String value) {
            addCriterion("upper(D_lossless_Start) like", value.toUpperCase(), "dLosslessStart");
            return (Criteria) this;
        }

        public Criteria andDLosslessEndLikeInsensitive(String value) {
            addCriterion("upper(D_lossless_End) like", value.toUpperCase(), "dLosslessEnd");
            return (Criteria) this;
        }

        public Criteria andDPackagingStartLikeInsensitive(String value) {
            addCriterion("upper(D_packaging_Start) like", value.toUpperCase(), "dPackagingStart");
            return (Criteria) this;
        }

        public Criteria andDPackagingEndLikeInsensitive(String value) {
            addCriterion("upper(D_packaging_End) like", value.toUpperCase(), "dPackagingEnd");
            return (Criteria) this;
        }

        public Criteria andDVerifyLikeInsensitive(String value) {
            addCriterion("upper(D_verify) like", value.toUpperCase(), "dVerify");
            return (Criteria) this;
        }

        public Criteria andDCheckTypeLikeInsensitive(String value) {
            addCriterion("upper(D_Check_type) like", value.toUpperCase(), "dCheckType");
            return (Criteria) this;
        }

        public Criteria andDStandardsLikeInsensitive(String value) {
            addCriterion("upper(D_Standards) like", value.toUpperCase(), "dStandards");
            return (Criteria) this;
        }

        public Criteria andDSupplyLikeInsensitive(String value) {
            addCriterion("upper(D_Supply) like", value.toUpperCase(), "dSupply");
            return (Criteria) this;
        }

        public Criteria andDFurnacenoLikeInsensitive(String value) {
            addCriterion("upper(D_FurnaceNo) like", value.toUpperCase(), "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDHeatnoLikeInsensitive(String value) {
            addCriterion("upper(D_HeatNo) like", value.toUpperCase(), "dHeatno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoLikeInsensitive(String value) {
            addCriterion("upper(D_BoxNo) like", value.toUpperCase(), "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDRemarkLikeInsensitive(String value) {
            addCriterion("upper(D_Remark) like", value.toUpperCase(), "dRemark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}