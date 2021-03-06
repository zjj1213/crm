package com.zking.crm.mapper;

import com.zking.crm.model.Service;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceMapper {
    int deleteByPrimaryKey(Long svrId);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Long svrId);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);


    List<Service> listStatus1();

    List<Service> listStatus2();

    List<Service> listStatus3();

    List<Service> listStatus4();
}