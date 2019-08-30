package com.zking.p2p.model;

public class Sxf {
    private Integer sxfId;

    private Long sxfJe;

    private Long sxfGg;

    private String sxfLx;

    private String sxfBz;

    private Long sxfBh;

    private String sxfSj;

    private Long sxfZt;

    public Sxf(Integer sxfId, Long sxfJe, Long sxfGg, String sxfLx, String sxfBz, Long sxfBh, String sxfSj, Long sxfZt) {
        this.sxfId = sxfId;
        this.sxfJe = sxfJe;
        this.sxfGg = sxfGg;
        this.sxfLx = sxfLx;
        this.sxfBz = sxfBz;
        this.sxfBh = sxfBh;
        this.sxfSj = sxfSj;
        this.sxfZt = sxfZt;
    }

    public Sxf() {
        super();
    }

    public Integer getSxfId() {
        return sxfId;
    }

    public void setSxfId(Integer sxfId) {
        this.sxfId = sxfId;
    }

    public Long getSxfJe() {
        return sxfJe;
    }

    public void setSxfJe(Long sxfJe) {
        this.sxfJe = sxfJe;
    }

    public Long getSxfGg() {
        return sxfGg;
    }

    public void setSxfGg(Long sxfGg) {
        this.sxfGg = sxfGg;
    }

    public String getSxfLx() {
        return sxfLx;
    }

    public void setSxfLx(String sxfLx) {
        this.sxfLx = sxfLx;
    }

    public String getSxfBz() {
        return sxfBz;
    }

    public void setSxfBz(String sxfBz) {
        this.sxfBz = sxfBz;
    }

    public Long getSxfBh() {
        return sxfBh;
    }

    public void setSxfBh(Long sxfBh) {
        this.sxfBh = sxfBh;
    }

    public String getSxfSj() {
        return sxfSj;
    }

    public void setSxfSj(String sxfSj) {
        this.sxfSj = sxfSj;
    }

    public Long getSxfZt() {
        return sxfZt;
    }

    public void setSxfZt(Long sxfZt) {
        this.sxfZt = sxfZt;
    }
}