package com.zking.crm.mapper;

import com.zking.crm.model.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(String custNo);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String custNo);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}