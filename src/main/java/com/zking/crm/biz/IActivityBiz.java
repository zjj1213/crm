package com.zking.crm.biz;

import com.zking.crm.model.Activity;

import java.util.List;

public interface IActivityBiz {

    //历史记录-客户
    List<Activity> customerload2(Activity activity);

    //历史记录-查单个
    Activity load(Activity activity);

    //历史记录-新增
    void add(Activity activity);

    //历史记录-修改
    void edit(Activity activity);
	
	
	
	
	
	

    //历史记录-删除
    void del(Activity activity);


}
