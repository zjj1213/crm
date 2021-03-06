package com.zking.crm.biz.impl;

import com.zking.crm.biz.IUserBiz;
import com.zking.crm.mapper.UserMapper;
import com.zking.crm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBizImpl implements IUserBiz {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user.getUsrName());
    }


    @Override
    public List<User> doListUser() {
        return userMapper.doListUser();
    }
}
