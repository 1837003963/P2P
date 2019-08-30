package com.zking.p2p.mapper;

import com.zking.p2p.model.Yq;

public interface YqMapper {
    int deleteByPrimaryKey(Integer yqId);

    int insert(Yq record);

    int insertSelective(Yq record);

    Yq selectByPrimaryKey(Integer yqId);

    int updateByPrimaryKeySelective(Yq record);

    int updateByPrimaryKey(Yq record);
}