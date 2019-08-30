package com.zking.p2p.mapper;

import com.zking.p2p.model.Qxb;

public interface QxbMapper {
    int deleteByPrimaryKey(Integer qxbId);

    int insert(Qxb record);

    int insertSelective(Qxb record);

    Qxb selectByPrimaryKey(Integer qxbId);

    int updateByPrimaryKeySelective(Qxb record);

    int updateByPrimaryKey(Qxb record);
}