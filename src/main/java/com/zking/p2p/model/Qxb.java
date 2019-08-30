package com.zking.p2p.model;

public class Qxb {
    private Integer qxbId;

    private String qxbName;

    private Integer qxbDj;

    private String qxbNr;

    private String qxbZt;

    public Qxb(Integer qxbId, String qxbName, Integer qxbDj, String qxbNr, String qxbZt) {
        this.qxbId = qxbId;
        this.qxbName = qxbName;
        this.qxbDj = qxbDj;
        this.qxbNr = qxbNr;
        this.qxbZt = qxbZt;
    }

    public Qxb() {
        super();
    }

    public Integer getQxbId() {
        return qxbId;
    }

    public void setQxbId(Integer qxbId) {
        this.qxbId = qxbId;
    }

    public String getQxbName() {
        return qxbName;
    }

    public void setQxbName(String qxbName) {
        this.qxbName = qxbName;
    }

    public Integer getQxbDj() {
        return qxbDj;
    }

    public void setQxbDj(Integer qxbDj) {
        this.qxbDj = qxbDj;
    }

    public String getQxbNr() {
        return qxbNr;
    }

    public void setQxbNr(String qxbNr) {
        this.qxbNr = qxbNr;
    }

    public String getQxbZt() {
        return qxbZt;
    }

    public void setQxbZt(String qxbZt) {
        this.qxbZt = qxbZt;
    }
}