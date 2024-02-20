package com.poly.py00023.truongminhtien.lab3;

import java.util.Scanner;
import java.util.Arrays;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào mảng số nguyên từ bàn phím: ");
        int a = scanner.nextByte();
        int [] mangsonguyen = new int[a];
        for(int i = 0; i < a; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            mangsonguyen[i] = scanner.nextInt();
        }
        Arrays.sort(mangsonguyen);
        System.out.println("Vậy mảng sau khi sắp xếp là: " +Arrays.toString(mangsonguyen));

        int min = mangsonguyen[0];
        for(int i = 0; i < a; i++){
            if(min > mangsonguyen[i]) {
                min = mangsonguyen[i];
            }
        }
        System.out.printf("Vậy số nhỏ nhất trong mảng là: %d", min);

        double dem = 0;
        double tong = 0;
        for(int i = 0; i < a; i++){
            if(mangsonguyen[i] % 3 == 0){
                tong += mangsonguyen[i];
                dem++;
            }
        }
        double trungbinh = tong / dem;
        System.out.printf("\n Vậy trung bình các số trong mảng chia hết cho 3 là: %.1f", trungbinh);
    }
}
