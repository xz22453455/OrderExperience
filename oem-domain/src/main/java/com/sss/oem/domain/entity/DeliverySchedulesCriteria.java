package com.sss.oem.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class DeliverySchedulesCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverySchedulesCriteria() {
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

        public Criteria andDSourceIsNull() {
            addCriterion("D_Source is null");
            return (Criteria) this;
        }

        public Criteria andDSourceIsNotNull() {
            addCriterion("D_Source is not null");
            return (Criteria) this;
        }

        public Criteria andDSourceEqualTo(String value) {
            addCriterion("D_Source =", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceNotEqualTo(String value) {
            addCriterion("D_Source <>", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceGreaterThan(String value) {
            addCriterion("D_Source >", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceGreaterThanOrEqualTo(String value) {
            addCriterion("D_Source >=", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceLessThan(String value) {
            addCriterion("D_Source <", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceLessThanOrEqualTo(String value) {
            addCriterion("D_Source <=", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceLike(String value) {
            addCriterion("D_Source like", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceNotLike(String value) {
            addCriterion("D_Source not like", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceIn(List<String> values) {
            addCriterion("D_Source in", values, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceNotIn(List<String> values) {
            addCriterion("D_Source not in", values, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceBetween(String value1, String value2) {
            addCriterion("D_Source between", value1, value2, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceNotBetween(String value1, String value2) {
            addCriterion("D_Source not between", value1, value2, "dSource");
            return (Criteria) this;
        }

        public Criteria andDCustomernoIsNull() {
            addCriterion("D_CustomerNo is null");
            return (Criteria) this;
        }

        public Criteria andDCustomernoIsNotNull() {
            addCriterion("D_CustomerNo is not null");
            return (Criteria) this;
        }

        public Criteria andDCustomernoEqualTo(String value) {
            addCriterion("D_CustomerNo =", value, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDCustomernoNotEqualTo(String value) {
            addCriterion("D_CustomerNo <>", value, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDCustomernoGreaterThan(String value) {
            addCriterion("D_CustomerNo >", value, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDCustomernoGreaterThanOrEqualTo(String value) {
            addCriterion("D_CustomerNo >=", value, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDCustomernoLessThan(String value) {
            addCriterion("D_CustomerNo <", value, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDCustomernoLessThanOrEqualTo(String value) {
            addCriterion("D_CustomerNo <=", value, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDCustomernoLike(String value) {
            addCriterion("D_CustomerNo like", value, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDCustomernoNotLike(String value) {
            addCriterion("D_CustomerNo not like", value, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDCustomernoIn(List<String> values) {
            addCriterion("D_CustomerNo in", values, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDCustomernoNotIn(List<String> values) {
            addCriterion("D_CustomerNo not in", values, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDCustomernoBetween(String value1, String value2) {
            addCriterion("D_CustomerNo between", value1, value2, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDCustomernoNotBetween(String value1, String value2) {
            addCriterion("D_CustomerNo not between", value1, value2, "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDContractnoIsNull() {
            addCriterion("D_ContractNo is null");
            return (Criteria) this;
        }

        public Criteria andDContractnoIsNotNull() {
            addCriterion("D_ContractNo is not null");
            return (Criteria) this;
        }

        public Criteria andDContractnoEqualTo(String value) {
            addCriterion("D_ContractNo =", value, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDContractnoNotEqualTo(String value) {
            addCriterion("D_ContractNo <>", value, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDContractnoGreaterThan(String value) {
            addCriterion("D_ContractNo >", value, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDContractnoGreaterThanOrEqualTo(String value) {
            addCriterion("D_ContractNo >=", value, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDContractnoLessThan(String value) {
            addCriterion("D_ContractNo <", value, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDContractnoLessThanOrEqualTo(String value) {
            addCriterion("D_ContractNo <=", value, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDContractnoLike(String value) {
            addCriterion("D_ContractNo like", value, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDContractnoNotLike(String value) {
            addCriterion("D_ContractNo not like", value, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDContractnoIn(List<String> values) {
            addCriterion("D_ContractNo in", values, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDContractnoNotIn(List<String> values) {
            addCriterion("D_ContractNo not in", values, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDContractnoBetween(String value1, String value2) {
            addCriterion("D_ContractNo between", value1, value2, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDContractnoNotBetween(String value1, String value2) {
            addCriterion("D_ContractNo not between", value1, value2, "dContractno");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("DeliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("DeliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(String value) {
            addCriterion("DeliveryDate =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(String value) {
            addCriterion("DeliveryDate <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(String value) {
            addCriterion("DeliveryDate >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(String value) {
            addCriterion("DeliveryDate >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(String value) {
            addCriterion("DeliveryDate <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(String value) {
            addCriterion("DeliveryDate <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLike(String value) {
            addCriterion("DeliveryDate like", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotLike(String value) {
            addCriterion("DeliveryDate not like", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<String> values) {
            addCriterion("DeliveryDate in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<String> values) {
            addCriterion("DeliveryDate not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(String value1, String value2) {
            addCriterion("DeliveryDate between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(String value1, String value2) {
            addCriterion("DeliveryDate not between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("OrderDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("OrderDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(String value) {
            addCriterion("OrderDate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(String value) {
            addCriterion("OrderDate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(String value) {
            addCriterion("OrderDate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(String value) {
            addCriterion("OrderDate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(String value) {
            addCriterion("OrderDate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(String value) {
            addCriterion("OrderDate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLike(String value) {
            addCriterion("OrderDate like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotLike(String value) {
            addCriterion("OrderDate not like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<String> values) {
            addCriterion("OrderDate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<String> values) {
            addCriterion("OrderDate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(String value1, String value2) {
            addCriterion("OrderDate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(String value1, String value2) {
            addCriterion("OrderDate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsIsNull() {
            addCriterion("Package_Requirements is null");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsIsNotNull() {
            addCriterion("Package_Requirements is not null");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsEqualTo(String value) {
            addCriterion("Package_Requirements =", value, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsNotEqualTo(String value) {
            addCriterion("Package_Requirements <>", value, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsGreaterThan(String value) {
            addCriterion("Package_Requirements >", value, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("Package_Requirements >=", value, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsLessThan(String value) {
            addCriterion("Package_Requirements <", value, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsLessThanOrEqualTo(String value) {
            addCriterion("Package_Requirements <=", value, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsLike(String value) {
            addCriterion("Package_Requirements like", value, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsNotLike(String value) {
            addCriterion("Package_Requirements not like", value, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsIn(List<String> values) {
            addCriterion("Package_Requirements in", values, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsNotIn(List<String> values) {
            addCriterion("Package_Requirements not in", values, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsBetween(String value1, String value2) {
            addCriterion("Package_Requirements between", value1, value2, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsNotBetween(String value1, String value2) {
            addCriterion("Package_Requirements not between", value1, value2, "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andSettlementIsNull() {
            addCriterion("Settlement is null");
            return (Criteria) this;
        }

        public Criteria andSettlementIsNotNull() {
            addCriterion("Settlement is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementEqualTo(String value) {
            addCriterion("Settlement =", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementNotEqualTo(String value) {
            addCriterion("Settlement <>", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementGreaterThan(String value) {
            addCriterion("Settlement >", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementGreaterThanOrEqualTo(String value) {
            addCriterion("Settlement >=", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementLessThan(String value) {
            addCriterion("Settlement <", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementLessThanOrEqualTo(String value) {
            addCriterion("Settlement <=", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementLike(String value) {
            addCriterion("Settlement like", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementNotLike(String value) {
            addCriterion("Settlement not like", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementIn(List<String> values) {
            addCriterion("Settlement in", values, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementNotIn(List<String> values) {
            addCriterion("Settlement not in", values, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementBetween(String value1, String value2) {
            addCriterion("Settlement between", value1, value2, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementNotBetween(String value1, String value2) {
            addCriterion("Settlement not between", value1, value2, "settlement");
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

        public Criteria andDAudtingIsNull() {
            addCriterion("D_Audting is null");
            return (Criteria) this;
        }

        public Criteria andDAudtingIsNotNull() {
            addCriterion("D_Audting is not null");
            return (Criteria) this;
        }

        public Criteria andDAudtingEqualTo(String value) {
            addCriterion("D_Audting =", value, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingNotEqualTo(String value) {
            addCriterion("D_Audting <>", value, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingGreaterThan(String value) {
            addCriterion("D_Audting >", value, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingGreaterThanOrEqualTo(String value) {
            addCriterion("D_Audting >=", value, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingLessThan(String value) {
            addCriterion("D_Audting <", value, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingLessThanOrEqualTo(String value) {
            addCriterion("D_Audting <=", value, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingLike(String value) {
            addCriterion("D_Audting like", value, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingNotLike(String value) {
            addCriterion("D_Audting not like", value, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingIn(List<String> values) {
            addCriterion("D_Audting in", values, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingNotIn(List<String> values) {
            addCriterion("D_Audting not in", values, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingBetween(String value1, String value2) {
            addCriterion("D_Audting between", value1, value2, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingNotBetween(String value1, String value2) {
            addCriterion("D_Audting not between", value1, value2, "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateIsNull() {
            addCriterion("D_AudtingDate is null");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateIsNotNull() {
            addCriterion("D_AudtingDate is not null");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateEqualTo(String value) {
            addCriterion("D_AudtingDate =", value, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateNotEqualTo(String value) {
            addCriterion("D_AudtingDate <>", value, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateGreaterThan(String value) {
            addCriterion("D_AudtingDate >", value, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateGreaterThanOrEqualTo(String value) {
            addCriterion("D_AudtingDate >=", value, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateLessThan(String value) {
            addCriterion("D_AudtingDate <", value, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateLessThanOrEqualTo(String value) {
            addCriterion("D_AudtingDate <=", value, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateLike(String value) {
            addCriterion("D_AudtingDate like", value, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateNotLike(String value) {
            addCriterion("D_AudtingDate not like", value, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateIn(List<String> values) {
            addCriterion("D_AudtingDate in", values, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateNotIn(List<String> values) {
            addCriterion("D_AudtingDate not in", values, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateBetween(String value1, String value2) {
            addCriterion("D_AudtingDate between", value1, value2, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateNotBetween(String value1, String value2) {
            addCriterion("D_AudtingDate not between", value1, value2, "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andDUrgencyIsNull() {
            addCriterion("D_Urgency is null");
            return (Criteria) this;
        }

        public Criteria andDUrgencyIsNotNull() {
            addCriterion("D_Urgency is not null");
            return (Criteria) this;
        }

        public Criteria andDUrgencyEqualTo(Integer value) {
            addCriterion("D_Urgency =", value, "dUrgency");
            return (Criteria) this;
        }

        public Criteria andDUrgencyNotEqualTo(Integer value) {
            addCriterion("D_Urgency <>", value, "dUrgency");
            return (Criteria) this;
        }

        public Criteria andDUrgencyGreaterThan(Integer value) {
            addCriterion("D_Urgency >", value, "dUrgency");
            return (Criteria) this;
        }

        public Criteria andDUrgencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_Urgency >=", value, "dUrgency");
            return (Criteria) this;
        }

        public Criteria andDUrgencyLessThan(Integer value) {
            addCriterion("D_Urgency <", value, "dUrgency");
            return (Criteria) this;
        }

        public Criteria andDUrgencyLessThanOrEqualTo(Integer value) {
            addCriterion("D_Urgency <=", value, "dUrgency");
            return (Criteria) this;
        }

        public Criteria andDUrgencyIn(List<Integer> values) {
            addCriterion("D_Urgency in", values, "dUrgency");
            return (Criteria) this;
        }

        public Criteria andDUrgencyNotIn(List<Integer> values) {
            addCriterion("D_Urgency not in", values, "dUrgency");
            return (Criteria) this;
        }

        public Criteria andDUrgencyBetween(Integer value1, Integer value2) {
            addCriterion("D_Urgency between", value1, value2, "dUrgency");
            return (Criteria) this;
        }

        public Criteria andDUrgencyNotBetween(Integer value1, Integer value2) {
            addCriterion("D_Urgency not between", value1, value2, "dUrgency");
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

        public Criteria andUsercodeIsNull() {
            addCriterion("UserCode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("UserCode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("UserCode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("UserCode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("UserCode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("UserCode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("UserCode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("UserCode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("UserCode like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("UserCode not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("UserCode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("UserCode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("UserCode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("UserCode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNull() {
            addCriterion("plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(String value) {
            addCriterion("plan_date =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(String value) {
            addCriterion("plan_date <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(String value) {
            addCriterion("plan_date >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(String value) {
            addCriterion("plan_date >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(String value) {
            addCriterion("plan_date <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(String value) {
            addCriterion("plan_date <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLike(String value) {
            addCriterion("plan_date like", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotLike(String value) {
            addCriterion("plan_date not like", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<String> values) {
            addCriterion("plan_date in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<String> values) {
            addCriterion("plan_date not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(String value1, String value2) {
            addCriterion("plan_date between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(String value1, String value2) {
            addCriterion("plan_date not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andDNoLikeInsensitive(String value) {
            addCriterion("upper(D_No) like", value.toUpperCase(), "dNo");
            return (Criteria) this;
        }

        public Criteria andDSourceLikeInsensitive(String value) {
            addCriterion("upper(D_Source) like", value.toUpperCase(), "dSource");
            return (Criteria) this;
        }

        public Criteria andDCustomernoLikeInsensitive(String value) {
            addCriterion("upper(D_CustomerNo) like", value.toUpperCase(), "dCustomerno");
            return (Criteria) this;
        }

        public Criteria andDContractnoLikeInsensitive(String value) {
            addCriterion("upper(D_ContractNo) like", value.toUpperCase(), "dContractno");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLikeInsensitive(String value) {
            addCriterion("upper(DeliveryDate) like", value.toUpperCase(), "deliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLikeInsensitive(String value) {
            addCriterion("upper(OrderDate) like", value.toUpperCase(), "orderdate");
            return (Criteria) this;
        }

        public Criteria andPackageRequirementsLikeInsensitive(String value) {
            addCriterion("upper(Package_Requirements) like", value.toUpperCase(), "packageRequirements");
            return (Criteria) this;
        }

        public Criteria andSettlementLikeInsensitive(String value) {
            addCriterion("upper(Settlement) like", value.toUpperCase(), "settlement");
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

        public Criteria andDAudtingLikeInsensitive(String value) {
            addCriterion("upper(D_Audting) like", value.toUpperCase(), "dAudting");
            return (Criteria) this;
        }

        public Criteria andDAudtingdateLikeInsensitive(String value) {
            addCriterion("upper(D_AudtingDate) like", value.toUpperCase(), "dAudtingdate");
            return (Criteria) this;
        }

        public Criteria andUsercodeLikeInsensitive(String value) {
            addCriterion("upper(UserCode) like", value.toUpperCase(), "usercode");
            return (Criteria) this;
        }

        public Criteria andPlanDateLikeInsensitive(String value) {
            addCriterion("upper(plan_date) like", value.toUpperCase(), "planDate");
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