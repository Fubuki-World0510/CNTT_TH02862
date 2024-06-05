/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803_th02862_namth_lab6;

/**
 *
 * @author Foob
 */
public class contruct {
    private String sv;
    private int sdt;
    private int cmnd;

    public contruct(String sv, int sdt, int cmnd) {
        this.sv = sv;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public String getSv() {
        return sv;
    }

    public int getSdt() {
        return sdt;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setSv(String sv) {
        this.sv = sv;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }
}
