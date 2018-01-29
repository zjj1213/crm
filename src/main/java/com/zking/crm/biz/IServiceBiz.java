package com.zking.crm.biz;

import com.zking.crm.model.Service;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface IServiceBiz {
    void addService(Service service);

    void delService(Long svrId);

    void editZhipai(Service service);

    void doFuwuchuli(Service service);

    void doFuwufangkui(Service service);

    Service loadFuwuguidang(Long svrId);

    List<Service> listStatus1(PageBean pageBean);

    List<Service> listStatus2();

    List<Service> listStatus3();

    List<Service> listStatus4();
}
