package com.zking.p2p.model;

public class Jsqx {
    private Integer jsqxId;

    private Integer yoId;

    private Integer jsId;

    public Jsqx(Integer jsqxId, Integer yoId, Integer jsId) {
        this.jsqxId = jsqxId;
        this.yoId = yoId;
        this.jsId = jsId;
    }

    public Jsqx() {
        super();
    }

    public Integer getJsqxId() {
        return jsqxId;
    }

    public void setJsqxId(Integer jsqxId) {
        this.jsqxId = jsqxId;
    }

    public Integer getYoId() {
        return yoId;
    }

    public void setYoId(Integer yoId) {
        this.yoId = yoId;
    }

    public Integer getJsId() {
        return jsId;
    }

    public void setJsId(Integer jsId) {
        this.jsId = jsId;
    }
}