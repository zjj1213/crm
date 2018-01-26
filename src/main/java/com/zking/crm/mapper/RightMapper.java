package com.zking.crm.mapper;

import com.zking.crm.model.Right;

public interface RightMapper {
    int deleteByPrimaryKey(String rightCode);

    int insert(Right record);

    int insertSelective(Right record);

    Right selectByPrimaryKey(String rightCode);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);
}