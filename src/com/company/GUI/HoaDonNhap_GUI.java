package com.company.GUI;

import com.company.BLL.HoaDonNhap_BLL;
import com.company.DAL.HoaDonNhap_DAL;
import com.company.Entities.HoaDonNhap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HoaDonNhap_GUI {
    public static void Menu() {
        System.out.println("---------------------------------------------------");
        System.out.println("|              QUẢN LÍ HÓA ĐƠN NHẬP               |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              1.Nhập hóa đơn                     |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              2.Hiện hóa đơn                     |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              3.Sửa                              |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              4.Xóa                              |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              5.Tìm kiếm                         |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              6.Thoát                            |");
        System.out.println("---------------------------------------------------");
    }

    public static void Chon(ArrayList<HoaDonNhap> list) throws IOException {

        int chon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            chon = Integer.parseInt(scanner.nextLine());

            if (chon == 6) break;
            switch (chon) {
                case 1:
                    HoaDonNhap_BLL.nhapTT(list);
                    HoaDonNhap_DAL.ghi(list);
                    break;
                case 2:
                    HoaDonNhap_BLL.hienAll(list);
                    break;
                case 3:
                    HoaDonNhap_BLL.sua(list);
                    HoaDonNhap_DAL.ghi(list);
                    break;
                case 4:
                    HoaDonNhap_BLL.xoa(list);
                    HoaDonNhap_DAL.ghi(list);
                case 5:
                    HoaDonNhap_BLL.timKiem(list);
                    break;
                default:
                    break;
            }

        }
    }
}
