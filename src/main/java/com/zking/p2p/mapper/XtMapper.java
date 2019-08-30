package com.zking.p2p.mapper;

import com.zking.p2p.model.Xt;

public interface XtMapper {
    int deleteByPrimaryKey(Integer xtId);

    int insert(Xt record);

    int insertSelective(Xt record);

    Xt selectByPrimaryKey(Integer xtId);

    int updateByPrimaryKeySelective(Xt record);

    int updateByPrimaryKey(Xt record);
}