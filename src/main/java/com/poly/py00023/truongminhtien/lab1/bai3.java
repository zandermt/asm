package com.poly.py00023.truongminhtien.lab1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài cạnh của khối lập phương: ");
        Double a = scanner.nextDouble();
        Double thetich = a * a * a;
        System.out.printf("Thể tích khối lập phương là: %.1f ", thetich);
    }
}