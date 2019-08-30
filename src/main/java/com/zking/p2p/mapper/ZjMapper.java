package com.zking.p2p.mapper;

import com.zking.p2p.model.Zj;

public interface ZjMapper {
    int deleteByPrimaryKey(Integer zjId);

    int insert(Zj record);

    int insertSelective(Zj record);

    Zj selectByPrimaryKey(Integer zjId);

    int updateByPrimaryKeySelective(Zj record);

    int updateByPrimaryKey(Zj record);
}