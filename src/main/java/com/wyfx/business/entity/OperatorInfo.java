package com.wyfx.business.entity;

import java.sql.Date;

public class OperatorInfo {
    private long uid;
    private String account_type;
    private String operator;
    private String operation_type;
    private String operation_behavior;
    private String related_data;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }

    public String getOperation_behavior() {
        return operation_behavior;
    }

    public void setOperation_behavior(String operation_behavior) {
        this.operation_behavior = operation_behavior;
    }

    public String getRelated_data() {
        return related_data;
    }

    public void setRelated_data(String related_data) {
        this.related_data = related_data;
    }
}
