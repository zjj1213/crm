package com.zking.crm.biz.impl;

import com.zking.crm.biz.IActivityBiz;
import com.zking.crm.mapper.ActivityMapper;
import com.zking.crm.model.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActivityBizImpl implements IActivityBiz {

    @Autowired
    private ActivityMapper activityMapper;


    @Override
    public List<Activity> customerload2(Activity activity) {
        return activityMapper.customerload2(activity);
    }

    @Override
    public Activity load(Activity activity) {
        return activityMapper.load(activity);
    }

    @Override
    public void add(Activity activity) {
       activityMapper.insertSelective(activity);
    }

    @Override
    public void edit(Activity activity) {
       activityMapper.updateByPrimaryKeySelective(activity);
    }

    @Override
    public void del(Activity activity) {
       activityMapper.deleteByPrimaryKey(activity.getAtvId());
    }

}
