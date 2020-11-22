package com.company.DAL;

import com.company.Entities.KhachHang;

import java.io.*;
import java.util.ArrayList;

public class KhachHang_DAL {
    static File file = new File("thongtinkhachhang.txt");
    public static void doc(ArrayList<KhachHang> list) throws IOException {
        //sử dụng file reader để đọc file
        FileReader fileReader = new FileReader(file);
        //sử dụng phương thức này để đọc từng dòng
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null){
            //tách chuỗi
           String makh= line.split("#")[0];
            String tenkh= line.split("#")[1];
            String gioitinh= line.split("#")[2];
            String sdt= line.split("#")[3];
            String diachi = line.split("#")[4];
            list.add(new KhachHang(makh,tenkh,gioitinh,sdt,diachi));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public static void ghi(ArrayList<KhachHang>list) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (KhachHang khachhang:list
        ) {
            //ghi file
            fileWriter.write(khachhang.toString()+"\n");
        }
        fileWriter.close();
    }
}
