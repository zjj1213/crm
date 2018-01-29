package com.zking.crm.biz;

import com.zking.crm.model.Customer;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface ICustomerBiz {

    //客户信息查全部
    List<Customer> customerlist(Customer customer, PageBean pageBean);

    //qch
    String doLoadSvrCustNo(Customer record);

}
