package com.company.BLL;

import com.company.Entities.*;

import java.util.ArrayList;

public class HoaDonBan_BLL {
    //    String mahoadon, String magao, String tengao, String ngaynhap, int soluong, int gia, int tongtien
    public static void nhapTT(ArrayList<HoaDonBan> list) {
        System.out.println("Nhập mã hóa đơn");
        String mahoadon = Nhap.nhapString();
        System.out.println("NHập mã gạo");
        String magao = Nhap.nhapString();
        System.out.println("Nhập tên gạo");
        String tengao = Nhap.nhapString();
        System.out.println("Nhập ngày nhập");
        String ngaynhap = Nhap.nhapString();
        System.out.println("Nhập số lượng");
        int soluong = Nhap.nhapInt();
        System.out.println("Nhập giá");
        int gia = Nhap.nhapInt();
        int tongtien = soluong * gia;
        list.add(new HoaDonBan(mahoadon, magao, tengao, ngaynhap, soluong, gia, tongtien));
    }

    public static void hien(HoaDonBan HoaDonBan) {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n", HoaDonBan.getMahoadon(), HoaDonBan.getMagao(), HoaDonBan.getTengao(), HoaDonBan.getNgaynhap(), HoaDonBan.getSoluong(), HoaDonBan.getGia(), HoaDonBan.getTongtien());
    }

    public static void hienAll(ArrayList<HoaDonBan> list) {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n", "Mã hóa đơn", "Mã gạo", "Tên gạo", "Ngày nhập", "Số lượng", "Giá", "Tổng tiền");
        for (HoaDonBan HoaDonBan : list) {
            hien(HoaDonBan);
        }
    }

    public static HoaDonBan find(ArrayList<HoaDonBan> list) {
        HoaDonBan kq = null;
        System.out.println("Nhập mã hóa đơn hoặc mã gạo");
        String str = Nhap.nhapString();
        for (HoaDonBan HoaDonBan : list
        ) {
            if (HoaDonBan.getMahoadon().equalsIgnoreCase(str) || HoaDonBan.getMagao().equalsIgnoreCase(str)) {
                kq = HoaDonBan;
            }
        }
        return kq;
    }

    public static void timKiem(ArrayList<HoaDonBan> list) {
        HoaDonBan HoaDonBan = find(list);
        if (HoaDonBan == null) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n", "Mã hóa đơn", "Mã gạo", "Tên gạo", "Ngày nhập", "Số lượng", "Giá", "Tổng tiền");
            hien(HoaDonBan);
        }
    }

    public static void sua(ArrayList<HoaDonBan> list) {
        boolean kt = false;
        System.out.println("Nhập mã hoặc tên gạo");
        String str = Nhap.nhapString();
        for (HoaDonBan HoaDonBan : list
        ) {
            if (HoaDonBan.getMagao().equalsIgnoreCase(str) || HoaDonBan.getMahoadon().equalsIgnoreCase(str)) {
                System.out.println("Nhập mã hóa đơn");
                HoaDonBan.setMahoadon(Nhap.nhapString());
                System.out.println("NHập mã gạo");
                HoaDonBan.setMagao(Nhap.nhapString());
                System.out.println("Nhập tên gạo");
                HoaDonBan.setTengao(Nhap.nhapString());
                System.out.println("Nhập ngày nhập");
                HoaDonBan.setNgaynhap(Nhap.nhapString());
                System.out.println("Nhập số lượng");
                HoaDonBan.setSoluong(Nhap.nhapInt());
                System.out.println("Nhập giá");
                HoaDonBan.setGia(Nhap.nhapInt());
                HoaDonBan.setTongtien(HoaDonBan.getGia() * HoaDonBan.getSoluong());
                kt = true;
            }

        }
        if (kt == false) System.out.println("Không tìm thấy");
    }

    public static void xoa(ArrayList<HoaDonBan> list) {
        list.remove(find(list));
    }
}
