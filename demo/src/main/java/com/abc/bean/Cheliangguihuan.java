package com.abc.bean;

public class Cheliangguihuan {
    private Integer id;
    private String chelinagid;
    private String luxian;
    private String cheliangzhuangtai;
    private String kaishishijian;
    private String guihuanshijian;

    public Cheliangguihuan(Integer id, String chelinagid, String luxian, String cheliangzhuangtai, String kaishishijian, String guihuanshijian) {
        this.id = id;
        this.chelinagid = chelinagid;
        this.luxian = luxian;
        this.cheliangzhuangtai = cheliangzhuangtai;
        this.kaishishijian = kaishishijian;
        this.guihuanshijian = guihuanshijian;
    }

    @Override
    public String toString() {
        return "Cheliangguihuan{" +
                "id=" + id +
                ", chelinagid='" + chelinagid + '\'' +
                ", luxian='" + luxian + '\'' +
                ", cheliangzhuangtai='" + cheliangzhuangtai + '\'' +
                ", kaishishijian='" + kaishishijian + '\'' +
                ", guihuanshijian='" + guihuanshijian + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChelinagid() {
        return chelinagid;
    }

    public void setChelinagid(String chelinagid) {
        this.chelinagid = chelinagid;
    }

    public String getLuxian() {
        return luxian;
    }

    public void setLuxian(String luxian) {
        this.luxian = luxian;
    }

    public String getCheliangzhuangtai() {
        return cheliangzhuangtai;
    }

    public void setCheliangzhuangtai(String cheliangzhuangtai) {
        this.cheliangzhuangtai = cheliangzhuangtai;
    }

    public String getKaishishijian() {
        return kaishishijian;
    }

    public void setKaishishijian(String kaishishijian) {
        this.kaishishijian = kaishishijian;
    }

    public String getGuihuanshijian() {
        return guihuanshijian;
    }

    public void setGuihuanshijian(String guihuanshijian) {
        this.guihuanshijian = guihuanshijian;
    }

    public Cheliangguihuan() {
    }
}
