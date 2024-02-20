package com.poly.py00023.truongminhtien.lab4;

import java.util.Scanner;
public class SanPham {
    private String tenSP;
    private Double donGia;
    private Double giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(Double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;

    }

    private double getThueNapKhau() {
        return donGia * 0.1;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên sản phẩm: ");
        tenSP = scanner.nextLine();
        System.out.print("Nhập vào đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập vào giảm giá: ");
        giamGia = scanner.nextDouble();
    }

    public void Xuat() {
        System.out.println("Tên sản phẩm: "+ tenSP);
        System.out.println("Đơn giá: "+ donGia + "VND");
        System.out.println("Giảm giá: "+ giamGia + "VND");
        System.out.println("Thuế nhập khẩu: "+ getThueNapKhau() + "VND");
    }

    public SanPham() {
    }
}
