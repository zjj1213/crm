package com.zking.crm.biz;

import com.zking.crm.model.Service;

public interface IServiceBiz {
    void addService(Service service);

    void delService(Service service);

    void editZhipai(Service service);

    void doFuwuchuli(Service service);

    void doFuwufangkui(Service service);

    Service loadFuwuguidang(Long svrId);

    Service listStatus1();

    Service listStatus2();

    Service listStatus3();

    Service listStatus4();
}
