/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi3;

/**
 *
 * @author Admin
 */
public class SinhVien {
    //Tạo đối tượng sinh viên: id, hoten, gioitinh, lophoc, trang thai
    private String id;
    private String hoten;
    private String gioitinh;
    private String lophoc;
    private String trangThai;

    public SinhVien() {
    }

    public SinhVien(String id, String hoten, String gioitinh, String lophoc, String trangThai) {
        this.id = id;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.lophoc = lophoc;
        this.trangThai = trangThai;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setLophoc(String lophoc) {
        this.lophoc = lophoc;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getLophoc() {
        return lophoc;
    }

    public String getTrangThai() {
        return trangThai;
    }
}
