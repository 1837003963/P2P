package com.zking.p2p.mapper;

import com.zking.p2p.model.Sxf;

public interface SxfMapper {
    int deleteByPrimaryKey(Integer sxfId);

    int insert(Sxf record);

    int insertSelective(Sxf record);

    Sxf selectByPrimaryKey(Integer sxfId);

    int updateByPrimaryKeySelective(Sxf record);

    int updateByPrimaryKey(Sxf record);
}