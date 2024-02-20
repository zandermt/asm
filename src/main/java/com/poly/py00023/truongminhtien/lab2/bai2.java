package com.poly.py00023.truongminhtien.lab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double delta, a, b, c, x1, x2;
        System.out.print("Nhập vào lần lượt a, b và c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        delta = Math.pow(b, 2) - 4 * (a * c);
        if (a == 0) {
            double x = -c / b;
            System.out.printf("Vậy phương trình có nghiệm x = %.1f", x);
        } else {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Vây phương trình có nghiệm kép x = %f", x);
            } else if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Vậy phương trình có 2 nghiệm phân biệt là x1 = %.1f và x2 = %.1f", x1, x2);
            }
        }
    }
}

