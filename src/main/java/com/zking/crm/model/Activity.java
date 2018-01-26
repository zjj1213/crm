package com.zking.crm.model;

import java.util.Date;

public class Activity {
    private Long atvId;

    private String atvCustNo;

    private String atvCustName;

    private Date atvDate;

    private String atvPlace;

    private String atvTitle;

    private String atvRemark;

    private String atvDesc;


    //客户信息表
    private  Customer customers;


    public Activity(Long atvId, String atvCustNo, String atvCustName, Date atvDate, String atvPlace, String atvTitle, String atvRemark, String atvDesc) {
        this.atvId = atvId;
        this.atvCustNo = atvCustNo;
        this.atvCustName = atvCustName;
        this.atvDate = atvDate;
        this.atvPlace = atvPlace;
        this.atvTitle = atvTitle;
        this.atvRemark = atvRemark;
        this.atvDesc = atvDesc;
    }

    public Activity() {
        super();
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public Long getAtvId() {
        return atvId;
    }

    public void setAtvId(Long atvId) {
        this.atvId = atvId;
    }

    public String getAtvCustNo() {
        return atvCustNo;
    }

    public void setAtvCustNo(String atvCustNo) {
        this.atvCustNo = atvCustNo;
    }

    public String getAtvCustName() {
        return atvCustName;
    }

    public void setAtvCustName(String atvCustName) {
        this.atvCustName = atvCustName;
    }

    public Date getAtvDate() {
        return atvDate;
    }

    public void setAtvDate(Date atvDate) {
        this.atvDate = atvDate;
    }

    public String getAtvPlace() {
        return atvPlace;
    }

    public void setAtvPlace(String atvPlace) {
        this.atvPlace = atvPlace;
    }

    public String getAtvTitle() {
        return atvTitle;
    }

    public void setAtvTitle(String atvTitle) {
        this.atvTitle = atvTitle;
    }

    public String getAtvRemark() {
        return atvRemark;
    }

    public void setAtvRemark(String atvRemark) {
        this.atvRemark = atvRemark;
    }

    public String getAtvDesc() {
        return atvDesc;
    }

    public void setAtvDesc(String atvDesc) {
        this.atvDesc = atvDesc;
    }
}