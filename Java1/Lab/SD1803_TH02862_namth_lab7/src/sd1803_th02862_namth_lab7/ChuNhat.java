/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803_th02862_namth_lab7;

/**
 *
 * @author Foob
 */
public class ChuNhat {
    private double rong;
    private double dai;
    private double chuVi;
    private double dienTich;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
        this.chuVi = chuVi;
        this.dienTich = dienTich;
    }

    public double getRong() {
        return rong;
    }

    public double getDai() {
        return dai;
    }

    public double getChuVi() {
        return chuVi;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public void setChuVi(double chuVi) {
        this.chuVi = chuVi;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    
    public void xuat() {
        System.out.println("Dai: " + this.dai);
        System.out.println("Rong: " + this.rong);
        System.out.println("Chu vi" + getChuVi());
        System.out.println("Dien tich" + getDienTich());
    }
}