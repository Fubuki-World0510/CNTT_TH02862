/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhanviendz;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon;
        NhanVienService a = new NhanVienService();
        do {
            System.out.println("1. Them nhan vien\n2. Sua nhan vien\n3. Xoa nhan vien\n4. Tim nhan vien co so tuoi cao nhat\n5. Tim nhan vien co gioi tinh nu\n6. Hien tat ca nhan vien\n0. Thoat\n\nMoi ban nhap lua chon [1-6]: ");
            luachon = sc.nextInt();

            switch (luachon) {
                case 1:
                    a.Them();
                    break;
                case 2:
                    a.Sua();
                    break;
                case 3:
                    a.Xoa();
                    break;
                case 4:
                    a.TimTuoiCaoNhat();
                    break;
                case 5:
                    a.TimNhanVienNu();
                    break;
                case 6:
                    a.Hien();
                    break;
                default:
                    throw new AssertionError();
            }

        } while (luachon != 0);
    }
}
