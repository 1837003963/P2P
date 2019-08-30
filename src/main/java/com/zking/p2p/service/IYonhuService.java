package com.zking.p2p.service;

import com.zking.p2p.model.Yo;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IYonhuService {
    int add(Yo yonhu);

    Yo yon(String yoYan);
}
