package com.poly.py00023.truongminhtien.lab2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soDien = 0, soTien;
        System.out.print("Nhập vào số điện sử dụng của tháng: ");
        soDien = scanner.nextDouble();
        if (50 >= soDien) {
            soTien = soDien * 1000;
            System.out.printf("Vậy giá số tiền cần phải trả của tháng là: %.1f", soTien);
        } else {
            soTien = 50 * 1000 + (soDien - 50) * 1200;
            System.out.printf("Vậy giá số tiền cần phải trả của tháng là: %.1f", soTien);
        }
    }
}
