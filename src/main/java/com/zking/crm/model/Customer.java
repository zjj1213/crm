package com.zking.crm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String custNo;

    private String custName;

    private String custRegion;
    @JsonIgnore
    private Long custManagerId;

    private String custManagerName;
    @JsonIgnore
    private Integer custLevel;

    private String custLevelLabel;
    @JsonIgnore
    private Integer custSatisfy;
    @JsonIgnore
    private Integer custCredit;
    @JsonIgnore
    private String custAddr;
    @JsonIgnore
    private String custZip;
    @JsonIgnore
    private String custTel;
    @JsonIgnore
    private String custFax;
    @JsonIgnore
    private String custWebsite;
    @JsonIgnore
    private String custLicenceNo;
    @JsonIgnore
    private String custChieftain;
    @JsonIgnore
    private Long custBankroll;
    @JsonIgnore
    private Long custTurnover;
    @JsonIgnore
    private String custBank;
    @JsonIgnore
    private String custBankAccount;
    @JsonIgnore
    private String custLocalTaxNo;
    @JsonIgnore
    private String custNationalTaxNo;
    @JsonIgnore
    private String custStatus;


    //联系人表
    private List<Linkman> linkmanList = new ArrayList<Linkman>();

    //交往记录表
    private List<Activity> activityList = new ArrayList<Activity>();



    public Customer(String custNo, String custName, String custRegion, Long custManagerId, String custManagerName, Integer custLevel, String custLevelLabel, Integer custSatisfy, Integer custCredit, String custAddr, String custZip, String custTel, String custFax, String custWebsite, String custLicenceNo, String custChieftain, Long custBankroll, Long custTurnover, String custBank, String custBankAccount, String custLocalTaxNo, String custNationalTaxNo, String custStatus) {
        this.custNo = custNo;
        this.custName = custName;
        this.custRegion = custRegion;
        this.custManagerId = custManagerId;
        this.custManagerName = custManagerName;
        this.custLevel = custLevel;
        this.custLevelLabel = custLevelLabel;
        this.custSatisfy = custSatisfy;
        this.custCredit = custCredit;
        this.custAddr = custAddr;
        this.custZip = custZip;
        this.custTel = custTel;
        this.custFax = custFax;
        this.custWebsite = custWebsite;
        this.custLicenceNo = custLicenceNo;
        this.custChieftain = custChieftain;
        this.custBankroll = custBankroll;
        this.custTurnover = custTurnover;
        this.custBank = custBank;
        this.custBankAccount = custBankAccount;
        this.custLocalTaxNo = custLocalTaxNo;
        this.custNationalTaxNo = custNationalTaxNo;
        this.custStatus = custStatus;
    }

    public Customer() {
        super();
    }

    public List<Linkman> getLinkmanList() {
        return linkmanList;
    }

    public void setLinkmanList(List<Linkman> linkmanList) {
        this.linkmanList = linkmanList;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustRegion() {
        return custRegion;
    }

    public void setCustRegion(String custRegion) {
        this.custRegion = custRegion;
    }

    public Long getCustManagerId() {
        return custManagerId;
    }

    public void setCustManagerId(Long custManagerId) {
        this.custManagerId = custManagerId;
    }

    public String getCustManagerName() {
        return custManagerName;
    }

    public void setCustManagerName(String custManagerName) {
        this.custManagerName = custManagerName;
    }

    public Integer getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(Integer custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustLevelLabel() {
        return custLevelLabel;
    }

    public void setCustLevelLabel(String custLevelLabel) {
        this.custLevelLabel = custLevelLabel;
    }

    public Integer getCustSatisfy() {
        return custSatisfy;
    }

    public void setCustSatisfy(Integer custSatisfy) {
        this.custSatisfy = custSatisfy;
    }

    public Integer getCustCredit() {
        return custCredit;
    }

    public void setCustCredit(Integer custCredit) {
        this.custCredit = custCredit;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip;
    }

    public String getCustTel() {
        return custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel;
    }

    public String getCustFax() {
        return custFax;
    }

    public void setCustFax(String custFax) {
        this.custFax = custFax;
    }

    public String getCustWebsite() {
        return custWebsite;
    }

    public void setCustWebsite(String custWebsite) {
        this.custWebsite = custWebsite;
    }

    public String getCustLicenceNo() {
        return custLicenceNo;
    }

    public void setCustLicenceNo(String custLicenceNo) {
        this.custLicenceNo = custLicenceNo;
    }

    public String getCustChieftain() {
        return custChieftain;
    }

    public void setCustChieftain(String custChieftain) {
        this.custChieftain = custChieftain;
    }

    public Long getCustBankroll() {
        return custBankroll;
    }

    public void setCustBankroll(Long custBankroll) {
        this.custBankroll = custBankroll;
    }

    public Long getCustTurnover() {
        return custTurnover;
    }

    public void setCustTurnover(Long custTurnover) {
        this.custTurnover = custTurnover;
    }

    public String getCustBank() {
        return custBank;
    }

    public void setCustBank(String custBank) {
        this.custBank = custBank;
    }

    public String getCustBankAccount() {
        return custBankAccount;
    }

    public void setCustBankAccount(String custBankAccount) {
        this.custBankAccount = custBankAccount;
    }

    public String getCustLocalTaxNo() {
        return custLocalTaxNo;
    }

    public void setCustLocalTaxNo(String custLocalTaxNo) {
        this.custLocalTaxNo = custLocalTaxNo;
    }

    public String getCustNationalTaxNo() {
        return custNationalTaxNo;
    }

    public void setCustNationalTaxNo(String custNationalTaxNo) {
        this.custNationalTaxNo = custNationalTaxNo;
    }

    public String getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(String custStatus) {
        this.custStatus = custStatus;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custNo='" + custNo + '\'' +
                ", custName='" + custName + '\'' +
                ", custRegion='" + custRegion + '\'' +
                ", custManagerId=" + custManagerId +
                ", custManagerName='" + custManagerName + '\'' +
                ", custLevel=" + custLevel +
                ", custLevelLabel='" + custLevelLabel + '\'' +
                ", custSatisfy=" + custSatisfy +
                ", custCredit=" + custCredit +
                ", custAddr='" + custAddr + '\'' +
                ", custZip='" + custZip + '\'' +
                ", custTel='" + custTel + '\'' +
                ", custFax='" + custFax + '\'' +
                ", custWebsite='" + custWebsite + '\'' +
                ", custLicenceNo='" + custLicenceNo + '\'' +
                ", custChieftain='" + custChieftain + '\'' +
                ", custBankroll=" + custBankroll +
                ", custTurnover=" + custTurnover +
                ", custBank='" + custBank + '\'' +
                ", custBankAccount='" + custBankAccount + '\'' +
                ", custLocalTaxNo='" + custLocalTaxNo + '\'' +
                ", custNationalTaxNo='" + custNationalTaxNo + '\'' +
                ", custStatus='" + custStatus + '\'' +
                '}';
    }
}