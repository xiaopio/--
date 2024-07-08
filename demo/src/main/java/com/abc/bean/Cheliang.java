package com.abc.bean;

public class Cheliang {
    private Integer id;
    private String mingcheng;
    private String pinpai;
    private String jiage;
    private String chepaihao;
    private String zhuangtai;

    @Override
    public String toString() {
        return "Cheliang{" +
                "id=" + id +
                ", mingcheng='" + mingcheng + '\'' +
                ", pinpai='" + pinpai + '\'' +
                ", jiage='" + jiage + '\'' +
                ", chepaihao='" + chepaihao + '\'' +
                ", zhuangtai='" + zhuangtai + '\'' +
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

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public String getJiage() {
        return jiage;
    }

    public void setJiage(String jiage) {
        this.jiage = jiage;
    }

    public String getChepaihao() {
        return chepaihao;
    }

    public void setChepaihao(String chepaihao) {
        this.chepaihao = chepaihao;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public Cheliang() {
    }

    public Cheliang(Integer id, String zhuangtai) {
        this.id = id;
        this.zhuangtai = zhuangtai;
    }

    public Cheliang(Integer id, String mingcheng, String pinpai, String jiage, String chepaihao, String zhuangtai) {
        this.id = id;
        this.mingcheng = mingcheng;
        this.pinpai = pinpai;
        this.jiage = jiage;
        this.chepaihao = chepaihao;
        this.zhuangtai = zhuangtai;
    }
}
