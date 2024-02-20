package com.poly.py00023.truongminhtien.lab7;

public class SinhVienIT extends SinhVienPoly {
    private Double diemJava;
    private Double diemCss;
    private Double diemHtml;
    
    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public SinhVienIT(String hoTen, String nganh) {
        super(hoTen, nganh);
    }
    

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    
    public Double getDiem() {
        return (2 * this.diemJava + this.diemHtml + this.diemCss) / 4;
    }
}
