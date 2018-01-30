package com.zking.crm.mapper;

import com.zking.crm.model.Linkman;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkmanMapper {
    int deleteByPrimaryKey(Long lkmId);

    int insert(Linkman record);

    int insertSelective(Linkman record);

    Linkman selectByPrimaryKey(Long lkmId);

    int updateByPrimaryKeySelective(Linkman record);

    int updateByPrimaryKey(Linkman record);

    //联系人-客户信息
    List<Linkman> customerload(Linkman linkman);

    Linkman load(Linkman linkman);



}