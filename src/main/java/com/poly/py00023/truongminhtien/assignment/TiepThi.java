package com.poly.py00023.truongminhtien.assignment;

public class TiepThi extends NhanVien {
    private Double doanhSo;
    private Double hoaHong;

    public TiepThi() {
    }

    public TiepThi(Double doanhSo, Double hoaHong) {
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi(String maNhanVien, String hoTen, Double luong, Double doanhSo, Double hoaHong) {
        super(maNhanVien, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public Double getThuNhap() {
        return super.getLuong() + this.doanhSo * this.hoaHong;
    }

    public void xuat() {
        System.out.println("Ma NV" + this.getMaNhanVien());
        System.out.println("Ho Ten" + this.getHoTen());
        System.out.println("Thu nhap" + this.getThuNhap());
        System.out.println("Thue thu nhap" + this.getThueThuNhap());
        System.out.println("Luong" + this.getLuong());
    }
}
