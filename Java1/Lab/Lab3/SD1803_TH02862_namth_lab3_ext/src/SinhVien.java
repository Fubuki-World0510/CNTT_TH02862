/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class SinhVien {
    private String tenSV;
    private int tuoiSV;
    private double diemTB;
    
    public void setTen(String name) {
        this.tenSV = name;
    }
    public void setTuoi(int tuoi) {
        this.tuoiSV = tuoi;
    }
    public void setDiem(double diem) {
        this.diemTB = diem;
    }
    
    public String getTen() {
        return tenSV;
    }
    public int getTuoi() {
        return tuoiSV;
    }
    public double getDiem() {
        return diemTB;
    }
    
}
