package com.poly.py00023.truongminhtien.lab3;

import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số sinh viên: ");
        int i = scanner.nextInt();
        String tensv[] = new String[i];
        Double diemsv[] = new Double[i];
        for (int n = 0; n < i; n++) {
            System.out.printf("Nhập vào tên sinh viên thứ %d: ", n + 1);
            tensv[n] = scanner.next();
            System.out.printf("Nhập vào điểm sinh viên thứ %d: ", n + 1);
            diemsv[n] = scanner.nextDouble();
        }
        for (int m = 0; m < i - 1; m++) {
            for (int n = 0; n < i - m - 1; n++) {
                if (diemsv[n] > diemsv[n + 1]) {
                    String tempTenSV = tensv[n];
                    tensv[n] = tensv[n + 1];
                    tensv[n + 1] = tempTenSV;
                    Double tempDiemSV = diemsv[n];
                    diemsv[n] = diemsv[n + 1];
                    diemsv[n + 1] = tempDiemSV;
                }
            }
        }
        System.out.println("==============================================================");
        for (int n = 0; n < i; n++) {
            if (diemsv[n] < 5) {
                System.out.println("Sinh viên " + (n + 1) + ": " + tensv[n] + " - Điểm: " + diemsv[n] + " - Học lực: Yếu");
            } else if ((diemsv[n] >= 5) && (diemsv[n] <= 6.5)) {
                System.out.println("Sinh viên " + (n + 1) + ": " + tensv[n] + " - Điểm: " + diemsv[n] + " - Học lực: Trung bình");
            } else if ((diemsv[n] >= 6.5) && (diemsv[n] < 7.5)) {
                System.out.println("Sinh viên " + (n + 1) + ": " + tensv[n] + " - Điểm: " + diemsv[n] + " - Học lực: Khá");
            } else if ((diemsv[n] >= 7.5) && (diemsv[n] < 9)) {
                System.out.println("Sinh viên " + (n + 1) + ": " + tensv[n] + " - Điểm: " + diemsv[n] + " - Học lực: Giỏi");
            } else if (diemsv[n] >= 9) {
                System.out.println("Sinh viên " + (n + 1) + ": " + tensv[n] + " - Điểm: " + diemsv[n] + " - Học lực: Xuất sắc");
            }
        }
    }
}

