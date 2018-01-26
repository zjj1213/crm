package com.zking.crm.mapper;

import com.zking.crm.model.Service;

public interface ServiceMapper {
    int deleteByPrimaryKey(Long svrId);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Long svrId);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}