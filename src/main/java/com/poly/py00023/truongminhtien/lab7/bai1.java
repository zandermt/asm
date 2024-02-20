package com.poly.py00023.truongminhtien.lab7;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hình chữ nhật thứ nhất");
        ChuNhat cn1 = new ChuNhat();
        cn1.nhap();
        System.out.println("Nhập vào hình chữ nhật thứ hai");
        ChuNhat cn2 = new ChuNhat();
        cn2.nhap();
        ChuNhat vuong = new Vuong();
        System.out.println("Nhập vào hình vuông");
        System.out.print("Nhập vào cạnh: ");
        vuong.Chieudai = vuong.Chieurong = scanner.nextDouble();
        System.out.println ("Xuất hình chữ nhật thứ nhất");
        cn1.xuat();
        System.out.println ("Xuất hình chữ nhật thứ hai");
        cn2.xuat();
        System.out.println ("Xuất hình vuông");
        vuong.xuat();
    }
}
