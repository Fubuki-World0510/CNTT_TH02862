/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803_th02862_namth_ass1;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luong;

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public double getThuNhap() {
        return 0;
    }
    public double getThue() {
        return 0;
    }
    public void xuatThongTin() {
        System.out.println("Ma nhan vien: " + this.maNV);
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Luong: " + this.luong);
        System.out.println("Thu nhap: " + getThuNhap());
        System.out.println("Thue: " + getThue());
    }
}
