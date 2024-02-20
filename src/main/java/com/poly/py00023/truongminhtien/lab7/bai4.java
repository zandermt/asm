package com.poly.py00023.truongminhtien.lab7;

import java.util.ArrayList;

public class bai4 {
    public static void main(String[] args){
        
        ArrayList<SinhVienPoly> dssv = new ArrayList<SinhVienPoly>();
        SinhVienPoly sv1 = new SinhVienIT("Tiến","IT",10,10,10); 
        dssv.add(sv1);
        SinhVienPoly sv2 = new SinhVienIT("Kha","IT",7,8,10);
        dssv.add(sv2);
        SinhVienPoly sv3 = new SinhVienIT("Nam","IT",8,9,10);
        dssv.add(sv3);
        SinhVienPoly sv4 = new SinhVienBiz("Hạ","Marketing",10,10);
        dssv.add(sv4);
        SinhVienPoly sv5 = new SinhVienIT("Dareu","IT",10,8,7);
        dssv.add(sv5);
        
        for ( SinhVienPoly sv  : dssv){
           sv.xuat();
       }
    }
}
