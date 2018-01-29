package com.zking.crm.biz.impl;

import com.zking.crm.biz.IServiceBiz;
import com.zking.crm.mapper.ServiceMapper;
import com.zking.crm.model.Service;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceBizImpl implements IServiceBiz {
    @Autowired
    private ServiceMapper serviceMapper;

    @Override
    public void addService(Service service) {
        serviceMapper.insertSelective(service);
    }

    @Override
    public void delService(Long svrId) {
        serviceMapper.deleteByPrimaryKey(svrId);
    }

    @Override
    public void editZhipai(Service service) {
        serviceMapper.updateByPrimaryKeySelective(service);
    }

    @Override
    public void doFuwuchuli(Service service) {
        serviceMapper.updateByPrimaryKeySelective(service);
    }

    @Override
    public void doFuwufangkui(Service service) {
        serviceMapper.updateByPrimaryKeySelective(service);
    }

    @Override
    public Service loadFuwuguidang(Long svrId) {
        return serviceMapper.selectByPrimaryKey(svrId);
    }

    @Override
    public List<Service> listStatus1(PageBean pageBean) {
        return serviceMapper.listStatus1();
    }

    @Override
    public List<Service> listStatus2() {
        return serviceMapper.listStatus2();
    }

    @Override
    public List<Service> listStatus3() {
        return serviceMapper.listStatus3();
    }

    @Override
    public List<Service> listStatus4() {
        return serviceMapper.listStatus4();
    }
}
