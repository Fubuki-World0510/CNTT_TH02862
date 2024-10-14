/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SinhVienService {
    ArrayList<SinhVien> sv = new ArrayList();
    
    public ArrayList<SinhVien> info() {
        return sv;
    }
    
    public SinhVienService() {
        sv.add(new SinhVien(1, "A", "Ha Noi", "Nam", "SD01"));
        sv.add(new SinhVien(2, "B", "Thanh Hoa", "Nu", "SD02"));
        sv.add(new SinhVien(3, "C", "Ha Noi", "Nu", "SD03"));
        sv.add(new SinhVien(4, "D", "Ha Noi", "Nam", "SD04"));
        sv.add(new SinhVien(5, "E", "Ha Noi", "Nam", "SD05"));
    }
    
    public String them(SinhVien list) {
        sv.add(list);
        return "Da them du lieu";
    }
    
    public String xoa(int index) {
        sv.remove(index);
        return "Da xoa du lieu";
    }
}
