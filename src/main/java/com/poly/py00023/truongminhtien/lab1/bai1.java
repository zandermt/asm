package com.poly.py00023.truongminhtien.lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoten = scanner.nextLine();
        System.out.print("Điểm trung bình: ");
        Float diemtb = scanner.nextFloat();
        System.out.printf("%s %.1f điểm", hoten, diemtb);
    }
}