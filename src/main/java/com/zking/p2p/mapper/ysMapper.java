package com.zking.p2p.mapper;

import com.zking.p2p.model.ys;

public interface ysMapper {
    int deleteByPrimaryKey(Integer ysId);

    int insert(ys record);

    int insertSelective(ys record);

    ys selectByPrimaryKey(Integer ysId);

    int updateByPrimaryKeySelective(ys record);

    int updateByPrimaryKey(ys record);
}