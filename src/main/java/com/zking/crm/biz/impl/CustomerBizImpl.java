package com.zking.crm.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.crm.biz.ICustomerBiz;
import com.zking.crm.mapper.CustomerMapper;
import com.zking.crm.model.Customer;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerBizImpl implements ICustomerBiz {

    @Autowired
    private CustomerMapper customerMapper;

    //客户信息查全部
    @Override
    public List<Customer> customerlist(Customer customer, PageBean pageBean) {

        if (null != pageBean && pageBean.isPaginate()) {
            PageHelper.startPage(pageBean.getCurPage(), pageBean.getPageRecord());
        }

        List<Customer> customerlist = customerMapper.customerlist(customer);

        if (null != pageBean && pageBean.isPaginate()) {
            PageInfo pageInfo = new PageInfo(customerlist);
            pageBean.setTotalRecord(pageInfo.getTotal() + "");
        }
            return customerlist;
    }

    //客户信息修改-查单个
    @Override
    public Customer load(Customer customer) {
        return customerMapper.load(customer);
    }


    //客户信息修改-修改
    @Override
    public void editCustomer(Customer customer) {
        customerMapper.updateByPrimaryKeySelective(customer);
    }

    //qch
    @Override
    public Customer doLoadSvrCustNo(Customer record) {
        return customerMapper.doLoadSvrCustNo(record);
    }
}
