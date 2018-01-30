package com.zking.crm.controller;

import com.zking.crm.biz.ICustomerBiz;
import com.zking.crm.model.Customer;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerBiz customerBiz;

    @ModelAttribute
     public void init(Model model){
         Customer customer=new Customer();
         model.addAttribute("customer",customer);
         System.out.println("init");

     }

     //查询客户信息
    @ResponseBody
    @RequestMapping("/cust/kehuxixilist")
    public List<Customer> kehuxixilist(@ModelAttribute Customer customer, Model model, PageBean pageBean){
        customer.setCustStatus("1");
        List<Customer> kehuxixilist = customerBiz.customerlist(customer,pageBean);
        model.addAttribute("kehuxixilist",kehuxixilist);

        return kehuxixilist;
   }









}
