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
 * @author Administrator
 */
public class Bai3 {

    public static void main(String[] args) {
        int nhap;
        MenuSp cc = new MenuSp();
        String nhap2;
        ArrayList ob = new ArrayList();
        ArrayList gia = new ArrayList();
        Scanner data = new Scanner(System.in);
        while (true) {
            System.out.println("1. Nhap danh sach san pham\n"
                    + "2. Sap xep giam dan theo gia va sap xep\n"
                    + "3. Xuat gia trung binh san pham"
                    + "4. Tim va xoa san pham nhap tu ban phim\n"
                    + "0. Ket thuc");
            nhap = Integer.parseInt(data.nextLine());

            switch (nhap) {
                case 1:
                    cc.nhap();
                    break;
                case 2:
                    cc.Sort();
                    break;
                case 3:
                    cc //??
                    break;
                case 4:
                    cc.TimXoa();
                    break;
            }
        }
    }
}
