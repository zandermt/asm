package com.poly.py00023.truongminhtien.assignment;

public abstract class TruongPhong extends NhanVien{
    private Double TrachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(Double TrachNhiem) {
        this.TrachNhiem = TrachNhiem;
    }

    public TruongPhong( String manv, String hoTen, Double luong,Double TrachNhiem) {
        super(manv, hoTen, luong);
        this.TrachNhiem = TrachNhiem;
    }
    
     public Double getThuNhap(){
         return super.getLuong() + this.TrachNhiem;
     }
    
    public void xuat(){
        super.xuat();
        System.out.println("Trach nhiem: " + this.TrachNhiem);
    }
}
