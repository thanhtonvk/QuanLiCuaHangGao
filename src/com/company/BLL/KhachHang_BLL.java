package com.company.BLL;

import com.company.Entities.*;

import java.util.ArrayList;

public class KhachHang_BLL {
    //    String makh, String tenkh, String gioitinh, String sdt, String diachi
    public static void nhapTT(ArrayList<KhachHang> list) {
        System.out.println("Nhập mã khách hàng");
        String makh = Nhap.nhapString();
        System.out.println("NHập tên khách hàng");
        String tenkh = Nhap.nhapString();
        System.out.println("Nhập giới tính");
        String gioitinh = Nhap.nhapString();
        System.out.println("Nhập số điện thoại");
        String sdt = Nhap.nhapString();
        System.out.println("Nhập địa chỉ");
        String diachi = Nhap.nhapString();
        list.add(new KhachHang(makh, tenkh, gioitinh, sdt, diachi));
    }

    public static void hien(KhachHang KhachHang) {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", KhachHang.getMakh(), KhachHang.getTenkh(), KhachHang.getGioitinh(), KhachHang.getSdt(), KhachHang.getDiachi());
    }

    public static void hienAll(ArrayList<KhachHang> list) {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", "Mã khách hàng", "Tên khách hàng", "Giới tính", "Số điện thoại", "Địa chỉ");
        for (KhachHang KhachHang : list) {
            hien(KhachHang);
        }
    }

    public static KhachHang find(ArrayList<KhachHang> list) {
        KhachHang kq = null;
        System.out.println("Nhập mã khách hàng hoặc tên khách hàng");
        String str = Nhap.nhapString();
        for (KhachHang KhachHang : list
        ) {
            if (KhachHang.getMakh().equalsIgnoreCase(str) || KhachHang.getTenkh().equalsIgnoreCase(str)) {
                kq = KhachHang;
            }
        }
        return kq;
    }

    public static void timKiem(ArrayList<KhachHang> list) {
        KhachHang KhachHang = find(list);
        if (KhachHang == null) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", "Mã khách hàng", "Tên khách hàng", "Giới tính", "Số điện thoại", "Địa chỉ");
            hien(KhachHang);
        }
    }

    public static void sua(ArrayList<KhachHang> list) {
        boolean kt = false;
        System.out.println("Nhập mã khách hàng hoặc tên khách hàng");
        String str = Nhap.nhapString();
        for (KhachHang KhachHang : list
        ) {
            if (KhachHang.getTenkh().equalsIgnoreCase(str) || KhachHang.getMakh().equalsIgnoreCase(str)) {
                System.out.println("Nhập mã khách hàng");
                KhachHang.setMakh(Nhap.nhapString());
                System.out.println("NHập tên khách hàng");
                KhachHang.setTenkh(Nhap.nhapString());
                System.out.println("Nhập giới tính");
                KhachHang.setGioitinh(Nhap.nhapString());
                System.out.println("Nhập số điện thoại");
                KhachHang.setSdt(Nhap.nhapString());
                System.out.println("Nhập địa chỉ");
                KhachHang.setDiachi(Nhap.nhapString());
                kt = true;
            }

        }
        if (kt == false) System.out.println("Không tìm thấy");
    }

    public static void xoa(ArrayList<KhachHang> list) {
        list.remove(find(list));
    }
}
