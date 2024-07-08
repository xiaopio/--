package com.abc.bean;

public class Siji {
    private Integer id;
    private String mingcheng;
    private String jialing;
    private String jiazhaodengji;
    private String sijizhuangtai;
    private String zhanghao;
    private String mima;

    @Override
    public String toString() {
        return "Siji{" +
                "id=" + id +
                ", mingcheng='" + mingcheng + '\'' +
                ", jialing='" + jialing + '\'' +
                ", jiazhaodengji='" + jiazhaodengji + '\'' +
                ", sijizhuangtai='" + sijizhuangtai + '\'' +
                ", zhanghao='" + zhanghao + '\'' +
                ", mima='" + mima + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }

    public String getJialing() {
        return jialing;
    }

    public void setJialing(String jialing) {
        this.jialing = jialing;
    }

    public String getJiazhaodengji() {
        return jiazhaodengji;
    }

    public void setJiazhaodengji(String jiazhaodengji) {
        this.jiazhaodengji = jiazhaodengji;
    }

    public String getSijizhuangtai() {
        return sijizhuangtai;
    }

    public void setSijizhuangtai(String sijizhuangtai) {
        this.sijizhuangtai = sijizhuangtai;
    }

    public Siji() {
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public Siji(Integer id, String mingcheng, String jialing, String jiazhaodengji, String sijizhuangtai, String zhanghao, String mima) {
        this.id = id;
        this.mingcheng = mingcheng;
        this.jialing = jialing;
        this.jiazhaodengji = jiazhaodengji;
        this.sijizhuangtai = sijizhuangtai;
        this.zhanghao = zhanghao;
        this.mima = mima;
    }

    public Siji(Integer id, String sijizhuangtai) {
        this.id = id;
        this.sijizhuangtai = sijizhuangtai;
    }


}
