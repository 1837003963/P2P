package com.zking.p2p.mapper;

import com.zking.p2p.model.Js;

public interface JsMapper {
    int deleteByPrimaryKey(Integer jsId);

    int insert(Js record);

    int insertSelective(Js record);

    Js selectByPrimaryKey(Integer jsId);

    int updateByPrimaryKeySelective(Js record);

    int updateByPrimaryKey(Js record);
}