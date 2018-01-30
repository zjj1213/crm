package com.zking.crm.mapper;

import com.zking.crm.model.Activity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityMapper {
    int deleteByPrimaryKey(Long atvId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Long atvId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    //历史记录-客户
    List<Activity> customerload2(Activity activity);

    //历史记录-查单个
    Activity load(Activity activity);


}