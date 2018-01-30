package com.zking.crm.biz.impl;

import com.zking.crm.biz.ILinkmanBiz;
import com.zking.crm.mapper.LinkmanMapper;
import com.zking.crm.model.Linkman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LinkmanBizImpl implements ILinkmanBiz {

    @Autowired
    private LinkmanMapper linkmanMapper;

    //联系人-客户
    @Override
    public List<Linkman> customerload(Linkman linkman) {
        return linkmanMapper.customerload(linkman);
    }

    //联系人查单个
    @Override
    public Linkman load(Linkman linkman) {
        return linkmanMapper.load(linkman);
    }


    //联系人修改
    @Override
    public void editlinkman(Linkman linkman) {
       linkmanMapper.updateByPrimaryKeySelective(linkman);
    }

    //联系人删除
    @Override
    public void del(Linkman linkman) {
        linkmanMapper.deleteByPrimaryKey(linkman.getLkmId());
    }


}
