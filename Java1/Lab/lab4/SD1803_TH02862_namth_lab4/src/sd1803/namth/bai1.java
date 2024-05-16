/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803.namth;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai1 {
    public String tenSp;
    public double donGia;
    public double giamGia;
    public double getThueNhapKhau;
    
    public void nhap() {
        Scanner d = new Scanner(System.in);
        
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = d.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.donGia = d.nextDouble();
        System.out.print("Nhập giảm giá: ");
        this.giamGia = d.nextDouble();
        this.getThueNhapKhau = this.donGia * (10/100);
    }
    
    public void xuat() {
        System.out.println("Tên sản phẩm: " + this.tenSp);
        System.out.println("Đơn giá: " + this.donGia);
        System.out.println("Giảm giá: " + this.giamGia);
        System.out.println("Thuế: " + this.getThueNhapKhau);
        
    }
}
