package com.zking.p2p.mapper;

import com.zking.p2p.model.Yo;

public interface YoMapper {
    int deleteByPrimaryKey(Integer yoId);

    int insert(Yo record);

    int insertSelective(Yo record);

    Yo selectByPrimaryKey(Integer yoId);

    int updateByPrimaryKeySelective(Yo record);

    int updateByPrimaryKey(Yo record);

    Yo Yan(String yoTe);
}