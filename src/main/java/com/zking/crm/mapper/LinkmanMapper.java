package com.zking.crm.mapper;

import com.zking.crm.model.Linkman;

public interface LinkmanMapper {
    int deleteByPrimaryKey(Long lkmId);

    int insert(Linkman record);

    int insertSelective(Linkman record);

    Linkman selectByPrimaryKey(Long lkmId);

    int updateByPrimaryKeySelective(Linkman record);

    int updateByPrimaryKey(Linkman record);
}