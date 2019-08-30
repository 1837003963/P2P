package com.zking.p2p.model;

public class ys {
    private Integer ysId;

    private Integer hkId;

    private Long ysBj;

    private Long ysLx;

    private Long ysBx;

    private String ysRq;

    private String ysZt;

    private Long ysSbx;

    private String ysSrq;

    private Long ysSxf;

    public ys(Integer ysId, Integer hkId, Long ysBj, Long ysLx, Long ysBx, String ysRq, String ysZt, Long ysSbx, String ysSrq, Long ysSxf) {
        this.ysId = ysId;
        this.hkId = hkId;
        this.ysBj = ysBj;
        this.ysLx = ysLx;
        this.ysBx = ysBx;
        this.ysRq = ysRq;
        this.ysZt = ysZt;
        this.ysSbx = ysSbx;
        this.ysSrq = ysSrq;
        this.ysSxf = ysSxf;
    }

    public ys() {
        super();
    }

    public Integer getYsId() {
        return ysId;
    }

    public void setYsId(Integer ysId) {
        this.ysId = ysId;
    }

    public Integer getHkId() {
        return hkId;
    }

    public void setHkId(Integer hkId) {
        this.hkId = hkId;
    }

    public Long getYsBj() {
        return ysBj;
    }

    public void setYsBj(Long ysBj) {
        this.ysBj = ysBj;
    }

    public Long getYsLx() {
        return ysLx;
    }

    public void setYsLx(Long ysLx) {
        this.ysLx = ysLx;
    }

    public Long getYsBx() {
        return ysBx;
    }

    public void setYsBx(Long ysBx) {
        this.ysBx = ysBx;
    }

    public String getYsRq() {
        return ysRq;
    }

    public void setYsRq(String ysRq) {
        this.ysRq = ysRq;
    }

    public String getYsZt() {
        return ysZt;
    }

    public void setYsZt(String ysZt) {
        this.ysZt = ysZt;
    }

    public Long getYsSbx() {
        return ysSbx;
    }

    public void setYsSbx(Long ysSbx) {
        this.ysSbx = ysSbx;
    }

    public String getYsSrq() {
        return ysSrq;
    }

    public void setYsSrq(String ysSrq) {
        this.ysSrq = ysSrq;
    }

    public Long getYsSxf() {
        return ysSxf;
    }

    public void setYsSxf(Long ysSxf) {
        this.ysSxf = ysSxf;
    }
}