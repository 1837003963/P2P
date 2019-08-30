package com.zking.p2p.model;

public class Zd {
    private Integer zdId;

    private String zdName;

    private String zdNr;

    private String zdZt;

    public Zd(Integer zdId, String zdName, String zdNr, String zdZt) {
        this.zdId = zdId;
        this.zdName = zdName;
        this.zdNr = zdNr;
        this.zdZt = zdZt;
    }

    public Zd() {
        super();
    }

    public Integer getZdId() {
        return zdId;
    }

    public void setZdId(Integer zdId) {
        this.zdId = zdId;
    }

    public String getZdName() {
        return zdName;
    }

    public void setZdName(String zdName) {
        this.zdName = zdName;
    }

    public String getZdNr() {
        return zdNr;
    }

    public void setZdNr(String zdNr) {
        this.zdNr = zdNr;
    }

    public String getZdZt() {
        return zdZt;
    }

    public void setZdZt(String zdZt) {
        this.zdZt = zdZt;
    }
}