package com.poly.py00023.truongminhtien.lab1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào các hệ số a, b, c của pt bậc 2: ");
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();
        Double delta = Math.pow(b, 2) - 4 * a * c;
        Double candelta = Math.sqrt(delta);
        System.out.printf("Delta của pt bậc 2 là: %.1f", delta);
        System.out.printf("\n Căn của delta là: %.1f", candelta);
    }
}