package com.company.BLL;

import com.company.Entities.*;

import java.util.ArrayList;

public class HoaDonNhap_BLL {

    public static void nhapTT(ArrayList<HoaDonNhap> list) {
        System.out.println("Nhập mã hóa đơn");
        String mahoadon = Nhap.nhapString();
        System.out.println("NHập mã gạo");
        String magao = Nhap.nhapString();
        System.out.println("Nhập tên gạo");
        String tengao = Nhap.nhapString();
        System.out.println("Nhập ngày bán");
        String ngaynhap = Nhap.nhapString();
        System.out.println("Nhập số lượng");
        int soluong = Nhap.nhapInt();
        System.out.println("Nhập giá");
        int gia = Nhap.nhapInt();
        int tongtien = soluong * gia;
        list.add(new HoaDonNhap(mahoadon, magao, tengao, ngaynhap, soluong, gia, tongtien));
    }

    public static void hien(HoaDonNhap HoaDonNhap) {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n", HoaDonNhap.getMahoadon(), HoaDonNhap.getMagao(), HoaDonNhap.getTengao(), HoaDonNhap.getNgayban(), HoaDonNhap.getSoluong(), HoaDonNhap.getGia(), HoaDonNhap.getTongtien());
    }

    public static void hienAll(ArrayList<HoaDonNhap> list) {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n", "Mã hóa đơn", "Mã gạo", "Tên gạo", "Ngày bán", "Số lượng", "Giá", "Tổng tiền");
        for (HoaDonNhap HoaDonNhap : list) {
            hien(HoaDonNhap);
        }
    }

    public static HoaDonNhap find(ArrayList<HoaDonNhap> list) {
        HoaDonNhap kq = null;
        System.out.println("Nhập mã hóa đơn hoặc mã gạo");
        String str = Nhap.nhapString();
        for (HoaDonNhap HoaDonNhap : list
        ) {
            if (HoaDonNhap.getMahoadon().equalsIgnoreCase(str) || HoaDonNhap.getMagao().equalsIgnoreCase(str)) {
                kq = HoaDonNhap;
            }
        }
        return kq;
    }

    public static void timKiem(ArrayList<HoaDonNhap> list) {
        HoaDonNhap HoaDonNhap = find(list);
        if (HoaDonNhap == null) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n", "Mã hóa đơn", "Mã gạo", "Tên gạo", "Ngày bán", "Số lượng", "Giá", "Tổng tiền");
            hien(HoaDonNhap);
        }
    }

    public static void sua(ArrayList<HoaDonNhap> list) {
        boolean kt = false;
        System.out.println("Nhập mã hoặc tên gạo");
        String str = Nhap.nhapString();
        for (HoaDonNhap HoaDonNhap : list
        ) {
            if (HoaDonNhap.getMagao().equalsIgnoreCase(str) || HoaDonNhap.getMahoadon().equalsIgnoreCase(str)) {
                System.out.println("Nhập mã hóa đơn");
                HoaDonNhap.setMahoadon(Nhap.nhapString());
                System.out.println("NHập mã gạo");
                HoaDonNhap.setMagao(Nhap.nhapString());
                System.out.println("Nhập tên gạo");
                HoaDonNhap.setTengao(Nhap.nhapString());
                System.out.println("Nhập ngày bán");
                HoaDonNhap.setNgayban(Nhap.nhapString());
                System.out.println("Nhập số lượng");
                HoaDonNhap.setSoluong(Nhap.nhapInt());
                System.out.println("Nhập giá");
                HoaDonNhap.setGia(Nhap.nhapInt());
                HoaDonNhap.setTongtien(HoaDonNhap.getGia() * HoaDonNhap.getSoluong());
                kt = true;
            }

        }
        if (kt == false) System.out.println("Không tìm thấy");
    }

    public static void xoa(ArrayList<HoaDonNhap> list) {
        list.remove(find(list));
    }
}
