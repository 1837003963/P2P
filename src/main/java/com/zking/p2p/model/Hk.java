package com.zking.p2p.model;

public class Hk {
    private Integer hkId;

    private Integer pkId;

    private String hkQs;

    private Long hkHklx;

    private Long hkBj;

    private Long hkBx;

    private String hkRq;

    private String hkZt;

    private String hkSjrq;

    private Long hkSjbx;

    public Hk(Integer hkId, Integer pkId, String hkQs, Long hkHklx, Long hkBj, Long hkBx, String hkRq, String hkZt, String hkSjrq, Long hkSjbx) {
        this.hkId = hkId;
        this.pkId = pkId;
        this.hkQs = hkQs;
        this.hkHklx = hkHklx;
        this.hkBj = hkBj;
        this.hkBx = hkBx;
        this.hkRq = hkRq;
        this.hkZt = hkZt;
        this.hkSjrq = hkSjrq;
        this.hkSjbx = hkSjbx;
    }

    public Hk() {
        super();
    }

    public Integer getHkId() {
        return hkId;
    }

    public void setHkId(Integer hkId) {
        this.hkId = hkId;
    }

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getHkQs() {
        return hkQs;
    }

    public void setHkQs(String hkQs) {
        this.hkQs = hkQs;
    }

    public Long getHkHklx() {
        return hkHklx;
    }

    public void setHkHklx(Long hkHklx) {
        this.hkHklx = hkHklx;
    }

    public Long getHkBj() {
        return hkBj;
    }

    public void setHkBj(Long hkBj) {
        this.hkBj = hkBj;
    }

    public Long getHkBx() {
        return hkBx;
    }

    public void setHkBx(Long hkBx) {
        this.hkBx = hkBx;
    }

    public String getHkRq() {
        return hkRq;
    }

    public void setHkRq(String hkRq) {
        this.hkRq = hkRq;
    }

    public String getHkZt() {
        return hkZt;
    }

    public void setHkZt(String hkZt) {
        this.hkZt = hkZt;
    }

    public String getHkSjrq() {
        return hkSjrq;
    }

    public void setHkSjrq(String hkSjrq) {
        this.hkSjrq = hkSjrq;
    }

    public Long getHkSjbx() {
        return hkSjbx;
    }

    public void setHkSjbx(Long hkSjbx) {
        this.hkSjbx = hkSjbx;
    }
}