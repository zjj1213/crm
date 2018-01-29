package com.zking.crm.biz;

import com.zking.crm.model.User;

import java.util.List;

public interface IUserBiz {

    User login(User user);

    //qch
    List<User> doListUser();
}
