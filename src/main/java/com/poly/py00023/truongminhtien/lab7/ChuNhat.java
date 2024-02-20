package com.poly.py00023.truongminhtien.lab7;

import java.util.Scanner;

public class ChuNhat {
    Scanner scanner = new Scanner (System.in);
       public double Chieudai;
       public double Chieurong;
       public ChuNhat(){
       }
       public Double Chuvi(){
           return (this.Chieudai+this.Chieurong)*2;
        }
       public Double Dientich(){
           return this.Chieudai*this.Chieurong;
       }
       public void nhap(){
           System.out.print("Nhập vào chiều dài: ");
           this.Chieudai = scanner.nextDouble();
           System.out.print("\n Nhập vào chiều rộng: ");
           this.Chieurong = scanner.nextDouble();
       }
       public void xuat(){
           System.out.println("Chiều dài của hình chữ nhật là: "+ this.Chieudai);
           System.out.println("Chiều rộng của hình chữ nhật là: "+ this.Chieurong);
           System.out.println("Vậy chu vi của hình chữ nhật là: "+ this.Chuvi());
           System.out.println("Vậy diện tích của hình chữ nhật là: "+ this.Dientich());
       }
}
