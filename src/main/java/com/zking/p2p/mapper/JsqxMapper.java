package com.zking.p2p.mapper;

import com.zking.p2p.model.Jsqx;

public interface JsqxMapper {
    int deleteByPrimaryKey(Integer jsqxId);

    int insert(Jsqx record);

    int insertSelective(Jsqx record);

    Jsqx selectByPrimaryKey(Integer jsqxId);

    int updateByPrimaryKeySelective(Jsqx record);

    int updateByPrimaryKey(Jsqx record);
}