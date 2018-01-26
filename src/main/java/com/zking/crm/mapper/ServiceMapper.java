package com.zking.crm.mapper;

import com.zking.crm.model.Service;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceMapper {
    int deleteByPrimaryKey(Long svrId);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Long svrId);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);


    Service listStatus1();

    Service listStatus2();

    Service listStatus3();

    Service listStatus4();
}