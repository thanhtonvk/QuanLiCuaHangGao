package com.company.BLL;

import java.util.Scanner;

public class Nhap {
    static Scanner scanner = new Scanner(System.in);
    public static String nhapString(){
        String str;
        while(true){
            str = scanner.nextLine();
            if(str!="") break;
        }
        return str;
    }
    public static int nhapInt(){
        int num;
        while(true){
            num = Integer.parseInt(scanner.nextLine());
            if(num>0) break;
        }
        return  num;
    }
}
