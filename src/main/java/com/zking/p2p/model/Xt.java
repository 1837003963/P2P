package com.zking.p2p.model;

public class Xt {
    private Integer xtId;

    private Long xtYe;

    private String xtSm;

    private Long xtGl;

    private String xtZt;

    private String xtSj;

    private Long xtJe;

    public Xt(Integer xtId, Long xtYe, String xtSm, Long xtGl, String xtZt, String xtSj, Long xtJe) {
        this.xtId = xtId;
        this.xtYe = xtYe;
        this.xtSm = xtSm;
        this.xtGl = xtGl;
        this.xtZt = xtZt;
        this.xtSj = xtSj;
        this.xtJe = xtJe;
    }

    public Xt() {
        super();
    }

    public Integer getXtId() {
        return xtId;
    }

    public void setXtId(Integer xtId) {
        this.xtId = xtId;
    }

    public Long getXtYe() {
        return xtYe;
    }

    public void setXtYe(Long xtYe) {
        this.xtYe = xtYe;
    }

    public String getXtSm() {
        return xtSm;
    }

    public void setXtSm(String xtSm) {
        this.xtSm = xtSm;
    }

    public Long getXtGl() {
        return xtGl;
    }

    public void setXtGl(Long xtGl) {
        this.xtGl = xtGl;
    }

    public String getXtZt() {
        return xtZt;
    }

    public void setXtZt(String xtZt) {
        this.xtZt = xtZt;
    }

    public String getXtSj() {
        return xtSj;
    }

    public void setXtSj(String xtSj) {
        this.xtSj = xtSj;
    }

    public Long getXtJe() {
        return xtJe;
    }

    public void setXtJe(Long xtJe) {
        this.xtJe = xtJe;
    }
}