package com.poly.py00023.truongminhtien.lab6;

import java.util.ArrayList;

public class bai2 {
    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }

        for (SanPham sp : list) {
            if (sp.getHang().equalsIgnoreCase("nokia")){
                sp.xuat();
                System.out.println();     
            }
        }
    }
}
