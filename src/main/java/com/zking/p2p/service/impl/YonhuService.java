package com.zking.p2p.service.impl;

import com.zking.p2p.mapper.YoMapper;
import com.zking.p2p.model.Yo;
import com.zking.p2p.service.IYonhuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YonhuService implements IYonhuService {

    @Autowired
    private YoMapper yonhuMapper;

    @Override
    public int add(Yo yo) {
        return yonhuMapper.insert(yo);
    }

    @Override
    public Yo yon(String yoYan) {
        return yonhuMapper.Yan(yoYan);
    }

}
