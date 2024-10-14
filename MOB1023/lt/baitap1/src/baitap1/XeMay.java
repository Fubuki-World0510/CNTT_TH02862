/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

/**
 *
 * @author Admin
 */
public class XeMay {
    private int id;
    private String ten;
    private String chungLoai;
    private int dungTich;

    public XeMay() {
    }

    public XeMay(int id, String ten, String chungLoai, int dungTich) {
        this.id = id;
        this.ten = ten;
        this.chungLoai = chungLoai;
        this.dungTich = dungTich;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public int getId() {
        return id;
    }

    public String getChungLoai() {
        return chungLoai;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChungLoai(String chungLoai) {
        this.chungLoai = chungLoai;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
}
