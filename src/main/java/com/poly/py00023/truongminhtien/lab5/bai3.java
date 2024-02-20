package com.poly.py00023.truongminhtien.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai3 {
    public static ArrayList<SanPham> dsSanPham = new ArrayList<>();
    
    public static void Nhap(){        
        Scanner scanner= new Scanner(System.in);
    
        do{
            SanPham sp = new SanPham();
            sp.Nhap();
            dsSanPham.add(sp);
            System.out.print("Ban co nhap tiep khong (C/K)? ");
        }while(!scanner.nextLine().equalsIgnoreCase("K"));
    }
    
    public static void Xuat(){
        for(SanPham sp:dsSanPham){
            sp.Xuat();
        }
        System.out.println(" ");
    }
    
    public static void SapXep(){
        Comparator<SanPham> comp = new Comparator<>(){
            @Override
            public int compare(SanPham o1, SanPham o2){
                return o1.giaSP.compareTo(o2.giaSP);
            }
        };
        Collections.sort(dsSanPham,comp);
        Collections.reverse(dsSanPham);
    }
    
    public static void NgauNhien(){
        Collections.shuffle(dsSanPham);          
    }
    
    public static void Xoa(String ten){
        int index = -1;
        for(int i = 0; i < dsSanPham.size(); i++){
            if(dsSanPham.get(i).tenSP.equalsIgnoreCase(ten)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Khong tim thay san pham " + ten);
        }else{
            dsSanPham.remove(index);
        }
    }
    
    public static void GiaTB(){
        double tong = 0.0;
        for(SanPham sp:dsSanPham){
            tong += sp.giaSP;
        }
        System.out.printf("Gia trung binh %.3f",tong/dsSanPham.size());
    }
    
    
    public static void Menu(){
        Scanner scanner= new Scanner(System.in);
        while(true){
        System.out.println("0. Thoat");
        System.out.println("1. Nhap");
        System.out.println("2. Xuat");
        System.out.println("3. Sap xep");
        System.out.println("4. Ngau nhien");
        System.out.println("5. Xoa");
        System.out.println("6.Gia trung binh");
        System.out.println(" ");
        System.out.print("Chon chuc nang: ");        
        int chon = scanner.nextInt();
        switch(chon){
            case 0:
                System.out.println("Thoat");
                System.exit(chon);               
            case 1:
                Nhap();
                break;
            case 2:
                Xuat();
                break;
            case 3:
                SapXep();
                Xuat();
                break;
            case 4:
                NgauNhien();
                Xuat();
                break;
            case 5:
                System.out.print("Ten can xoa: ");
                scanner.nextLine();
                Xoa(scanner.nextLine());
                Xuat();
                break;
            case 6:
                GiaTB();
                break;
            default:
                System.out.println("Ban chon chuc nang tu 0 - 6");
        }
    }       
}    
    
    public static void main(String[] args){ 
        ArrayList<SanPham> dsSanPham = new ArrayList<>();
        Menu();
    }
}
