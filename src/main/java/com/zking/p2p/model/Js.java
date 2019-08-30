package com.zking.p2p.model;

public class Js {
    private Integer jsId;

    private String jsName;

    private String jsNr;

    public Js(Integer jsId, String jsName, String jsNr) {
        this.jsId = jsId;
        this.jsName = jsName;
        this.jsNr = jsNr;
    }

    public Js() {
        super();
    }

    public Integer getJsId() {
        return jsId;
    }

    public void setJsId(Integer jsId) {
        this.jsId = jsId;
    }

    public String getJsName() {
        return jsName;
    }

    public void setJsName(String jsName) {
        this.jsName = jsName;
    }

    public String getJsNr() {
        return jsNr;
    }

    public void setJsNr(String jsNr) {
        this.jsNr = jsNr;
    }
}