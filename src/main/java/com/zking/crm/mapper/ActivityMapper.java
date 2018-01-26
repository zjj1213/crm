package com.zking.crm.mapper;

import com.zking.crm.model.Activity;

public interface ActivityMapper {
    int deleteByPrimaryKey(Long atvId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Long atvId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}