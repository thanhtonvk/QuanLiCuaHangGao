package com.company.Entities;

public class HoaDonBan {
    private String mahoadon, magao, tengao, ngaynhap;
    private int soluong, gia, tongtien;

    public HoaDonBan(String mahoadon, String magao, String tengao, String ngaynhap, int soluong, int gia, int tongtien) {
        this.mahoadon = mahoadon;
        this.magao = magao;
        this.tengao = tengao;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
        this.gia = gia;
        this.tongtien = tongtien;
    }

    @Override
    public String toString() {
        return mahoadon + "#" + magao + "#" + tengao + "#" + ngaynhap + "#" + soluong + "#" + gia + "#" + tongtien;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
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

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }
}
