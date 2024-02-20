package com.poly.py00023.truongminhtien.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai2 {
    public static ArrayList<String> danhSachHoTen = new ArrayList<>();

    public static void nhap () {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("nhap ho ten: ");
            String ten = scanner.nextLine();
            danhSachHoTen.add(ten);
            System.out.print("ban co nhap tiep khong (c/k): ");
            
        }while (!scanner.nextLine().equalsIgnoreCase("k"));
    }
    
    public static void xuat(){
        for(String ten: danhSachHoTen)
            System.out.println(ten);
            System.out.println();
    }

    public static void sapxep(){
        Collections.sort(danhSachHoTen);
        Collections.reverse(danhSachHoTen);
    }

    public static void ngaunhien(){
        Collections.shuffle(danhSachHoTen);
    }

    public static void xoa(String ten){
        danhSachHoTen.remove(ten);
    }
    
    public static void Menu () {
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("1. nhap ");
        System.out.println("2. xuat ");
        System.out.println("3. sap xep ");
        System.out.println("4. ngau nhien ");
        System.out.println("5. xoa ");
        System.out.println("0. thoat ");
        System.out.print("Moi ban chon chuc nang: ");
        int chon = scanner.nextInt();
        switch (chon){
            case 0:
                System.out.println("Chao tam biet");2
                System.exit(chon);
                break;
            case 1:
                nhap();
                break;
             case 2:
                xuat();
                break;
             case 3:
                sapxep();
                xuat();
                break;
             case 4:
                ngaunhien();
                xuat();
                break;
             case 5:
                 System.out.print("ten can xoa: ");
                 scanner.nextLine();
                 xoa(scanner.nextLine());
                 xuat();
                break;
             default:
                 System.out.println("\nMoi ban cho chuc nang: ");
                }
            }
        }
        public static void main (String[] args) {
        ArrayList<String> danhSachHoTen = new ArrayList<>();
        Menu();
    }
}
