package com.zking.crm.mapper;

import com.zking.crm.model.Function;

public interface FunctionMapper {
    int deleteByPrimaryKey(Long functionId);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Long functionId);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
}