/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idk;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDonService {
    ArrayList<HoaDon> hd = new ArrayList<>();
    
    public HoaDonService() {
        hd.add(new HoaDon(1, "PC cua toi", 2, 20.000f, true));
        hd.add(new HoaDon(2, "Iphone 16", 999, 2.000f, true));
        hd.add(new HoaDon(3, "SamSung s24 ultra", 1, 10.000f, true));
        hd.add(new HoaDon(4, "PC cua toi", 2, 20.000f, true));
        hd.add(new HoaDon(5, "PC cua toi", 2, 20.000f, true));
    }

    public ArrayList<HoaDon> InThongTin() {
        return hd;
    }
}
