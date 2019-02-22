package com.sss.oem.domain.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ViewWmsOperationCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewWmsOperationCriteria() {
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
            addCriterion("D_ID is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("D_ID =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("D_ID <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("D_ID >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_ID >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("D_ID <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("D_ID <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("D_ID in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("D_ID not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("D_ID between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("D_ID not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNull() {
            addCriterion("T_Type is null");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNotNull() {
            addCriterion("T_Type is not null");
            return (Criteria) this;
        }

        public Criteria andTTypeEqualTo(Integer value) {
            addCriterion("T_Type =", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotEqualTo(Integer value) {
            addCriterion("T_Type <>", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThan(Integer value) {
            addCriterion("T_Type >", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_Type >=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThan(Integer value) {
            addCriterion("T_Type <", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThanOrEqualTo(Integer value) {
            addCriterion("T_Type <=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeIn(List<Integer> values) {
            addCriterion("T_Type in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotIn(List<Integer> values) {
            addCriterion("T_Type not in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeBetween(Integer value1, Integer value2) {
            addCriterion("T_Type between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("T_Type not between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andDParentidIsNull() {
            addCriterion("D_ParentID is null");
            return (Criteria) this;
        }

        public Criteria andDParentidIsNotNull() {
            addCriterion("D_ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andDParentidEqualTo(String value) {
            addCriterion("D_ParentID =", value, "dParentid");
            return (Criteria) this;
        }

        public Criteria andDParentidNotEqualTo(String value) {
            addCriterion("D_ParentID <>", value, "dParentid");
            return (Criteria) this;
        }

        public Criteria andDParentidGreaterThan(String value) {
            addCriterion("D_ParentID >", value, "dParentid");
            return (Criteria) this;
        }

        public Criteria andDParentidGreaterThanOrEqualTo(String value) {
            addCriterion("D_ParentID >=", value, "dParentid");
            return (Criteria) this;
        }

        public Criteria andDParentidLessThan(String value) {
            addCriterion("D_ParentID <", value, "dParentid");
            return (Criteria) this;
        }

        public Criteria andDParentidLessThanOrEqualTo(String value) {
            addCriterion("D_ParentID <=", value, "dParentid");
            return (Criteria) this;
        }

        public Criteria andDParentidLike(String value) {
            addCriterion("D_ParentID like", value, "dParentid");
            return (Criteria) this;
        }

        public Criteria andDParentidNotLike(String value) {
            addCriterion("D_ParentID not like", value, "dParentid");
            return (Criteria) this;
        }

        public Criteria andDParentidIn(List<String> values) {
            addCriterion("D_ParentID in", values, "dParentid");
            return (Criteria) this;
        }

        public Criteria andDParentidNotIn(List<String> values) {
            addCriterion("D_ParentID not in", values, "dParentid");
            return (Criteria) this;
        }

        public Criteria andDParentidBetween(String value1, String value2) {
            addCriterion("D_ParentID between", value1, value2, "dParentid");
            return (Criteria) this;
        }

        public Criteria andDParentidNotBetween(String value1, String value2) {
            addCriterion("D_ParentID not between", value1, value2, "dParentid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("ParentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("ParentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("ParentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("ParentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("ParentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("ParentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("ParentID like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("ParentID not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("ParentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("ParentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("ParentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("ParentID not between", value1, value2, "parentid");
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

        public Criteria andProNoIsNull() {
            addCriterion("Pro_No is null");
            return (Criteria) this;
        }

        public Criteria andProNoIsNotNull() {
            addCriterion("Pro_No is not null");
            return (Criteria) this;
        }

        public Criteria andProNoEqualTo(String value) {
            addCriterion("Pro_No =", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotEqualTo(String value) {
            addCriterion("Pro_No <>", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThan(String value) {
            addCriterion("Pro_No >", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThanOrEqualTo(String value) {
            addCriterion("Pro_No >=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThan(String value) {
            addCriterion("Pro_No <", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThanOrEqualTo(String value) {
            addCriterion("Pro_No <=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLike(String value) {
            addCriterion("Pro_No like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotLike(String value) {
            addCriterion("Pro_No not like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoIn(List<String> values) {
            addCriterion("Pro_No in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotIn(List<String> values) {
            addCriterion("Pro_No not in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoBetween(String value1, String value2) {
            addCriterion("Pro_No between", value1, value2, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotBetween(String value1, String value2) {
            addCriterion("Pro_No not between", value1, value2, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("Pro_Name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("Pro_Name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("Pro_Name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("Pro_Name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("Pro_Name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("Pro_Name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("Pro_Name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("Pro_Name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("Pro_Name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("Pro_Name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("Pro_Name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("Pro_Name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("Pro_Name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("Pro_Name not between", value1, value2, "proName");
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

        public Criteria andWarehousecodeIsNull() {
            addCriterion("WarehouseCode is null");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeIsNotNull() {
            addCriterion("WarehouseCode is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeEqualTo(String value) {
            addCriterion("WarehouseCode =", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeNotEqualTo(String value) {
            addCriterion("WarehouseCode <>", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeGreaterThan(String value) {
            addCriterion("WarehouseCode >", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeGreaterThanOrEqualTo(String value) {
            addCriterion("WarehouseCode >=", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeLessThan(String value) {
            addCriterion("WarehouseCode <", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeLessThanOrEqualTo(String value) {
            addCriterion("WarehouseCode <=", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeLike(String value) {
            addCriterion("WarehouseCode like", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeNotLike(String value) {
            addCriterion("WarehouseCode not like", value, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeIn(List<String> values) {
            addCriterion("WarehouseCode in", values, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeNotIn(List<String> values) {
            addCriterion("WarehouseCode not in", values, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeBetween(String value1, String value2) {
            addCriterion("WarehouseCode between", value1, value2, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeNotBetween(String value1, String value2) {
            addCriterion("WarehouseCode not between", value1, value2, "warehousecode");
            return (Criteria) this;
        }

        public Criteria andBincodeIsNull() {
            addCriterion("BinCode is null");
            return (Criteria) this;
        }

        public Criteria andBincodeIsNotNull() {
            addCriterion("BinCode is not null");
            return (Criteria) this;
        }

        public Criteria andBincodeEqualTo(String value) {
            addCriterion("BinCode =", value, "bincode");
            return (Criteria) this;
        }

        public Criteria andBincodeNotEqualTo(String value) {
            addCriterion("BinCode <>", value, "bincode");
            return (Criteria) this;
        }

        public Criteria andBincodeGreaterThan(String value) {
            addCriterion("BinCode >", value, "bincode");
            return (Criteria) this;
        }

        public Criteria andBincodeGreaterThanOrEqualTo(String value) {
            addCriterion("BinCode >=", value, "bincode");
            return (Criteria) this;
        }

        public Criteria andBincodeLessThan(String value) {
            addCriterion("BinCode <", value, "bincode");
            return (Criteria) this;
        }

        public Criteria andBincodeLessThanOrEqualTo(String value) {
            addCriterion("BinCode <=", value, "bincode");
            return (Criteria) this;
        }

        public Criteria andBincodeLike(String value) {
            addCriterion("BinCode like", value, "bincode");
            return (Criteria) this;
        }

        public Criteria andBincodeNotLike(String value) {
            addCriterion("BinCode not like", value, "bincode");
            return (Criteria) this;
        }

        public Criteria andBincodeIn(List<String> values) {
            addCriterion("BinCode in", values, "bincode");
            return (Criteria) this;
        }

        public Criteria andBincodeNotIn(List<String> values) {
            addCriterion("BinCode not in", values, "bincode");
            return (Criteria) this;
        }

        public Criteria andBincodeBetween(String value1, String value2) {
            addCriterion("BinCode between", value1, value2, "bincode");
            return (Criteria) this;
        }

        public Criteria andBincodeNotBetween(String value1, String value2) {
            addCriterion("BinCode not between", value1, value2, "bincode");
            return (Criteria) this;
        }

        public Criteria andDCreateIsNull() {
            addCriterion("D_Create is null");
            return (Criteria) this;
        }

        public Criteria andDCreateIsNotNull() {
            addCriterion("D_Create is not null");
            return (Criteria) this;
        }

        public Criteria andDCreateEqualTo(String value) {
            addCriterion("D_Create =", value, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreateNotEqualTo(String value) {
            addCriterion("D_Create <>", value, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreateGreaterThan(String value) {
            addCriterion("D_Create >", value, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreateGreaterThanOrEqualTo(String value) {
            addCriterion("D_Create >=", value, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreateLessThan(String value) {
            addCriterion("D_Create <", value, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreateLessThanOrEqualTo(String value) {
            addCriterion("D_Create <=", value, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreateLike(String value) {
            addCriterion("D_Create like", value, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreateNotLike(String value) {
            addCriterion("D_Create not like", value, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreateIn(List<String> values) {
            addCriterion("D_Create in", values, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreateNotIn(List<String> values) {
            addCriterion("D_Create not in", values, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreateBetween(String value1, String value2) {
            addCriterion("D_Create between", value1, value2, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreateNotBetween(String value1, String value2) {
            addCriterion("D_Create not between", value1, value2, "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateIsNull() {
            addCriterion("D_CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andDCreatedateIsNotNull() {
            addCriterion("D_CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andDCreatedateEqualTo(String value) {
            addCriterion("D_CreateDate =", value, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateNotEqualTo(String value) {
            addCriterion("D_CreateDate <>", value, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateGreaterThan(String value) {
            addCriterion("D_CreateDate >", value, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("D_CreateDate >=", value, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateLessThan(String value) {
            addCriterion("D_CreateDate <", value, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateLessThanOrEqualTo(String value) {
            addCriterion("D_CreateDate <=", value, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateLike(String value) {
            addCriterion("D_CreateDate like", value, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateNotLike(String value) {
            addCriterion("D_CreateDate not like", value, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateIn(List<String> values) {
            addCriterion("D_CreateDate in", values, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateNotIn(List<String> values) {
            addCriterion("D_CreateDate not in", values, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateBetween(String value1, String value2) {
            addCriterion("D_CreateDate between", value1, value2, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateNotBetween(String value1, String value2) {
            addCriterion("D_CreateDate not between", value1, value2, "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDBarcodeIsNull() {
            addCriterion("D_BarCode is null");
            return (Criteria) this;
        }

        public Criteria andDBarcodeIsNotNull() {
            addCriterion("D_BarCode is not null");
            return (Criteria) this;
        }

        public Criteria andDBarcodeEqualTo(String value) {
            addCriterion("D_BarCode =", value, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDBarcodeNotEqualTo(String value) {
            addCriterion("D_BarCode <>", value, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDBarcodeGreaterThan(String value) {
            addCriterion("D_BarCode >", value, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("D_BarCode >=", value, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDBarcodeLessThan(String value) {
            addCriterion("D_BarCode <", value, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDBarcodeLessThanOrEqualTo(String value) {
            addCriterion("D_BarCode <=", value, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDBarcodeLike(String value) {
            addCriterion("D_BarCode like", value, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDBarcodeNotLike(String value) {
            addCriterion("D_BarCode not like", value, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDBarcodeIn(List<String> values) {
            addCriterion("D_BarCode in", values, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDBarcodeNotIn(List<String> values) {
            addCriterion("D_BarCode not in", values, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDBarcodeBetween(String value1, String value2) {
            addCriterion("D_BarCode between", value1, value2, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDBarcodeNotBetween(String value1, String value2) {
            addCriterion("D_BarCode not between", value1, value2, "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDRfidIsNull() {
            addCriterion("D_RFID is null");
            return (Criteria) this;
        }

        public Criteria andDRfidIsNotNull() {
            addCriterion("D_RFID is not null");
            return (Criteria) this;
        }

        public Criteria andDRfidEqualTo(String value) {
            addCriterion("D_RFID =", value, "dRfid");
            return (Criteria) this;
        }

        public Criteria andDRfidNotEqualTo(String value) {
            addCriterion("D_RFID <>", value, "dRfid");
            return (Criteria) this;
        }

        public Criteria andDRfidGreaterThan(String value) {
            addCriterion("D_RFID >", value, "dRfid");
            return (Criteria) this;
        }

        public Criteria andDRfidGreaterThanOrEqualTo(String value) {
            addCriterion("D_RFID >=", value, "dRfid");
            return (Criteria) this;
        }

        public Criteria andDRfidLessThan(String value) {
            addCriterion("D_RFID <", value, "dRfid");
            return (Criteria) this;
        }

        public Criteria andDRfidLessThanOrEqualTo(String value) {
            addCriterion("D_RFID <=", value, "dRfid");
            return (Criteria) this;
        }

        public Criteria andDRfidLike(String value) {
            addCriterion("D_RFID like", value, "dRfid");
            return (Criteria) this;
        }

        public Criteria andDRfidNotLike(String value) {
            addCriterion("D_RFID not like", value, "dRfid");
            return (Criteria) this;
        }

        public Criteria andDRfidIn(List<String> values) {
            addCriterion("D_RFID in", values, "dRfid");
            return (Criteria) this;
        }

        public Criteria andDRfidNotIn(List<String> values) {
            addCriterion("D_RFID not in", values, "dRfid");
            return (Criteria) this;
        }

        public Criteria andDRfidBetween(String value1, String value2) {
            addCriterion("D_RFID between", value1, value2, "dRfid");
            return (Criteria) this;
        }

        public Criteria andDRfidNotBetween(String value1, String value2) {
            addCriterion("D_RFID not between", value1, value2, "dRfid");
            return (Criteria) this;
        }

        public Criteria andBinnameIsNull() {
            addCriterion("binname is null");
            return (Criteria) this;
        }

        public Criteria andBinnameIsNotNull() {
            addCriterion("binname is not null");
            return (Criteria) this;
        }

        public Criteria andBinnameEqualTo(String value) {
            addCriterion("binname =", value, "binname");
            return (Criteria) this;
        }

        public Criteria andBinnameNotEqualTo(String value) {
            addCriterion("binname <>", value, "binname");
            return (Criteria) this;
        }

        public Criteria andBinnameGreaterThan(String value) {
            addCriterion("binname >", value, "binname");
            return (Criteria) this;
        }

        public Criteria andBinnameGreaterThanOrEqualTo(String value) {
            addCriterion("binname >=", value, "binname");
            return (Criteria) this;
        }

        public Criteria andBinnameLessThan(String value) {
            addCriterion("binname <", value, "binname");
            return (Criteria) this;
        }

        public Criteria andBinnameLessThanOrEqualTo(String value) {
            addCriterion("binname <=", value, "binname");
            return (Criteria) this;
        }

        public Criteria andBinnameLike(String value) {
            addCriterion("binname like", value, "binname");
            return (Criteria) this;
        }

        public Criteria andBinnameNotLike(String value) {
            addCriterion("binname not like", value, "binname");
            return (Criteria) this;
        }

        public Criteria andBinnameIn(List<String> values) {
            addCriterion("binname in", values, "binname");
            return (Criteria) this;
        }

        public Criteria andBinnameNotIn(List<String> values) {
            addCriterion("binname not in", values, "binname");
            return (Criteria) this;
        }

        public Criteria andBinnameBetween(String value1, String value2) {
            addCriterion("binname between", value1, value2, "binname");
            return (Criteria) this;
        }

        public Criteria andBinnameNotBetween(String value1, String value2) {
            addCriterion("binname not between", value1, value2, "binname");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIsNull() {
            addCriterion("Warehousename is null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIsNotNull() {
            addCriterion("Warehousename is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameEqualTo(String value) {
            addCriterion("Warehousename =", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotEqualTo(String value) {
            addCriterion("Warehousename <>", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThan(String value) {
            addCriterion("Warehousename >", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThanOrEqualTo(String value) {
            addCriterion("Warehousename >=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThan(String value) {
            addCriterion("Warehousename <", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThanOrEqualTo(String value) {
            addCriterion("Warehousename <=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLike(String value) {
            addCriterion("Warehousename like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotLike(String value) {
            addCriterion("Warehousename not like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIn(List<String> values) {
            addCriterion("Warehousename in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotIn(List<String> values) {
            addCriterion("Warehousename not in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameBetween(String value1, String value2) {
            addCriterion("Warehousename between", value1, value2, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotBetween(String value1, String value2) {
            addCriterion("Warehousename not between", value1, value2, "warehousename");
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

        public Criteria andDParentidLikeInsensitive(String value) {
            addCriterion("upper(D_ParentID) like", value.toUpperCase(), "dParentid");
            return (Criteria) this;
        }

        public Criteria andParentidLikeInsensitive(String value) {
            addCriterion("upper(ParentID) like", value.toUpperCase(), "parentid");
            return (Criteria) this;
        }

        public Criteria andContractnoLikeInsensitive(String value) {
            addCriterion("upper(ContractNo) like", value.toUpperCase(), "contractno");
            return (Criteria) this;
        }

        public Criteria andProNoLikeInsensitive(String value) {
            addCriterion("upper(Pro_No) like", value.toUpperCase(), "proNo");
            return (Criteria) this;
        }

        public Criteria andProNameLikeInsensitive(String value) {
            addCriterion("upper(Pro_Name) like", value.toUpperCase(), "proName");
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

        public Criteria andDFurnacenoLikeInsensitive(String value) {
            addCriterion("upper(D_FurnaceNo) like", value.toUpperCase(), "dFurnaceno");
            return (Criteria) this;
        }

        public Criteria andDUnitLikeInsensitive(String value) {
            addCriterion("upper(D_Unit) like", value.toUpperCase(), "dUnit");
            return (Criteria) this;
        }

        public Criteria andWarehousecodeLikeInsensitive(String value) {
            addCriterion("upper(WarehouseCode) like", value.toUpperCase(), "warehousecode");
            return (Criteria) this;
        }

        public Criteria andBincodeLikeInsensitive(String value) {
            addCriterion("upper(BinCode) like", value.toUpperCase(), "bincode");
            return (Criteria) this;
        }

        public Criteria andDCreateLikeInsensitive(String value) {
            addCriterion("upper(D_Create) like", value.toUpperCase(), "dCreate");
            return (Criteria) this;
        }

        public Criteria andDCreatedateLikeInsensitive(String value) {
            addCriterion("upper(D_CreateDate) like", value.toUpperCase(), "dCreatedate");
            return (Criteria) this;
        }

        public Criteria andDBarcodeLikeInsensitive(String value) {
            addCriterion("upper(D_BarCode) like", value.toUpperCase(), "dBarcode");
            return (Criteria) this;
        }

        public Criteria andDRfidLikeInsensitive(String value) {
            addCriterion("upper(D_RFID) like", value.toUpperCase(), "dRfid");
            return (Criteria) this;
        }

        public Criteria andBinnameLikeInsensitive(String value) {
            addCriterion("upper(binname) like", value.toUpperCase(), "binname");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLikeInsensitive(String value) {
            addCriterion("upper(Warehousename) like", value.toUpperCase(), "warehousename");
            return (Criteria) this;
        }

        public Criteria andDStandardsLikeInsensitive(String value) {
            addCriterion("upper(D_Standards) like", value.toUpperCase(), "dStandards");
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