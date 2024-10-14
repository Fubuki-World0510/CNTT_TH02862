/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap1;

/**
 *
 * @author Admin
 */
public class SinhVien {

    private int id;
    private String ten;
    private String diaChi;
    private String gioiTinh;
    private String lop;

    public SinhVien(int id, String ten, String diaChi, String gioiTinh, String lop) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
    }

    public SinhVien() {
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getLop() {
        return lop;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen(String te) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
