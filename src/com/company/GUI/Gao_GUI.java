package com.company.GUI;

import com.company.Entities.*;
import com.company.BLL.*;
import com.company.DAL.*;

import java.io.IOException;
import java.util.*;

public class Gao_GUI {
    public static void Menu() {
        System.out.println("---------------------------------------------------");
        System.out.println("|              QUẢN LÍ GẠO                        |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              1.Nhập gạo                         |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              2.Hiện gạo                         |");
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

    public static void Chon(ArrayList<Gao> list) throws IOException {

        int chon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            chon = Integer.parseInt(scanner.nextLine());

            if (chon == 6) break;
            switch (chon) {
                case 1:
                    Gao_BLL.nhapTT(list);
                    Gao_DAL.ghi(list);
                    break;
                case 2:
                    Gao_BLL.hienAll(list);
                    break;
                case 3:
                    Gao_BLL.sua(list);
                    Gao_DAL.ghi(list);
                    break;
                case 4:
                    Gao_BLL.xoa(list);
                    Gao_DAL.ghi(list);
                case 5:
                    Gao_BLL.timKiem(list);
                    break;
                default:
                    break;
            }

        }
    }
}
