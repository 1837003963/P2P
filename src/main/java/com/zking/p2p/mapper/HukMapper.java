package com.zking.p2p.mapper;

import com.zking.p2p.model.Huk;

public interface HukMapper {
    int deleteByPrimaryKey(Integer hukId);

    int insert(Huk record);

    int insertSelective(Huk record);

    Huk selectByPrimaryKey(Integer hukId);

    int updateByPrimaryKeySelective(Huk record);

    int updateByPrimaryKey(Huk record);
}