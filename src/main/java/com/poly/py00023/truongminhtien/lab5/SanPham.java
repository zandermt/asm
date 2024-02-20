package com.poly.py00023.truongminhtien.lab5;

import java.util.Scanner;

public class SanPham {
    String tenSP;
    Double giaSP;
       
    public SanPham(){
    };

    public SanPham(String tenSP, double giaSP) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
    }
    
    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten san pham: ");
        this.tenSP = scanner.nextLine();
        System.out.print("Gia san pham: ");
        this.giaSP = scanner.nextDouble();
    }
    
    public void Xuat(){
        System.out.println(this.toString());
    }

    public String toString() {
        return "SanPham{" + "tenSP=" + tenSP + ", giaSP=" + giaSP + '}';
    }   
}
