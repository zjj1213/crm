package com.zking.crm.model;

public class RoleRight {
    private Long rfId;

    private Long rfRoleId;

    private String rfRightCode;

    public RoleRight(Long rfId, Long rfRoleId, String rfRightCode) {
        this.rfId = rfId;
        this.rfRoleId = rfRoleId;
        this.rfRightCode = rfRightCode;
    }

    public RoleRight() {
        super();
    }

    public Long getRfId() {
        return rfId;
    }

    public void setRfId(Long rfId) {
        this.rfId = rfId;
    }

    public Long getRfRoleId() {
        return rfRoleId;
    }

    public void setRfRoleId(Long rfRoleId) {
        this.rfRoleId = rfRoleId;
    }

    public String getRfRightCode() {
        return rfRightCode;
    }

    public void setRfRightCode(String rfRightCode) {
        this.rfRightCode = rfRightCode;
    }
}