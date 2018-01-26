package com.zking.crm.mapper;

import com.zking.crm.model.RoleRight;

public interface RoleRightMapper {
    int deleteByPrimaryKey(Long rfId);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    RoleRight selectByPrimaryKey(Long rfId);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}