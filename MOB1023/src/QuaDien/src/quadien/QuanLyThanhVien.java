/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change a license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit a template
 */
package quadien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLyThanhVien {

    ArrayList<ThanhVien> tvs = new ArrayList<ThanhVien>();

    public void Them() {
        Scanner sc = new Scanner(System.in);
        String nhap, coso, ten;
        int tuoi, ma;
        float superchat;
        do {
            System.out.println("Ma: ");
            ma = sc.nextInt();
            sc.nextLine();

            System.out.println("Ten: ");
            ten = sc.nextLine();

            System.out.println("Tuoi: ");
            tuoi = sc.nextInt();

            System.out.println("Super chat: ");
            superchat = sc.nextInt();
            sc.nextLine();

            System.out.println("Co so: ");
            coso = sc.nextLine();

            tvs.add(new ThanhVien(ten, tuoi, superchat, coso, ma));
            System.out.println("Muon nhap tiep khong?");
            nhap = sc.nextLine();
        } while (nhap.equals("Y"));
    }

    public void Hien() {
        if (tvs.isEmpty()) {
            System.out.println("Ko co data");
        } else {
            for (ThanhVien a : tvs) {
                a.inThongTin();
            }
        }
    }
}
