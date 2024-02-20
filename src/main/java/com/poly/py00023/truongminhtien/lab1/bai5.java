package com.poly.py00023.truongminhtien.lab1;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình tính lãi suất ngân hàng");
        System.out.println("=================================================");
        System.out.print(" Nhập vào số tiền gốc: ");
        Double A = scanner.nextDouble();
        System.out.print("\n Nhập vào lãi (%/năm): ");
        Double B = scanner.nextDouble();
        System.out.print("\n Nhập vào thời gian gửi tiết kiệm (năm): ");
        Double C = scanner.nextDouble();
        System.out.println("=================================================");
        Double laidon = A * ( 1 + B / 100 * C );
        Double laikep = A * Math.pow( (1 + B / 100), C );
        System.out.printf("\n [Lãi đơn] Số tiền khách hàng nhận được sau %f năm là: %.0f", C, laidon);
        System.out.printf("\n [Lãi kép] Số tiền khách hàng nhận được sau %f năm là: %.0f", C, laikep);
    }
}