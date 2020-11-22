package com.company.DAL;

import com.company.Entities.Gao;
import java.io.*;
import  java.util.ArrayList;
public class Gao_DAL {
    //tạo file
    static File file = new File("gao.txt");
    public static void doc(ArrayList<Gao> list) throws IOException {
        //sử dụng file reader để đọc file
        FileReader fileReader = new FileReader(file);
        //sử dụng phương thức này để đọc từng dòng
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null){
            //tách chuỗi
            String magao = line.split("#")[0];
            String tengao = line.split("#")[1];
            int gia = Integer.parseInt(line.split("#")[2]);
            String ngaynhap =line.split("#")[3];

            list.add(new Gao(magao,tengao,gia,ngaynhap));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public static void ghi(ArrayList<Gao>list) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (Gao gao:list
        ) {
            //ghi file
            fileWriter.write(gao.toString()+"\n");
        }
        fileWriter.close();
    }
}
