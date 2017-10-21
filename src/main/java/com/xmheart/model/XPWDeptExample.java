package com.xmheart.model;

import java.util.ArrayList;
import java.util.List;

public class XPWDeptExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    public XPWDeptExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlIsNull() {
            addCriterion("dept_doctor_url is null");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlIsNotNull() {
            addCriterion("dept_doctor_url is not null");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlEqualTo(String value) {
            addCriterion("dept_doctor_url =", value, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlNotEqualTo(String value) {
            addCriterion("dept_doctor_url <>", value, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlGreaterThan(String value) {
            addCriterion("dept_doctor_url >", value, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlGreaterThanOrEqualTo(String value) {
            addCriterion("dept_doctor_url >=", value, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlLessThan(String value) {
            addCriterion("dept_doctor_url <", value, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlLessThanOrEqualTo(String value) {
            addCriterion("dept_doctor_url <=", value, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlLike(String value) {
            addCriterion("dept_doctor_url like", value, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlNotLike(String value) {
            addCriterion("dept_doctor_url not like", value, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlIn(List<String> values) {
            addCriterion("dept_doctor_url in", values, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlNotIn(List<String> values) {
            addCriterion("dept_doctor_url not in", values, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlBetween(String value1, String value2) {
            addCriterion("dept_doctor_url between", value1, value2, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andDeptDoctorUrlNotBetween(String value1, String value2) {
            addCriterion("dept_doctor_url not between", value1, value2, "deptDoctorUrl");
            return (Criteria) this;
        }

        public Criteria andOutServiceIsNull() {
            addCriterion("out_service is null");
            return (Criteria) this;
        }

        public Criteria andOutServiceIsNotNull() {
            addCriterion("out_service is not null");
            return (Criteria) this;
        }

        public Criteria andOutServiceEqualTo(Boolean value) {
            addCriterion("out_service =", value, "outService");
            return (Criteria) this;
        }

        public Criteria andOutServiceNotEqualTo(Boolean value) {
            addCriterion("out_service <>", value, "outService");
            return (Criteria) this;
        }

        public Criteria andOutServiceGreaterThan(Boolean value) {
            addCriterion("out_service >", value, "outService");
            return (Criteria) this;
        }

        public Criteria andOutServiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("out_service >=", value, "outService");
            return (Criteria) this;
        }

        public Criteria andOutServiceLessThan(Boolean value) {
            addCriterion("out_service <", value, "outService");
            return (Criteria) this;
        }

        public Criteria andOutServiceLessThanOrEqualTo(Boolean value) {
            addCriterion("out_service <=", value, "outService");
            return (Criteria) this;
        }

        public Criteria andOutServiceIn(List<Boolean> values) {
            addCriterion("out_service in", values, "outService");
            return (Criteria) this;
        }

        public Criteria andOutServiceNotIn(List<Boolean> values) {
            addCriterion("out_service not in", values, "outService");
            return (Criteria) this;
        }

        public Criteria andOutServiceBetween(Boolean value1, Boolean value2) {
            addCriterion("out_service between", value1, value2, "outService");
            return (Criteria) this;
        }

        public Criteria andOutServiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("out_service not between", value1, value2, "outService");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdIsNull() {
            addCriterion("admin_expert_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdIsNotNull() {
            addCriterion("admin_expert_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdEqualTo(Long value) {
            addCriterion("admin_expert_id =", value, "adminExpertId");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdNotEqualTo(Long value) {
            addCriterion("admin_expert_id <>", value, "adminExpertId");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdGreaterThan(Long value) {
            addCriterion("admin_expert_id >", value, "adminExpertId");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdGreaterThanOrEqualTo(Long value) {
            addCriterion("admin_expert_id >=", value, "adminExpertId");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdLessThan(Long value) {
            addCriterion("admin_expert_id <", value, "adminExpertId");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdLessThanOrEqualTo(Long value) {
            addCriterion("admin_expert_id <=", value, "adminExpertId");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdIn(List<Long> values) {
            addCriterion("admin_expert_id in", values, "adminExpertId");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdNotIn(List<Long> values) {
            addCriterion("admin_expert_id not in", values, "adminExpertId");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdBetween(Long value1, Long value2) {
            addCriterion("admin_expert_id between", value1, value2, "adminExpertId");
            return (Criteria) this;
        }

        public Criteria andAdminExpertIdNotBetween(Long value1, Long value2) {
            addCriterion("admin_expert_id not between", value1, value2, "adminExpertId");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedIsNull() {
            addCriterion("is_displayed is null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedIsNotNull() {
            addCriterion("is_displayed is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedEqualTo(Boolean value) {
            addCriterion("is_displayed =", value, "isDisplayed");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedNotEqualTo(Boolean value) {
            addCriterion("is_displayed <>", value, "isDisplayed");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedGreaterThan(Boolean value) {
            addCriterion("is_displayed >", value, "isDisplayed");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_displayed >=", value, "isDisplayed");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedLessThan(Boolean value) {
            addCriterion("is_displayed <", value, "isDisplayed");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_displayed <=", value, "isDisplayed");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedIn(List<Boolean> values) {
            addCriterion("is_displayed in", values, "isDisplayed");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedNotIn(List<Boolean> values) {
            addCriterion("is_displayed not in", values, "isDisplayed");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_displayed between", value1, value2, "isDisplayed");
            return (Criteria) this;
        }

        public Criteria andIsDisplayedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_displayed not between", value1, value2, "isDisplayed");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table xpw_dept
     * @mbg.generated  Sat Oct 21 22:44:29 CST 2017
     */
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

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table xpw_dept
     *
     * @mbg.generated do_not_delete_during_merge Thu Sep 07 16:12:38 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}