package com.zking.crm.biz;

import com.zking.crm.model.Linkman;

import java.util.List;

public interface ILinkmanBiz {

    //联系人-客户信息
    List<Linkman> customerload(Linkman linkman);

    //查单个
    Linkman load(Linkman linkman);

    //新增
    void add(Linkman linkman);

    //修改
    void editlinkman(Linkman linkman);

    //删除
    void del(Linkman linkman);






}
