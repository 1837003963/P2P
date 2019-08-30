package com.zking.p2p.mapper;

import com.zking.p2p.model.Pk;

public interface PkMapper {
    int deleteByPrimaryKey(Integer pkId);

    int insert(Pk record);

    int insertSelective(Pk record);

    Pk selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(Pk record);

    int updateByPrimaryKey(Pk record);
}