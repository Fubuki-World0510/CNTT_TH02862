/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thi;

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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        KhachHangService kh = new KhachHangService();
        do {
            System.out.println("1. Hien thi 5 khach hang\n2. Nhap moi 1 khach hang\n3. Tim va xoa khach hang theo ma\n0. Thoat chuong trinh\n\nLua chon cua ban [1-3]:");
            choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    kh.Hien();
                case 2 ->
                    kh.Them();
                case 3 ->
                    kh.Xoa();
                default ->
                    System.out.print("Ban dang nhap sai options");
            }
        } while (choice != 0);
    }
}
