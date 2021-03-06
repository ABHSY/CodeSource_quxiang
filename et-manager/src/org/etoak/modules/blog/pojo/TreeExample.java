package org.etoak.modules.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class TreeExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    public TreeExample()
    {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    public String getOrderByClause()
    {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    public void setDistinct(boolean distinct)
    {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    public boolean isDistinct()
    {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    public List<Criteria> getOredCriteria()
    {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    public Criteria or()
    {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    public Criteria createCriteria()
    {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0)
        {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    protected Criteria createCriteriaInternal()
    {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    public void clear()
    {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    protected abstract static class GeneratedCriteria
    {
        protected List<Criterion> criteria;
        
        protected GeneratedCriteria()
        {
            super();
            criteria = new ArrayList<Criterion>();
        }
        
        public boolean isValid()
        {
            return criteria.size() > 0;
        }
        
        public List<Criterion> getAllCriteria()
        {
            return criteria;
        }
        
        public List<Criterion> getCriteria()
        {
            return criteria;
        }
        
        protected void addCriterion(String condition)
        {
            if (condition == null)
            {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }
        
        protected void addCriterion(String condition, Object value, String property)
        {
            if (value == null)
            {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }
        
        protected void addCriterion(String condition, Object value1, Object value2, String property)
        {
            if (value1 == null || value2 == null)
            {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
        
        public Criteria andIDIsNull()
        {
            addCriterion("ID is null");
            return (Criteria)this;
        }
        
        public Criteria andIDIsNotNull()
        {
            addCriterion("ID is not null");
            return (Criteria)this;
        }
        
        public Criteria andIDEqualTo(Integer value)
        {
            addCriterion("ID =", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDNotEqualTo(Integer value)
        {
            addCriterion("ID <>", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDGreaterThan(Integer value)
        {
            addCriterion("ID >", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("ID >=", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDLessThan(Integer value)
        {
            addCriterion("ID <", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDLessThanOrEqualTo(Integer value)
        {
            addCriterion("ID <=", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDIn(List<Integer> values)
        {
            addCriterion("ID in", values, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDNotIn(List<Integer> values)
        {
            addCriterion("ID not in", values, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDBetween(Integer value1, Integer value2)
        {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDNotBetween(Integer value1, Integer value2)
        {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria)this;
        }
        
        public Criteria andNAMEIsNull()
        {
            addCriterion("NAME is null");
            return (Criteria)this;
        }
        
        public Criteria andNAMEIsNotNull()
        {
            addCriterion("NAME is not null");
            return (Criteria)this;
        }
        
        public Criteria andNAMEEqualTo(String value)
        {
            addCriterion("NAME =", value, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andNAMENotEqualTo(String value)
        {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andNAMEGreaterThan(String value)
        {
            addCriterion("NAME >", value, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andNAMEGreaterThanOrEqualTo(String value)
        {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andNAMELessThan(String value)
        {
            addCriterion("NAME <", value, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andNAMELessThanOrEqualTo(String value)
        {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andNAMELike(String value)
        {
            addCriterion("NAME like", value, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andNAMENotLike(String value)
        {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andNAMEIn(List<String> values)
        {
            addCriterion("NAME in", values, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andNAMENotIn(List<String> values)
        {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andNAMEBetween(String value1, String value2)
        {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andNAMENotBetween(String value1, String value2)
        {
            addCriterion("NAME not between", value1, value2, "NAME");
            return (Criteria)this;
        }
        
        public Criteria andPIDIsNull()
        {
            addCriterion("PID is null");
            return (Criteria)this;
        }
        
        public Criteria andPIDIsNotNull()
        {
            addCriterion("PID is not null");
            return (Criteria)this;
        }
        
        public Criteria andPIDEqualTo(String value)
        {
            addCriterion("PID =", value, "PID");
            return (Criteria)this;
        }
        
        public Criteria andPIDNotEqualTo(String value)
        {
            addCriterion("PID <>", value, "PID");
            return (Criteria)this;
        }
        
        public Criteria andPIDGreaterThan(String value)
        {
            addCriterion("PID >", value, "PID");
            return (Criteria)this;
        }
        
        public Criteria andPIDGreaterThanOrEqualTo(String value)
        {
            addCriterion("PID >=", value, "PID");
            return (Criteria)this;
        }
        
        public Criteria andPIDLessThan(String value)
        {
            addCriterion("PID <", value, "PID");
            return (Criteria)this;
        }
        
        public Criteria andPIDLessThanOrEqualTo(String value)
        {
            addCriterion("PID <=", value, "PID");
            return (Criteria)this;
        }
        
        public Criteria andPIDLike(String value)
        {
            addCriterion("PID like", value, "PID");
            return (Criteria)this;
        }
        
        public Criteria andPIDNotLike(String value)
        {
            addCriterion("PID not like", value, "PID");
            return (Criteria)this;
        }
        
        public Criteria andPIDIn(List<String> values)
        {
            addCriterion("PID in", values, "PID");
            return (Criteria)this;
        }
        
        public Criteria andPIDNotIn(List<String> values)
        {
            addCriterion("PID not in", values, "PID");
            return (Criteria)this;
        }
        
        public Criteria andPIDBetween(String value1, String value2)
        {
            addCriterion("PID between", value1, value2, "PID");
            return (Criteria)this;
        }
        
        public Criteria andPIDNotBetween(String value1, String value2)
        {
            addCriterion("PID not between", value1, value2, "PID");
            return (Criteria)this;
        }
        
        public Criteria andURLIsNull()
        {
            addCriterion("URL is null");
            return (Criteria)this;
        }
        
        public Criteria andURLIsNotNull()
        {
            addCriterion("URL is not null");
            return (Criteria)this;
        }
        
        public Criteria andURLEqualTo(String value)
        {
            addCriterion("URL =", value, "URL");
            return (Criteria)this;
        }
        
        public Criteria andURLNotEqualTo(String value)
        {
            addCriterion("URL <>", value, "URL");
            return (Criteria)this;
        }
        
        public Criteria andURLGreaterThan(String value)
        {
            addCriterion("URL >", value, "URL");
            return (Criteria)this;
        }
        
        public Criteria andURLGreaterThanOrEqualTo(String value)
        {
            addCriterion("URL >=", value, "URL");
            return (Criteria)this;
        }
        
        public Criteria andURLLessThan(String value)
        {
            addCriterion("URL <", value, "URL");
            return (Criteria)this;
        }
        
        public Criteria andURLLessThanOrEqualTo(String value)
        {
            addCriterion("URL <=", value, "URL");
            return (Criteria)this;
        }
        
        public Criteria andURLLike(String value)
        {
            addCriterion("URL like", value, "URL");
            return (Criteria)this;
        }
        
        public Criteria andURLNotLike(String value)
        {
            addCriterion("URL not like", value, "URL");
            return (Criteria)this;
        }
        
        public Criteria andURLIn(List<String> values)
        {
            addCriterion("URL in", values, "URL");
            return (Criteria)this;
        }
        
        public Criteria andURLNotIn(List<String> values)
        {
            addCriterion("URL not in", values, "URL");
            return (Criteria)this;
        }
        
        public Criteria andURLBetween(String value1, String value2)
        {
            addCriterion("URL between", value1, value2, "URL");
            return (Criteria)this;
        }
        
        public Criteria andURLNotBetween(String value1, String value2)
        {
            addCriterion("URL not between", value1, value2, "URL");
            return (Criteria)this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table tree
     * @mbggenerated  Fri Apr 28 10:41:06 CST 2017
     */
    public static class Criterion
    {
        private String condition;
        
        private Object value;
        
        private Object secondValue;
        
        private boolean noValue;
        
        private boolean singleValue;
        
        private boolean betweenValue;
        
        private boolean listValue;
        
        private String typeHandler;
        
        public String getCondition()
        {
            return condition;
        }
        
        public Object getValue()
        {
            return value;
        }
        
        public Object getSecondValue()
        {
            return secondValue;
        }
        
        public boolean isNoValue()
        {
            return noValue;
        }
        
        public boolean isSingleValue()
        {
            return singleValue;
        }
        
        public boolean isBetweenValue()
        {
            return betweenValue;
        }
        
        public boolean isListValue()
        {
            return listValue;
        }
        
        public String getTypeHandler()
        {
            return typeHandler;
        }
        
        protected Criterion(String condition)
        {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }
        
        protected Criterion(String condition, Object value, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>)
            {
                this.listValue = true;
            }
            else
            {
                this.singleValue = true;
            }
        }
        
        protected Criterion(String condition, Object value)
        {
            this(condition, value, null);
        }
        
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }
        
        protected Criterion(String condition, Object value, Object secondValue)
        {
            this(condition, value, secondValue, null);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tree
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 13 15:20:38 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}