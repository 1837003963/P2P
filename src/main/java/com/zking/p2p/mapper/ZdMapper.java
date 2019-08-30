package com.zking.p2p.mapper;

import com.zking.p2p.model.Zd;

public interface ZdMapper {
    int deleteByPrimaryKey(Integer zdId);

    int insert(Zd record);

    int insertSelective(Zd record);

    Zd selectByPrimaryKey(Integer zdId);

    int updateByPrimaryKeySelective(Zd record);

    int updateByPrimaryKey(Zd record);
}