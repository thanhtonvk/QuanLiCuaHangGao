package com.company.Entities;

public class KhachHang {
    private String makh;
    private  String tenkh;
    private String gioitinh;
    private String sdt;
    private String diachi;

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public KhachHang(String makh, String tenkh, String gioitinh, String sdt, String diachi) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.diachi = diachi;
    }
    @Override
    public String toString(){
        return makh+"#"+tenkh+"#"+gioitinh+"#"+sdt+"#"+diachi;
    }
}
