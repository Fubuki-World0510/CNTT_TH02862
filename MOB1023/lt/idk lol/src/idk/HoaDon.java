/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idk;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private int id;
    private String sanpham;
    private int soLuong;
    private float giaBan;
    private Boolean trangThai;

    public HoaDon(int id, String sanpham, int soLuong, float giaBan, Boolean trangThai) {
        this.id = id;
        this.sanpham = sanpham;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
    }

    public HoaDon() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSanpham(String sanpham) {
        this.sanpham = sanpham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public String getSanpham() {
        return sanpham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }
}
