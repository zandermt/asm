package com.poly.py00023.truongminhtien.lab3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        System.out.println("Bảng cửu chương");
        for (int i = 2; i <= 9; i++) {
            int a = 2;
            for (a = 1; a <= 10; a++) {
                x = a * i;
                System.out.printf("\n %d * %d = %.0f", i, a, x);
            }
        }
    }
}
