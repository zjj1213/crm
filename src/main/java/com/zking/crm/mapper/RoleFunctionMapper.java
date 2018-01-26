package com.zking.crm.mapper;

import com.zking.crm.model.RoleFunction;

public interface RoleFunctionMapper {
    int deleteByPrimaryKey(Long rfId);

    int insert(RoleFunction record);

    int insertSelective(RoleFunction record);

    RoleFunction selectByPrimaryKey(Long rfId);

    int updateByPrimaryKeySelective(RoleFunction record);

    int updateByPrimaryKey(RoleFunction record);
}