/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhachHangService {

    ArrayList<KhachHang> kh = new ArrayList<KhachHang>();
    
    public KhachHangService(){
        kh.add(new KhachHang("Nam", "Nam", 1, 1997, "0909090909", "Ha Noi"));
        kh.add(new KhachHang("Nam", "Nam", 1, 1997, "0909090909", "Ha Noi"));
        kh.add(new KhachHang("Nam", "Nam", 1, 1997, "0909090909", "Ha Noi"));
        kh.add(new KhachHang("Nam", "Nam", 1, 1997, "0909090909", "Ha Noi"));
        kh.add(new KhachHang("Nam", "Nam", 1, 1997, "0909090909", "Ha Noi"));
        
    }
    public ArrayList<KhachHang> getDanhSach(){
        return kh;
    }
    
    public void Hien() {
        if (kh.isEmpty()) {
            System.out.println("Khong co du lieu");
        } else {
            for (KhachHang a : kh) {
                a.inThongTin();
            }
        }
    }

    public void Them() {
        Scanner a = new Scanner(System.in);
        String ask = "N";
        String ten, sdt, gioitinh, diachi;
        int id, namsinh;
        Boolean check;
        do {
            System.out.println("Nhap id: ");
            id = a.nextInt();
            a.nextLine();

            System.out.println("Nhap ten: ");
            ten = a.nextLine();

            System.out.println("Nhap nam sinh: ");
            namsinh = a.nextInt();
            a.nextLine();

            System.out.println("Nhap sdt: ");
            sdt = a.nextLine();

            System.out.println("Nhap gioi tinh: ");
            gioitinh = a.nextLine();
            
            System.out.println("Nhap gioi tinh: ");
            diachi = a.nextLine();

            kh.add(new KhachHang(gioitinh, ten, id, namsinh, sdt, diachi));

            System.out.println("Muon nhap tiep khong?");
            ask = a.nextLine();
        } while (ask.equals("Y") || ask.equals("y"));
    }

    public void Xoa() {
        Boolean check = false;
        Scanner a = new Scanner(System.in);
        int id;
        System.out.println("Nhap ID khach hang: ");
        id = a.nextInt();
        for (KhachHang b : kh) {
            if (b.getId() == id) {
                check = true;
                kh.remove(b);
                System.out.println("Da xoa khach hang co ma la " + id);
                break;
            } else {
                check = false; 
            }
        }
        if (check == false) {
            System.out.println("Khong tim thay khach hang");
        }
    }
}
