package com.company.Entities;

public class HoaDonNhap {
    private String mahoadon,magao,tengao,ngayban;
    private int soluong,gia,tongtien;

    @Override
    public String toString(){
        return mahoadon+"#"+magao+"#"+tengao+"#"+ngayban+"#"+soluong+"#"+gia+"#"+tongtien;
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

    public String getNgayban() {
        return ngayban;
    }

    public void setNgayban(String ngayban) {
        this.ngayban = ngayban;
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

    public HoaDonNhap(String mahoadon, String magao, String tengao, String ngayban, int soluong, int gia, int tongtien) {
        this.mahoadon = mahoadon;
        this.magao = magao;
        this.tengao = tengao;
        this.ngayban = ngayban;
        this.soluong = soluong;
        this.gia = gia;
        this.tongtien = tongtien;
    }
}
