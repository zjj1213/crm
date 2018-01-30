package com.zking.crm.mapper;

import com.zking.crm.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(String custNo);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String custNo);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    //客户信息查全部
    List<Customer> customerlist(Customer customer);

    //客户信息修改-查单个
    Customer load(Customer customer);


    //qch
    Customer doLoadSvrCustNo(Customer record);


}