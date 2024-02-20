package com.poly.py00023.truongminhtien.lab3;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào mảng n số nguyên từ bàn phím: ");
        int a = scanner.nextByte();
        int [] mangsonguyen = new int[a];
        for(int i = 0; i < a; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            mangsonguyen[i] = scanner.nextInt();
        }
        boolean giamdan = true;
        for(int i = 0; i < a -1; i++){
            if(mangsonguyen[i]< mangsonguyen[i+1]){
                giamdan = false;
                break;
            }
        }
        if (giamdan) {
            System.out.print("Dãy số giảm dần");
        } else {
            System.out.print("Dãy số không giảm dần");
        }
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (mangsonguyen[i] < mangsonguyen[j]) {
                    int temp = mangsonguyen[i];
                    mangsonguyen[i] = mangsonguyen[j];
                    mangsonguyen[j] = temp;
                }
            }
        }

        System.out.print("Dãy số sau khi được sắp xếp giảm dần:");
        for (int i = 0; i < a; i++) {
            System.out.print(mangsonguyen[i] + " ");
        }
    }
}
