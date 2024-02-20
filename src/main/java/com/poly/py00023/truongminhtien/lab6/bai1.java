package com.poly.py00023.truongminhtien.lab6;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào họ tên: ");
        String hoTen = scanner.nextLine();
        hoTen.trim();
        String ho = hoTen.substring(0, hoTen.indexOf(" "));
        String tendem = hoTen.substring(hoTen.indexOf(" "), hoTen.lastIndexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" "));

        System.out.printf("%s %s %s", ten.toUpperCase(), ho.toUpperCase(), tendem);
    }
}
