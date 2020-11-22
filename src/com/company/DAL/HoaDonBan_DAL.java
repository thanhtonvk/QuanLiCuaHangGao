package com.company.DAL;


import com.company.Entities.HoaDonBan;

import java.io.*;
import  java.util.*;
public class HoaDonBan_DAL {
    //tạo file
    static File file = new File("Thongtinhoadonban.txt");
    public static void doc(ArrayList<HoaDonBan> list) throws IOException {
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
            String ngayban = line.split("#")[3];
            int soluong = Integer.parseInt(line.split("#")[4]);
            int gia = Integer.parseInt(line.split("#")[5]);
            int tongtien =  Integer.parseInt(line.split("#")[6]);
            list.add(new HoaDonBan(mahoadon,magao,tengao,ngayban,soluong,gia,tongtien));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public static void ghi(ArrayList<HoaDonBan>list) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (HoaDonBan hoaDonBan:list
        ) {
            //ghi file
            fileWriter.write(hoaDonBan.toString()+"\n");
        }
        fileWriter.close();
    }
}