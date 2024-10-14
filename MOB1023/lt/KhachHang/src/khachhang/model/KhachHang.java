/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khachhang.model;

/**
 *
 * @author nguyenvv
 */
public class KhachHang {

    private Integer id;

    private String hoTen;

    private String diaChi;

    private String gioiTinh;

    private Integer namSinh;

    public int tuoi() {
        return 2024 - namSinh;
    }

    public KhachHang(Integer id, String hoTen, String diaChi, String gioiTinh, Integer namSinh) {
        this.id = id;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public KhachHang() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return id + ", " + hoTen + ", " + diaChi + ", " + gioiTinh + ", " + namSinh;
    }
}
