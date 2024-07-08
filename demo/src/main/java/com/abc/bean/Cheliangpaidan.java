package com.abc.bean;

public class Cheliangpaidan {
    private Integer id;
    private String cheliangid;
    private String sijiid;
    private String paidanshijian;
    private String lianxifangshi;

    @Override
    public String toString() {
        return "Cheliangpaidan{" +
                "id=" + id +
                ", cheliangid='" + cheliangid + '\'' +
                ", sijiid='" + sijiid + '\'' +
                ", paidanshijian='" + paidanshijian + '\'' +
                ", lianxifangshi='" + lianxifangshi + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheliangid() {
        return cheliangid;
    }

    public void setCheliangid(String cheliangid) {
        this.cheliangid = cheliangid;
    }

    public String getSijiid() {
        return sijiid;
    }

    public void setSijiid(String sijiid) {
        this.sijiid = sijiid;
    }

    public String getPaidanshijian() {
        return paidanshijian;
    }

    public void setPaidanshijian(String paidanshijian) {
        this.paidanshijian = paidanshijian;
    }

    public String getLianxifangshi() {
        return lianxifangshi;
    }

    public void setLianxifangshi(String lianxifangshi) {
        this.lianxifangshi = lianxifangshi;
    }

    public Cheliangpaidan() {
    }

    public Cheliangpaidan(Integer id, String cheliangid, String sijiid, String paidanshijian, String lianxifangshi) {
        this.id = id;
        this.cheliangid = cheliangid;
        this.sijiid = sijiid;
        this.paidanshijian = paidanshijian;
        this.lianxifangshi = lianxifangshi;
    }
}
