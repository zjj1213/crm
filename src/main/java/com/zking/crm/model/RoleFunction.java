package com.zking.crm.model;

public class RoleFunction {
    private Long rfId;

    private Long roleId;

    private Long functionId;

    public RoleFunction(Long rfId, Long roleId, Long functionId) {
        this.rfId = rfId;
        this.roleId = roleId;
        this.functionId = functionId;
    }

    public RoleFunction() {
        super();
    }

    public Long getRfId() {
        return rfId;
    }

    public void setRfId(Long rfId) {
        this.rfId = rfId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
    }
}