package com.zking.crm.biz.impl;

import com.zking.crm.biz.ICustomerBiz;
import com.zking.crm.model.Customer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sound.midi.Soundbank;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerBizImplTest extends BaseTestCase{

   @Autowired
   private ICustomerBiz customerBiz;

    private Customer customer;


    @Override
    public void setUp() throws Exception {
        super.setUp();
        customer=new Customer();
    }

    @Test
    public void customerlist() throws Exception {

        customer.setCustNo("KH_20180126_00001");

        customer.setCustStatus("1");
        List<Customer> customerList=customerBiz.customerlist(customer,pageBean);
         for(Customer c:customerList){
             System.out.println(c);
         }

    }

    @Test
    public void load() throws Exception {
        customer.setCustNo("KH_20180127_00002");
        customer.setCustStatus("1");
        Customer loadlist = customerBiz.load(customer);
        System.out.println(loadlist);
    }


    @Test
    public void editCustomer() throws Exception {
      customer.setCustAddr("上海黄浦区");
      customer.setCustNo("KH_20180126_00001");
      customerBiz.editCustomer(customer);
    }




}