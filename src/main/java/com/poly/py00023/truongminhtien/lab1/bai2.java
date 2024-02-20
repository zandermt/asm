package com.poly.py00023.truongminhtien.lab1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào lần lượt chiều dài và chiều rộng của hình chữ nhật: ");
        Double chieudai = scanner.nextDouble(), chieurong = scanner.nextDouble();
        Double chuvi = (chieudai + chieurong) * 2;
        Double dientich = chieudai * chieurong;
        Double canhnhonhat = Math.min(chieudai, chieurong);
        System.out.printf(" Chu vi hình chữ nhật là %.1f", chuvi);
        System.out.printf("\n Diện tích hình chữ nhật là %.1f", dientich);
        System.out.printf("\n Cạnh nhỏ nhất của hình chữ nhật là %.1f", canhnhonhat);
    }
}