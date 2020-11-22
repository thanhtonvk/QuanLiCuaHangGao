package com.company;
import com.company.DAL.*;
import com.company.Entities.*;
import com.company.GUI.Gao_GUI;
import com.company.GUI.HoaDonBan_GUI;
import com.company.GUI.HoaDonNhap_GUI;
import com.company.GUI.KhachHang_GUI;

import java.util.*;
public class Main {

    public static void Menu(){
        System.out.println("_________________________________________________________");
        System.out.println("|                1.Quản lí Gạo                          |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                2.Quản lí hóa đơn bán                  |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                3.Quản lí hóa đơn nhập                 |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                4.Quản lí khách hàng                   |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                5.Thoát                                |");
        System.out.println("---------------------------------------------------------");
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        ArrayList<Gao>gaos = new ArrayList<>();
        ArrayList<HoaDonBan>hoaDonBans = new ArrayList<>();
        ArrayList<HoaDonNhap>hoaDonNhaps = new ArrayList<>();
        ArrayList<KhachHang>khachHangs = new ArrayList<>();
        Gao_DAL.doc(gaos);
        HoaDonBan_DAL.doc(hoaDonBans);
        HoaDonNhap_DAL.doc(hoaDonNhaps);
        KhachHang_DAL.doc(khachHangs);
        int chon;
        Scanner scanner = new Scanner(System.in);
        while(true){
            Menu();
            chon = Integer.parseInt(scanner.nextLine());
            if(chon ==5) break;
            switch (chon){
                case 1:
                    Gao_GUI.Chon(gaos);
                    break;
                case 2:
                    HoaDonBan_GUI.Chon(hoaDonBans);
                    break;
                case 3:
                    HoaDonNhap_GUI.Chon(hoaDonNhaps);
                    break;
                case 4:
                    KhachHang_GUI.Chon(khachHangs);
                    break;
                default:break;
            }

        }
    }
}
