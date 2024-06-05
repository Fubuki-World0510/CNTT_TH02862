/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Foob
 */
public class DongHoService {

    public void thongTinNhap(ArrayList<DongHo>lists) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap ma dong ho");
        String maDongHo = sc.nextLine();
        System.out.println("nhap the loai");
        String theLoai = sc.nextLine();
        System.out.println("nhap mau sac");
        String mauSac = sc.nextLine();
        System.out.println("nhap kich thuoc");
        int kichThuoc = Integer.valueOf(sc.nextLine());
        System.out.println("nhap chat lieu");
        String chatLieu = sc.nextLine();
        System.out.println("nhap gia");
        int gia = Integer.valueOf(sc.nextLine());
        
        DongHo dh = new DongHo(maDongHo, theLoai, mauSac, kichThuoc, chatLieu, gia);
        lists.add(dh);
    }
    public void thongTinXuat(ArrayList<DongHo> lists) {
        for(DongHo h : lists) {
            h.inThongTin();
        }
    }
    public void timThongTin(ArrayList<DongHo> lists, int min, int max) {
        for(DongHo h : lists) {
            if(h.getGia() >= min && h.getGia() <= max ) {
                h.inThongTin();
            }
        }
    }
}
