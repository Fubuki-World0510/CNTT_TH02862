/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author Foob
 */
public class DongHo {
    private String maDongHo;
    private String theLoai;
    private String mauSac;
    private int kickThuoc;
    private String chatLieu;
    private int gia;

    public DongHo() {
        
    }
    public DongHo(String maDongHo, String theLoai, String mauSac, int kickThuoc, String chatLieu, int gia) {
        this.maDongHo = maDongHo;
        this.theLoai = theLoai;
        this.mauSac = mauSac;
        this.kickThuoc = kickThuoc;
        this.chatLieu = chatLieu;
        this.gia = gia;
    }

    public String getMaDongHo() {
        return maDongHo;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getMauSac() {
        return mauSac;
    }

    public int getKickThuoc() {
        return kickThuoc;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public int getGia() {
        return gia;
    }

    public void setMaDongHo(String maDongHo) {
        this.maDongHo = maDongHo;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public void setKickThuoc(int kickThuoc) {
        this.kickThuoc = kickThuoc;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    public void inThongTin() {
        System.out.println("Ma" + maDongHo);
        System.out.println("The loai" + theLoai);
        System.out.println("Mau sac" + mauSac);
        System.out.println("Gia" + gia);
        System.out.println("Chat lieu" + chatLieu);
        System.out.println("Kich thuoc" + kickThuoc);
    }
}
