/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadien;

/**
 *
 * @author Admin
 */
public class ThanhVien {
    private String TenThanhVien;
    private Integer tuoi;
    private Float SuperChat;
    private String Coso;
    private Integer MathanhVien;

    public ThanhVien(String TenThanhVien, Integer tuoi, Float SuperChat, String Coso, Integer MathanhVien) {
        this.TenThanhVien = TenThanhVien;
        this.tuoi = tuoi;
        this.SuperChat = SuperChat;
        this.Coso = Coso;
        this.MathanhVien = MathanhVien;
    }

    public String getTenThanhVien() {
        return TenThanhVien;
    }

    public void setTenThanhVien(String TenThanhVien) {
        this.TenThanhVien = TenThanhVien;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Float getSuperChat() {
        return SuperChat;
    }

    public void setSuperChat(Float SuperChat) {
        this.SuperChat = SuperChat;
    }

    public String getCoso() {
        return Coso;
    }

    public void setCoso(String Coso) {
        this.Coso = Coso;
    }

    public Integer getMathanhVien() {
        return MathanhVien;
    }

    public void setMathanhVien(Integer MathanhVien) {
        this.MathanhVien = MathanhVien;
    }

    public void inThongTin() {
        System.out.println("Ma: " + this.getMathanhVien());
        System.out.println("Ten: " + this.getTenThanhVien());
        System.out.println("Tuoi: " + this.getTuoi());
        System.out.println("Co so: " + this.getCoso());
        System.out.println("Super chat" + this.getSuperChat());
    }
}
