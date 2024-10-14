/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testnow;

/**
 *
 * @author Admin
 */
public class MayTinh {
    private int id;
    private String hang, cpu, gpu;
    private double gia;

    public MayTinh() {
    }

    public MayTinh(int id, String hang, String cpu, String gpu, double gia) {
        this.id = id;
        this.hang = hang;
        this.cpu = cpu;
        this.gpu = gpu;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public String getHang() {
        return hang;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public double getGia() {
        return gia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
}
