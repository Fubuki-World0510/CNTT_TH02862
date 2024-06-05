/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd1803_th02862_namth_ass1;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Services {

    /**
     * @param args the command line arguments
     */
    Scanner d = new Scanner(System.in);
    ArrayList<NhanVien> ob = new ArrayList<NhanVien>();
    public void menu() {
        StandardCharsets.UTF_8.name();
        Scanner data = new Scanner(System.in);
        int nhap;
        do {
            try {
                System.out.println("1. Nhap danh sach nhan vien tu ban phim\n"
                        + "2. Xuat danh sach nhan vien ra man hinh.\n"
                        + "3. Tim va hien thi nhan vien theo ma nhap tu ban phim\n"
                        + "4. Xoa nhan vien theo ma nhap tu ban phim\n"
                        + "5. Cap nhat thong tin theo ma nhan vien nhap tu ban phim\n"
                        + "6. Tim cac nhan vien theo khoang luong nhap tu ban phim\n"
                        + "7. Sap xep nhan vien theo ho ten\n"
                        + "8. Sap xep nhan vien theo thu nhap\n"
                        + "9. Xuat 5 nhan vien co thu nhap cao nhat\n"
                        + "0. Thoat");
                System.out.print("Chon chuc nang: ");
                nhap = Integer.parseInt(data.nextLine());

                switch (nhap) {
                    case 0:
                        break;
                    case 1:
                        c1();
                        break;
                    case 2:
                        c2();
                        break;
                    case 3:
                        c3();
                        break;
                    case 4:
                        c4();
                        break;
                    case 5:
                        c5();
                        break;
                    case 6:
                        c6();
                        break;
                    case 7:
                        c7();
                        break;
                    case 8:
                        c8();
                        break;
                    case 9:
                        c9();
                        break;
                    default:
                        System.out.print("Chức năng không tồn tại");
                }
            } catch (Exception e) {
                System.out.print("Bạn đang không nhập số nguyên");
            }
        } while (true);
    }

    public void c1() {
        while(true) {
            System.out.println("Nhap ten: ");
            String ten = d.nextLine();
            System.out.println("Nhap ma: ");
            String ma = d.nextLine();
            System.out.println("Nhap luong: ");
            double luong = Double.parseDouble(d.nextLine());
            ob.add(new NhanVien(ma, ten, luong));
            System.out.println("Nhap tiep? (Y/N) ");
            if (d.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void c2() {
        for(NhanVien ten : ob) {
            ten.xuatThongTin();
        }
    }

    public void c3() {
        System.out.println("Nhap ma nv: ");
        String manv = d.nextLine();
        for(NhanVien dc : ob) {
            if(manv.equals(dc.getMaNV())) {
                System.out.println("Da tim thay nhan vien " + dc.getMaNV());
            } else {
                System.out.println("Eo thay ??");
                break;
            }
        }
    }

    public void c4() {

    }

    public void c5() {

    }

    public void c6() {

    }

    public void c7() {

    }

    public void c8() {

    }

    public void c9() {

    }
}
