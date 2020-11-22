package com.company.GUI;

import com.company.BLL.KhachHang_BLL;
import com.company.DAL.KhachHang_DAL;
import com.company.Entities.KhachHang;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class KhachHang_GUI {
    public static void Menu() {
        System.out.println("---------------------------------------------------");
        System.out.println("|              QUẢN LÍ GẠO                        |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              1.Nhập khách hàng                  |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              2.Hiện khách hàng                  |");
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

    public static void Chon(ArrayList<KhachHang> list) throws IOException {

        int chon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            chon = Integer.parseInt(scanner.nextLine());

            if (chon == 6) break;
            switch (chon) {
                case 1:
                    KhachHang_BLL.nhapTT(list);
                    KhachHang_DAL.ghi(list);
                    break;
                case 2:
                    KhachHang_BLL.hienAll(list);
                    break;
                case 3:
                    KhachHang_BLL.sua(list);
                    KhachHang_DAL.ghi(list);
                    break;
                case 4:
                    KhachHang_BLL.xoa(list);
                    KhachHang_DAL.ghi(list);
                case 5:
                    KhachHang_BLL.timKiem(list);
                    break;
                default:
                    break;
            }

        }
    }
}
