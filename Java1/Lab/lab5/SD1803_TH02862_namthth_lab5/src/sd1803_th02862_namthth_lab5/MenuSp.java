/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803_th02862_namthth_lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Foob
 */
public class MenuSp {

    ArrayList<SanPhan> ob = new ArrayList<SanPhan>();
    Scanner data = new Scanner(System.in);

    public void nhap() {
        while (true) {
            System.out.println("Nhap ten san pham: ");
            String ten = data.nextLine();
            System.out.println("Nhap gia san pham: ");
            double gia = data.nextDouble();
            ob.add(new SanPhan(gia, ten));
            System.out.print("Tiep tuc nhap ? (Y/N)");
            if (data.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void TimXoa() {
        System.out.print("Nhập tên: ");
        String nhap2 = data.nextLine();
        for (SanPhan x : ob) {
            if (x.getTenSP().equals(nhap2)) {
                ob.remove(x);
                System.out.print("Da xoa");
                break;
            }
        }
    }

    public void Sort() {
        Comparator<SanPhan> dt = new Comparator<SanPhan>() {
            @Override
            public int compare(SanPhan o1, SanPhan o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(ob, dt);
        for (SanPhan spp : ob) {
            System.out.print(spp.getGia());
        }
    }
}
