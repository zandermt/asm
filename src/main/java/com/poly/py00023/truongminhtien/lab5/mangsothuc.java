package com.poly.py00023.truongminhtien.lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class mangsothuc {
    private ArrayList<Double> list = new ArrayList<>();
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập danh sách số thực");
        while (true){
            System.out.print("Nhập số: ");
            Double x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();
            System.out.print("Bạn có muốn nhập tiếp dữ liệu không (Y/N):  ");
            if (scanner.nextLine().equals("N")){
                break;
            }
        } 
    }
    public void xuat(){
        System.out.println("--------------------------------------");
        for (Double item : list) {
            System.out.println("  " + item);
        }
    }
    public void tong(){
        double tong = 0;
        for (Double item : list) {
            tong += item;   
        }
        System.out.println(" ");
        System.out.println("Tổng: " + tong);
    }
}
