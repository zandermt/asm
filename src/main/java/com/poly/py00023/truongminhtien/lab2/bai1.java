package com.poly.py00023.truongminhtien.lab2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào lần lượt a và b: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if(a == 0){
                System.out.println("Phương trình vô nghiệm");
            } else if(b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                double x = -b / a;
                System.out.printf("Vậy nghiệm của phương trình bậc nhất là: %.1f", x);
            }
        }
    }

