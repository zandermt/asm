package com.poly.py00023.truongminhtien.lab6;

import java.util.ArrayList;

public class dsSinhVien {
    private ArrayList<SinhVien> ListSV = new ArrayList<>();
    
    public void Nhap(){
        for(int i = 0; i < 5; i++){
            SinhVien sv = new SinhVien();
            sv.Nhap();
            ListSV.add(sv);
            System.out.println("");
        }
    }
    
    public void Xuat(){
        System.out.println("--------");
        System.out.println("Danh Sach sinh vien");
        for(SinhVien item: ListSV){
            item.Xuat();
            System.out.println("");
        }
    }
}
