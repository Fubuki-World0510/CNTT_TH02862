/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanviendz;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private String ten;
    private Integer tuoi;
    private String gioitinh;
    private String diachi;

    public NhanVien(String diachi, String gioitinh, String ten, Integer tuoi) {
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public NhanVien() {
    }

    public String getTen() {
        return ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void inThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioitinh);
        System.out.println("Dia chi: " + diachi);
    }

    @Override
    public String toString() {
        return "Ten nhan vien: " + ten + ", Địa chỉ: " + diachi + ", Giới tính: " + gioitinh;
    }
}
