package com.poly.py00023.truongminhtien.lab2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p;
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
        do {
            System.out.printf("Chọn chức năng: ");
            p = scanner.nextInt();
        } while (p != 1 && p != 2 && p != 3 && p != 4);

        switch (p) {
            case 1:
                System.out.print("Nhập vào lần lượt a và b: ");
                double A = scanner.nextDouble();
                double B = scanner.nextDouble();
                if (A == 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else if (B == 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else {
                    double x = -B / A;
                    System.out.printf("Vậy nghiệm của phương trình bậc nhất là: %.1f", x);
                }
                break;
            case 2:
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
                break;
            case 3:
                double soDien = 0, soTien;
                do {
                    System.out.print("Nhập vào số điện sử dụng của tháng: ");
                    soDien = scanner.nextDouble();
                } while (soDien < 0);
                if (50 >= soDien) {
                    soTien = soDien * 1000;
                    System.out.printf("Vậy giá số tiền cần phải trả của tháng là: %.1f", soTien);
                } else {
                    soTien = 50 * 1000 + (soDien - 50) * 1200;
                    System.out.printf("Vậy giá số tiền cần phải trả của tháng là: %.1f", soTien);
                }
                    break;
                case 4:
                        break;
        }
    }
}

