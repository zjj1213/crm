package com.zking.crm.mapper;

import com.zking.crm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long usrId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long usrId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User login(String usrName);

    //qch
    List<User> doListUser();
}