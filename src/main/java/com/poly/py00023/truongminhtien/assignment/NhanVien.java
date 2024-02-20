package com.poly.py00023.truongminhtien.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NhanVien {
    static ArrayList<NhanVien> danhSach = new ArrayList<>();
    String maNhanVien;
    String hoTen;
    Double luong;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoTen, Double luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    Double getThuNhap() {
        return this.luong;
    }

    Double getThueThuNhap() {
        if (this.getThuNhap() < 9000000)
            return 0.0;
        else if (this.getThuNhap() <= 15000000)
            return (this.getThuNhap() - 9000000) * 0.1;
        else
            return (this.getThuNhap() - 9000000) * 0.12;
    }

    public void xuat() {
        System.out.println("                              Ten ma nhan vien: " + this.maNhanVien);
        System.out.println("                              Ho va ten: " + this.hoTen);
        System.out.println("                              Luong: " + this.luong);
        System.out.println("                              Thu nhap: " + this.getThuNhap());
        System.out.println("                              Thue thu nhap: " + this.getThueThuNhap());
    }

    public static void nhapDanhSachNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("                              Nhap so luong nhan vien: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("                              Nhap thong tin nhan vien thu " + (i + 1) + ":");
            System.out.print("                              Ma NV: ");
            String maNV = scanner.nextLine();
            System.out.print("                              Ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("                              Luong: ");
            double luong = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("                              Chon loai nhan vien (1. Nhan vien hanh chinh, 2. Tiep thi, 3. Truong phong): ");
            int loaiNV = scanner.nextInt();
            scanner.nextLine();

            switch (loaiNV) {
                case 1:
                    danhSach.add(new NhanVien(maNV, hoTen, luong));
                    break;
                case 2:
                    System.out.print("                              Doanh so: ");
                    double doanhSo = scanner.nextDouble();
                    System.out.print("                              Hoa hong: ");
                    double hoaHong = scanner.nextDouble();
                    danhSach.add(new TiepThi(maNV, hoTen, luong, doanhSo, hoaHong));
                    break;
                case 3:
                    System.out.print("                              Trach nhiem: ");
                    double trachNhiem = scanner.nextDouble();
                    danhSach.add(new TruongPhong(maNV, hoTen, luong, trachNhiem) {});
                    break;
                default:
                    System.out.println("                              Lua chon loai nhan vien khong hop le");
            }
        }
    }

    public static void xuatDanhSachNhanVien() {
        for (NhanVien nv : danhSach) {
            nv.xuat();
        }
    }
    
    public static void timVaHienThiNhanVien() {
        Scanner scanner = new Scanner(System.in);
        String maNhanVien;
        System.out.print("                              Nhập vào mã nhân viên bạn muốn tìm kiếm: ");
        maNhanVien = scanner.nextLine();
        for (NhanVien nv : danhSach) {
            if (nv.getMaNhanVien().equalsIgnoreCase(maNhanVien)) {
                nv.xuat();
                return;
            }
        }System.out.println("Không tìm thấy nhân viên có mã " + maNhanVien);
       
    }
     public static void XoaNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("                              Nhập mã nhân viên cần xoá: ");
        String maNhanVien = scanner.nextLine();
        boolean check = false;
        for (NhanVien nv : danhSach) {
            if (maNhanVien.equalsIgnoreCase(maNhanVien)){
                danhSach.remove(nv);
                check = true;
                break;
            }
        }
        if (check == false){
            System.out.println("                              Mã nhân viên bạn nhập vào không tồn tại!");
        } else {
            System.out.println("                              Nhân viên đã bị xoá!");
        }
    }

    public static void CapNhatThongTinNV() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên bạn muốn cập nhật: ");
        String maNhanVien = scanner.nextLine();
        NhanVien found = null;
            for (NhanVien nv : danhSach) {
                if(maNhanVien.equalsIgnoreCase(maNhanVien)){
                    found = nv;
                    break;
                }
            }
        if (found != null){
            System.out.print("Ma NV: ");
            String maNV = scanner.nextLine();
            if (maNV.equals("") || maNV == null) {
                maNV = found.getMaNhanVien();
            }
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();
            if (hoTen.equals("") || hoTen == null) {
                hoTen = found.getHoTen();
            }
            System.out.print("Luong: ");
            String luong = scanner.nextLine();
            if (luong.equals("") || luong == null) {
                luong = String.valueOf(found.getLuong());
            }
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Nhân viên không tồn tại");
        }    
        }
    
    public static void TimNhanVienTheoKhoanLuongTuBanPhim() {
        Scanner scanner = new Scanner(System.in);
        double mi;
        double ma;
        System.out.print("                              Moi nhap luong thap nhat: ");
        mi = scanner.nextDouble();
        System.out.print("                              Moi nhap luong cao nhat: ");
        ma = scanner.nextDouble();
        for(NhanVien a:danhSach){
            if(a.getLuong()>= mi && a.getLuong()<=ma){
                a.xuat();
                
            }
        }
    }

    public static void sapXepTheoHoTenNV() {
    Comparator<NhanVien> comp = new Comparator<NhanVien>() {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return o1.hoTen.compareTo(o2.hoTen);
        }
    };
    Collections.sort(danhSach, comp);
    for (NhanVien nhaVien : danhSach) {
    nhaVien.xuat();
        }
    }
    
    public static void sapXepTheoThuNhap() {
    Comparator<NhanVien> comp = new Comparator<NhanVien>() {
        @Override
        public int compare(NhanVien a1, NhanVien a2) {
            return Double.compare(a1.getThuNhap(), a2.getThuNhap());
        }
    };
    Collections.sort(danhSach, comp);
    for (NhanVien nhaVien : danhSach) {
        nhaVien.xuat();
        }
    }

    public static void xuatTop5() {
    Collections.sort(danhSach, (a, b) -> (int) (b.getThuNhap() - a.getThuNhap()));
    for (int i = 0; i < 5; i++) {
    danhSach.get(i).xuat();
        }
    }
}
