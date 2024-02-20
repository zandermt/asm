package com.poly.py00023.truongminhtien.lab7;

abstract public class SinhVienPoly {
    private String hoTen, nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    
     abstract public Double getDiem();
     
    

    public String getHocLuc() {
        if (this.getDiem() < 5) 
            return "Yeu";
        else if (this.getDiem() < 6.5) 
            return "Trung binh";
         else if (this.getDiem() < 7.5) 
            return "Kha";
         else if (this.getDiem()< 9) 
            return "Gioi";
         else 
            return "Xuat sac";
        
    }
    

    public void xuat() {
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Nganh: " + this.nganh);
        System.out.println("Diem: " + this.getDiem());
        System.out.println("Hoc luc: " + this.getHocLuc());
    }

}
