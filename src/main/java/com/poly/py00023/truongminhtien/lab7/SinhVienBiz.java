package com.poly.py00023.truongminhtien.lab7;

public class SinhVienBiz extends SinhVienPoly{
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public Double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
