package com.zking.p2p.mapper;

import com.zking.p2p.model.Hk;

public interface HkMapper {
    int deleteByPrimaryKey(Integer hkId);

    int insert(Hk record);

    int insertSelective(Hk record);

    Hk selectByPrimaryKey(Integer hkId);

    int updateByPrimaryKeySelective(Hk record);

    int updateByPrimaryKey(Hk record);
}