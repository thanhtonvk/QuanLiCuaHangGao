package com.company.Entities;

public class Gao {
    private String magao;
    private String tengao;
    private int gia;
    private String ngaynhap;

    public Gao(String magao, String tengao, int gia, String ngaynhap) {
        this.magao = magao;
        this.tengao = tengao;
        this.gia = gia;
        this.ngaynhap = ngaynhap;
    }
    @Override
    public String toString(){
        return magao+"#"+tengao+"#"+gia+"#"+ngaynhap;
    }

    public String getMagao() {
        return magao;
    }

    public void setMagao(String magao) {
        this.magao = magao;
    }

    public String getTengao() {
        return tengao;
    }

    public void setTengao(String tengao) {
        this.tengao = tengao;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
}
