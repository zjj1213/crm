package com.zking.crm.mapper;

import com.zking.crm.model.Chance;

public interface ChanceMapper {
    int deleteByPrimaryKey(Long chcId);

    int insert(Chance record);

    int insertSelective(Chance record);

    Chance selectByPrimaryKey(Long chcId);

    int updateByPrimaryKeySelective(Chance record);

    int updateByPrimaryKey(Chance record);
}