package com.zking.crm.controller;

import com.zking.crm.biz.IUserBiz;
import com.zking.crm.mapper.UserMapper;
import com.zking.crm.model.Customer;
import com.zking.crm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private IUserBiz userBiz;

    @ModelAttribute
    public void init(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        System.out.println("init");

    }

    @RequestMapping("/toLogin")
    public String toLogin(Model model) {
        return "login";
    }

//    public String login(@ModelAttribute User user, Model model) {
//        user.setUsrName();
//        return "";
//    }

    @RequestMapping("/login")
    public String login(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request, HttpSession session, Errors errors) {

        String msg = null;
        User u = userBiz.login(user);
        System.out.println("u=" + u);
        RequestContext requestContext = new RequestContext(request);

        if (null == u) {
            msg = "账号错误";
            errors.rejectValue("usrName", null, msg);
        } else if (!u.getUsrPassword().equals(user.getUsrPassword())) {
            msg = "密码错误";
            errors.rejectValue("srPassword", null, msg);
        }
        if (null != msg) {
            return "login";
        }
//        else {
//            if (u.getUsetQx() != 0) {
//                return "console1";
//            }
        session.setAttribute("user", u);
        session.getServletContext().setAttribute("user", u);
        return "index";
    }


}

