package com.company.GUI;

import com.company.BLL.HoaDonBan_BLL;
import com.company.DAL.HoaDonBan_DAL;
import com.company.Entities.HoaDonBan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HoaDonBan_GUI {
    public static void Menu() {
        System.out.println("---------------------------------------------------");
        System.out.println("|              QUẢN LÍ GẠO                        |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              1.Nhập hóa đơn bán                 |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              2.Hiện hóa đơn bán                 |");
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

    public static void Chon(ArrayList<HoaDonBan> list) throws IOException {

        int chon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            chon = Integer.parseInt(scanner.nextLine());

            if (chon == 6) break;
            switch (chon) {
                case 1:
                    HoaDonBan_BLL.nhapTT(list);
                    HoaDonBan_DAL.ghi(list);
                    break;
                case 2:
                    HoaDonBan_BLL.hienAll(list);
                    break;
                case 3:
                    HoaDonBan_BLL.sua(list);
                    HoaDonBan_DAL.ghi(list);
                    break;
                case 4:
                    HoaDonBan_BLL.xoa(list);
                    HoaDonBan_DAL.ghi(list);
                case 5:
                    HoaDonBan_BLL.timKiem(list);
                    break;
                default:
                    break;
            }

        }
    }
}
