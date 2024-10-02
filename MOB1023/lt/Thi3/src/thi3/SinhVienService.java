/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi3;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SinhVienService {

    ArrayList<SinhVien> sv = new ArrayList<SinhVien>();

    public ArrayList<SinhVien> getInfo() {
        return sv;
    }

    public void addMore(SinhVien list) {
        sv.add(list);
    }
    
    public SinhVienService() {
        sv.add(new SinhVien("TH1", "Nguyen Van A", "Nam", "SD10", "OK"));
        sv.add(new SinhVien("TH2", "Nguyen Van B", "Nam", "SD11", "OK"));
        sv.add(new SinhVien("TH3", "Nguyen Van C", "Nam", "SD12", "OK"));
        sv.add(new SinhVien("TH4", "Nguyen Van D", "Nam", "SD13", "OK"));
        sv.add(new SinhVien("TH5", "Nguyen Van E", "Nam", "SD14", "OK"));
        
    }
}
