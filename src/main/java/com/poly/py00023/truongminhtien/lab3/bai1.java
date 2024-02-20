package com.poly.py00023.truongminhtien.lab3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên: ");
        int n;
        n = scanner.nextByte();
        if(n < 2){
            System.out.printf("số %d không phải là số nguyên tố", n);
        }
        int Dem = 0;
        for(int i = 1; i <= n-1; i++){
            if(n % i == 0){
                System.out.printf("số %d không phải là số nguyên tố", n);
                Dem++;
            }
        }
    }
}
