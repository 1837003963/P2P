package com.zking.p2p.model;

public class Yq {
    private Integer yqId;

    private Integer hkId;

    private Long yqTs;

    private Long yqFj;

    private Long yqQsf;

    private String yqBz;

    public Yq(Integer yqId, Integer hkId, Long yqTs, Long yqFj, Long yqQsf, String yqBz) {
        this.yqId = yqId;
        this.hkId = hkId;
        this.yqTs = yqTs;
        this.yqFj = yqFj;
        this.yqQsf = yqQsf;
        this.yqBz = yqBz;
    }

    public Yq() {
        super();
    }

    public Integer getYqId() {
        return yqId;
    }

    public void setYqId(Integer yqId) {
        this.yqId = yqId;
    }

    public Integer getHkId() {
        return hkId;
    }

    public void setHkId(Integer hkId) {
        this.hkId = hkId;
    }

    public Long getYqTs() {
        return yqTs;
    }

    public void setYqTs(Long yqTs) {
        this.yqTs = yqTs;
    }

    public Long getYqFj() {
        return yqFj;
    }

    public void setYqFj(Long yqFj) {
        this.yqFj = yqFj;
    }

    public Long getYqQsf() {
        return yqQsf;
    }

    public void setYqQsf(Long yqQsf) {
        this.yqQsf = yqQsf;
    }

    public String getYqBz() {
        return yqBz;
    }

    public void setYqBz(String yqBz) {
        this.yqBz = yqBz;
    }
}