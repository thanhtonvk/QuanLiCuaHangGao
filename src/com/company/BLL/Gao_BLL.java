package com.company.BLL;

import com.company.Entities.Gao;

import java.util.ArrayList;

public class Gao_BLL {
    public static void nhapTT(ArrayList<Gao> list) {
        System.out.println("Nhập mã gạo");
        String magao = Nhap.nhapString();
        System.out.println("Nhập tên gạo");
        String tengao = Nhap.nhapString();
        System.out.println("Nhập giá");
        int gia = Nhap.nhapInt();
        System.out.println("Nhập ngày nhập");
        String ngaynhap = Nhap.nhapString();
        list.add(new Gao(magao, tengao, gia, ngaynhap));
    }

    public static void hien(Gao gao) {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n", gao.getMagao(), gao.getTengao(), gao.getGia(), gao.getNgaynhap());
    }

    public static void hienAll(ArrayList<Gao> list) {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n", "Mã gạo", "Tên gạo", "Giá gạo", "Ngày nhập");
        for (Gao gao : list) {
            hien(gao);
        }
    }

    public static Gao find(ArrayList<Gao> list) {
        Gao kq = null;
        System.out.println("Nhập mã hoặc tên gạo");
        String str = Nhap.nhapString();
        for (Gao gao : list
        ) {
            if (gao.getMagao().equalsIgnoreCase(str) || gao.getTengao().equalsIgnoreCase(str)) {
                kq = gao;
            }
        }
        return kq;
    }

    public static void timKiem(ArrayList<Gao> list) {
        Gao gao = find(list);
        if (gao == null) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n", "Mã gạo", "Tên gạo", "Giá gạo", "Ngày nhập");
            hien(gao);
        }
    }

    public static void sua(ArrayList<Gao> list) {
        boolean kt = false;
        System.out.println("Nhập mã hoặc tên gạo");
        String str = Nhap.nhapString();
        for (Gao gao : list
        ) {
            if (gao.getMagao().equalsIgnoreCase(str) || gao.getTengao().equalsIgnoreCase(str)) {
                System.out.println("Nhập mã gạo");
                gao.setMagao(Nhap.nhapString());
                System.out.println("Nhập tên gạo");
                gao.setTengao(Nhap.nhapString());
                System.out.println("Nhập giá");
                gao.setGia(Nhap.nhapInt());
                System.out.println("Nhập ngày nhập");
                System.out.println("Nhập ngày nhập");
                gao.setNgaynhap(Nhap.nhapString());
                kt =true;
            }

        }
        if(kt == false) System.out.println("Không tìm thấy");
    }
    public static  void xoa(ArrayList<Gao>list){
        list.remove(find(list));
    }
}
