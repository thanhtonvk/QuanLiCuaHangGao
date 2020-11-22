package com.company.DAL;

import com.company.Entities.HoaDonBan;
import com.company.Entities.HoaDonNhap;

import java.io.*;
import java.util.ArrayList;

public class HoaDonNhap_DAL {
    static File file = new File("Thongtinhoadonnhap.txt");
    public static void doc(ArrayList<HoaDonNhap> list) throws IOException {
        //sử dụng file reader để đọc file
        FileReader fileReader = new FileReader(file);
        //sử dụng phương thức này để đọc từng dòng
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null){
            //tách chuỗi
            String mahoadon = line.split("#")[0];
            String magao = line.split("#")[1];
            String tengao = line.split("#")[2];
            String ngaynhap = line.split("#")[3];
            int soluong = Integer.parseInt(line.split("#")[4]);
            int gia = Integer.parseInt(line.split("#")[5]);
            int tongtien =  Integer.parseInt(line.split("#")[6]);
            list.add(new HoaDonNhap(mahoadon,magao,tengao,ngaynhap,soluong,gia,tongtien));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public static void ghi(ArrayList<HoaDonNhap>list) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (HoaDonNhap hoaDonNhap:list
        ) {
            //ghi file
            fileWriter.write(hoaDonNhap.toString()+"\n");
        }
        fileWriter.close();
    }
}
