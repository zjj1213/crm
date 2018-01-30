package com.zking.crm.biz;

import com.zking.crm.model.Customer;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface ICustomerBiz {

    //客户信息查全部
    List<Customer> customerlist(Customer customer, PageBean pageBean);

    //客户信息修改-查单个
    Customer load(Customer customer);

    //客户信息修改-修改
    void editCustomer(Customer customer);


    //qch
    Customer doLoadSvrCustNo(Customer record);




}
