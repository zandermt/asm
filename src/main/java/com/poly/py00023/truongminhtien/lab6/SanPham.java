package com.poly.py00023.truongminhtien.lab6;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private String Hang;

    public String gettenSp(){
        return tenSp;
    }

    public void settenSp(){
        this.tenSp = tenSp;
    }

    public double getdonGia(){
        return donGia;
    }
    
    public void setdonGia(){
        this.donGia = donGia;
    }

    public String getHang(){
        return Hang;
    }

    public void setHang(){
        this.Hang = Hang;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("\n Nhập vào đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("\n Nhập vào hãng: ");
        Hang = new Scanner(System.in).nextLine();
    }

    public void xuat(){
        System.out.println("-----------------------------------");
        System.out.println("Tên sảm phẩm: "+ tenSp);
        System.out.println("Đơn giá: "+ donGia);
        System.out.println("Hãng: "+ Hang);
        System.out.println("-----------------------------------");
        
    }

}
