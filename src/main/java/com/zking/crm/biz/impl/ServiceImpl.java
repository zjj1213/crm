package com.zking.crm.biz.impl;

import com.zking.crm.biz.IService;
import com.zking.crm.mapper.ServiceMapper;
import com.zking.crm.model.Service;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceImpl implements IService {
    @Autowired
    private ServiceMapper serviceMapper;
    @Override
    public void addService(Service service) {
        serviceMapper.insertSelective(service);
    }

    @Override
    public void delService(Service service) {
        serviceMapper.updateByPrimaryKeySelective(service);
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
    public Service listStatus1() {
        return serviceMapper.listStatus1();
    }

    @Override
    public Service listStatus2() {
        return serviceMapper.listStatus2();
    }

    @Override
    public Service listStatus3() {
        return serviceMapper.listStatus3();
    }

    @Override
    public Service listStatus4() {
        return serviceMapper.listStatus4();
    }
}
