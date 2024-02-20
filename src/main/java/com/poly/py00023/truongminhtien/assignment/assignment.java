package com.poly.py00023.truongminhtien.assignment;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            do {
                System.out.print("                              CHỌN CHỨC NĂNG: ");
                choice = scanner.nextInt();
            } while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7 && choice != 8 && choice != 9);
            System.out.println("                              ============================================================");
            chucnang(choice);
            System.out.print("                              Nhập 1 để quay lại bảng MENU - Nhập số bất kì để thoát chương trình: ");
            int continueChoice = scanner.nextInt();
            System.out.println("                ============================================================================================");
            if (continueChoice != 1) {
                break;
            }
        } while (true);
        System.out.println("                              CHƯƠNG TRÌNH KẾT THÚC!");
    }
    private static void menu() {
        System.out.println("                                               *PHẦN MỀM QUẢN LÝ NHÂN SỰ*");
        System.out.println("                              +==========================================================+");
        System.out.println("                              | 1. Nhập danh sách nhân viên từ bàn phím                  |");
        System.out.println("                              | 2. Xuất danh sách nhân viên ra màn hình                  |");
        System.out.println("                              | 3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím    |");
        System.out.println("                              | 4. Xóa nhân viên theo mã nhập từ bàn phím                |");
        System.out.println("                              | 5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím |");
        System.out.println("                              | 6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím  |");
        System.out.println("                              | 7. Sắp xếp nhân viên theo họ và tên                      |");
        System.out.println("                              | 8. Sắp xếp nhân viên theo thu nhập                       |");
        System.out.println("                              | 9. Xuất 5 nhân viên có thu nhập cao nhất                 |");
        System.out.println("                              +==========================================================+");
    }
    private static void chucnang(int p){
        switch (p) {
            case 1:
                System.out.println("                              Nhập danh sách nhân viên từ bàn phím");
                NhanVien.nhapDanhSachNhanVien();
                System.out.println("                    =======================================================================================");
                break;
            case 2:
                System.out.println("                              Xuất danh sách nhân viên ra màn hình");
                NhanVien.xuatDanhSachNhanVien();
                System.out.println("                    =======================================================================================");
                break;
            case 3:
                System.out.println("                              Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
                NhanVien.timVaHienThiNhanVien();
                System.out.println("                    =======================================================================================");
                break;
            case 4:
                System.out.println("                              Xóa nhân viên theo mã nhập từ bàn phím");
                NhanVien.XoaNhanVien();
                System.out.println("                    =======================================================================================");
                break;
            case 5:
                System.out.println("                              Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
                NhanVien.CapNhatThongTinNV();
                System.out.println("                    =======================================================================================");
                break;
            case 6:
                System.out.println("                              Tìm các nhân viên theo khoảng lương nhập từ bàn phím");
                NhanVien.TimNhanVienTheoKhoanLuongTuBanPhim();
                System.out.println("                    =======================================================================================");
                break;
            case 7:
                System.out.println("                              Sắp xếp nhân viên theo họ và tên");
                NhanVien.sapXepTheoHoTenNV();
                System.out.println("                    =======================================================================================");
                break;
            case 8:
                System.out.println("                              Sắp xếp nhân viên theo thu nhập");
                NhanVien.sapXepTheoThuNhap();
                System.out.println("                    =======================================================================================");
                break;
            case 9:
                System.out.println("                              Xuất 5 nhân viên có thu nhập cao nhất");
                NhanVien.xuatTop5();
                System.out.println("                    =======================================================================================");
                break;
            case 10:
                break;
        }
    }
}
