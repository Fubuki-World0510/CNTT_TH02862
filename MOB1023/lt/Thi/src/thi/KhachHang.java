/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi;

/**
 *
 * @author Admin
 */
public class KhachHang {

    //id, ho ten, sđt(String), giới tính, năm sinh
    private int id, namsinh;
    private String hoten, sdt, gioitinh, diachi;

    public KhachHang(String gioitinh, String hoten, int id, int namsinh, String sdt, String diachi) {
        this.gioitinh = gioitinh;
        this.hoten = hoten;
        this.id = id;
        this.namsinh = namsinh;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public KhachHang() {
    }

    public int getId() {
        return id;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getHoten() {
        return hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void inThongTin() {
        System.out.println("[Thong tin khach hang] => " + this.getId());
        System.out.println("ID: " + this.getId());
        System.out.println("Ten: " + this.getHoten());
        System.out.println("Nam sinh: " + this.getNamsinh());
        System.out.println("Gioi tinh: " + this.getGioitinh());
        System.out.println("Sdt: " + this.getSdt());
        System.out.println("-----[END]-----\n");
    }
}
