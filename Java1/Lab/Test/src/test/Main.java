/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Foob
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DongHoService sv = new DongHoService();
        ArrayList<DongHo> data = new ArrayList<DongHo>();
        while (true) {
            int nhap = Integer.parseInt(sc.nextLine());

            switch (nhap) {
                case 1:
                    sv.thongTinNhap(data);
                    break;
                case 2:
                    sv.thongTinXuat(data);
                    break;
                case 3:
                    System.out.println("Nhap min va max");
                    int min = Integer.parseInt(sc.nextLine());
                    int max = Integer.parseInt(sc.nextLine());
                    sv.timThongTin(data, min, max);
                    break;
                case 0:
                    System.exit(0);
                default:
                    throw new AssertionError();
            }
        }
    }
}
