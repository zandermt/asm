package com.poly.py00023.truongminhtien.lab2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.printf("Nhập vào 3 số thực lần lượt tương ứng với a,b và c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
            int p;
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Diện tích tam giác");
            System.out.println("2. Tính chu vi tam giác");
            System.out.println("3. Nhận diện tam giác");
            System.out.println("4. Thoát chương trình");
            System.out.println("+---------------------------------------------------+");
            do {
                System.out.printf("Chọn chức năng: ");
                p = scanner.nextInt();
            } while (p != 1 && p != 2 && p != 3 && p != 4);
            switch (p) {
                case 1:
                    Double P = (a + b + c) / 2;
                    Double dientich = Math.sqrt(P * (P - a) * (P - b) * (P - c));
                    System.out.printf("Vậy diện tích tam giác là: %.1f", dientich);
                    break;
                case 2:
                    Double chuvi = a + b + c;
                    System.out.printf("Vậy chu vi tam giác là: %.1f", chuvi);
                    break;
                case 3:
                    if ((a == b) && (b == c)) {
                        System.out.println("Tam giác đều");
                    } else if ((a == b) || (a == c) || (b == c)) {
                        System.out.println("Tam giác cân");
                    } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                        System.out.println("Tam giác vuông");
                    } else if (((a * a + b * b == c * c) && (a == b)) || ((a * a + c * c == b * b) && (a == c)) || ((b * b + c * c == a * a) && (b == c))) {
                        System.out.println("Tam giác vuông cân");
                    } else {
                        System.out.println("Tam giác thường");
                    }
                    break;
                case 4:
                    break;

            }
        } else {
            System.out.println("Không phải là tam giác");
        }
    }
}
