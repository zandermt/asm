package com.poly.py00023.truongminhtien.lab6;

import java.util.Scanner;

public class SinhVien {
    private String hoTen, email, phone, cmnd;
    
    public SinhVien(){

    }

    public SinhVien(String hoTen, String email, String phone, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.phone = phone;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    
    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhap ho ten: ");
            hoTen = scanner.nextLine();
            if(hoTen == null | hoTen.equals("")){
                System.out.println("Ho ten khong hop le!");
            }else{
                break;
            }
        }while(true);
        
        Thongtin ds = new Thongtin();
        do{
            System.out.print("Nhap email: ");
            email = scanner.nextLine();
            if(ds.isEmail(email)){
                break;
            }
            System.out.println("Eamil khong hop le!");
        }while(true);
        
        do{
            System.out.print("Nhap so dien thoai: ");
            phone = scanner.nextLine();
            if(ds.isPhone(phone)){
                break;
            }
            System.out.println("SDT khong hop le!");
        }while(true);
        
        do{
            System.out.print("Nhap so CMND: ");
            cmnd = scanner.nextLine();
            if(ds.isCMND(cmnd)){
                break;
            }
            System.out.println("CMND khong hop le!");
        }while(true);
    }
    
    public void Xuat(){
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Email: "+ this.email);
        System.out.println("SDT: "+this.phone);
        System.out.println("CMND: "+this.cmnd);
    }
}
