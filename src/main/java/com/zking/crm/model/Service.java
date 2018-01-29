package com.zking.crm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Service {

    private Long svrId;

    private String svrType;

    private String svrTitle;

    @JsonIgnore
    private String svrCustNo;

    private String svrCustName;

    @JsonIgnore
    private String svrStatus;

    @JsonIgnore
    private String svrRequest;

    @JsonIgnore
    private Long svrCreateId;

    private String svrCreateBy;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date svrCreateDate;

    @JsonIgnore
    private String svrDueId;

    @JsonIgnore
    private String svrDueTo;

    @JsonIgnore
    private Date svrDueDate;

    @JsonIgnore
    private String svrDeal;

    @JsonIgnore
    private Long svrDealId;

    @JsonIgnore
    private Date svrDealDate;

    @JsonIgnore
    private String svrResult;

    @JsonIgnore
    private Integer svrSatisfy;

    public Service(Long svrId, String svrType, String svrTitle, String svrCustNo, String svrCustName, String svrStatus, String svrRequest, Long svrCreateId, String svrCreateBy, Date svrCreateDate, String svrDueId, String svrDueTo, Date svrDueDate, String svrDeal, Long svrDealId, Date svrDealDate, String svrResult, Integer svrSatisfy) {
        this.svrId = svrId;
        this.svrType = svrType;
        this.svrTitle = svrTitle;
        this.svrCustNo = svrCustNo;
        this.svrCustName = svrCustName;
        this.svrStatus = svrStatus;
        this.svrRequest = svrRequest;
        this.svrCreateId = svrCreateId;
        this.svrCreateBy = svrCreateBy;
        this.svrCreateDate = svrCreateDate;
        this.svrDueId = svrDueId;
        this.svrDueTo = svrDueTo;
        this.svrDueDate = svrDueDate;
        this.svrDeal = svrDeal;
        this.svrDealId = svrDealId;
        this.svrDealDate = svrDealDate;
        this.svrResult = svrResult;
        this.svrSatisfy = svrSatisfy;
    }

    public Service() {
        super();
    }

    public Long getSvrId() {
        return svrId;
    }

    public void setSvrId(Long svrId) {
        this.svrId = svrId;
    }

    public String getSvrType() {
        return svrType;
    }

    public void setSvrType(String svrType) {
        this.svrType = svrType;
    }

    public String getSvrTitle() {
        return svrTitle;
    }

    public void setSvrTitle(String svrTitle) {
        this.svrTitle = svrTitle;
    }

    public String getSvrCustNo() {
        return svrCustNo;
    }

    public void setSvrCustNo(String svrCustNo) {
        this.svrCustNo = svrCustNo;
    }

    public String getSvrCustName() {
        return svrCustName;
    }

    public void setSvrCustName(String svrCustName) {
        this.svrCustName = svrCustName;
    }

    public String getSvrStatus() {
        return svrStatus;
    }

    public void setSvrStatus(String svrStatus) {
        this.svrStatus = svrStatus;
    }

    public String getSvrRequest() {
        return svrRequest;
    }

    public void setSvrRequest(String svrRequest) {
        this.svrRequest = svrRequest;
    }

    public Long getSvrCreateId() {
        return svrCreateId;
    }

    public void setSvrCreateId(Long svrCreateId) {
        this.svrCreateId = svrCreateId;
    }

    public String getSvrCreateBy() {
        return svrCreateBy;
    }

    public void setSvrCreateBy(String svrCreateBy) {
        this.svrCreateBy = svrCreateBy;
    }

    public Date getSvrCreateDate() {
        return svrCreateDate;
    }

    public void setSvrCreateDate(Date svrCreateDate) {
        this.svrCreateDate = svrCreateDate;
    }

    public String getSvrDueId() {
        return svrDueId;
    }

    public void setSvrDueId(String svrDueId) {
        this.svrDueId = svrDueId;
    }

    public String getSvrDueTo() {
        return svrDueTo;
    }

    public void setSvrDueTo(String svrDueTo) {
        this.svrDueTo = svrDueTo;
    }

    public Date getSvrDueDate() {
        return svrDueDate;
    }

    public void setSvrDueDate(Date svrDueDate) {
        this.svrDueDate = svrDueDate;
    }

    public String getSvrDeal() {
        return svrDeal;
    }

    public void setSvrDeal(String svrDeal) {
        this.svrDeal = svrDeal;
    }

    public Long getSvrDealId() {
        return svrDealId;
    }

    public void setSvrDealId(Long svrDealId) {
        this.svrDealId = svrDealId;
    }

    public Date getSvrDealDate() {
        return svrDealDate;
    }

    public void setSvrDealDate(Date svrDealDate) {
        this.svrDealDate = svrDealDate;
    }

    public String getSvrResult() {
        return svrResult;
    }

    public void setSvrResult(String svrResult) {
        this.svrResult = svrResult;
    }

    public Integer getSvrSatisfy() {
        return svrSatisfy;
    }

    public void setSvrSatisfy(Integer svrSatisfy) {
        this.svrSatisfy = svrSatisfy;
    }
}