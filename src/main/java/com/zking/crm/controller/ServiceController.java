package com.zking.crm.controller;

import com.zking.crm.biz.IServiceBiz;
import com.zking.crm.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;

@Controller
public class ServiceController {
    @Autowired
    private IServiceBiz serviceBiz;


    @ModelAttribute
    public void init(Model model, @ModelAttribute Service service) {
        model.addAttribute("service", service);

    }

    @RequestMapping("/addService")
    @ResponseBody
    public String addService(Model model,@ModelAttribute Service service,HttpServletRequest request) {
            System.out.println("addService start");
        service.setSvrCustNo("t9999");
       // service.setSvrType("咨询");
        service.setSvrCustName("qch");
        //service.setSvrRequest("dfsdf");
        service.setSvrCreateId(Long.valueOf(2));
        service.setSvrCreateBy("黄师傅");
       // service.setSvrTitle("IIIII");
        service.setSvrCreateDate(new Timestamp(System.currentTimeMillis()));
        serviceBiz.addService(service);
        System.out.println("addService end");
        return "AAA";
    }


}
