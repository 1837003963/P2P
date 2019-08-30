package com.zking.p2p.model;

public class Huk {
    private Integer hukId;

    private Long hukCz;

    private Long hukHk;

    private Long hukDjhke;

    private Long hukKyye;

    private String hukBz;

    private Long hukYx;

    private String hukZt;

    public Huk(Integer hukId, Long hukCz, Long hukHk, Long hukDjhke, Long hukKyye, String hukBz, Long hukYx, String hukZt) {
        this.hukId = hukId;
        this.hukCz = hukCz;
        this.hukHk = hukHk;
        this.hukDjhke = hukDjhke;
        this.hukKyye = hukKyye;
        this.hukBz = hukBz;
        this.hukYx = hukYx;
        this.hukZt = hukZt;
    }

    public Huk() {
        super();
    }

    public Integer getHukId() {
        return hukId;
    }

    public void setHukId(Integer hukId) {
        this.hukId = hukId;
    }

    public Long getHukCz() {
        return hukCz;
    }

    public void setHukCz(Long hukCz) {
        this.hukCz = hukCz;
    }

    public Long getHukHk() {
        return hukHk;
    }

    public void setHukHk(Long hukHk) {
        this.hukHk = hukHk;
    }

    public Long getHukDjhke() {
        return hukDjhke;
    }

    public void setHukDjhke(Long hukDjhke) {
        this.hukDjhke = hukDjhke;
    }

    public Long getHukKyye() {
        return hukKyye;
    }

    public void setHukKyye(Long hukKyye) {
        this.hukKyye = hukKyye;
    }

    public String getHukBz() {
        return hukBz;
    }

    public void setHukBz(String hukBz) {
        this.hukBz = hukBz;
    }

    public Long getHukYx() {
        return hukYx;
    }

    public void setHukYx(Long hukYx) {
        this.hukYx = hukYx;
    }

    public String getHukZt() {
        return hukZt;
    }

    public void setHukZt(String hukZt) {
        this.hukZt = hukZt;
    }
}