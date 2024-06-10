/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th02862;
/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private String ma;
    private String hoTen;
    private double luong;
    public double getThueTN(){
        if (this.luong > 15000000) {
            return this.luong*0.12;
        }else{
            if (this.luong<9000000) {
                return 0;
            } else {
                return this.luong*0.1;
            }
        }
    }
    public double getThuNhap(){
        return this.luong - getThueTN();
    }
    public NhanVien(String ma, String hoTen, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public void xuatThongTin(){
        System.out.println("Ho ten: "+getHoTen());
        System.out.println("Ma: "+getMa());
        System.out.println("Luong: "+getLuong());
    }
}
