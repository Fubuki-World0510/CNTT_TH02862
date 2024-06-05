/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803_th02862_namthth_lab5;

/**
 *
 * @author Foob
 */
public class SanPhan {
   private double gia;
   private String tenSP;

    public SanPhan(double gia, String tenSP) {
        this.gia = gia;
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
}
