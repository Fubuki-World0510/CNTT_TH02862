/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanviendz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVienService {

    public ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
    
    public NhanVienService(){
        nv.add(new NhanVien("Ha Noi", "Nam", "Nam", 99));
        nv.add(new NhanVien("Ha Noi", "Nam", "Nam", 99));
        nv.add(new NhanVien("Ha Noi", "Nam", "Nam", 99));
        nv.add(new NhanVien("Ha Noi", "Nam", "Nam", 99));
        nv.add(new NhanVien("Ha Noi", "Nam", "Nam", 99));
    }
    public ArrayList<NhanVien> getDanhSach(){
        return nv;
    }

    public void Them() {
        Scanner sc = new Scanner(System.in);
        String ten, gioitinh, diachi, nhap;
        int tuoi;
        do {
            //Thu thập thông tin của Nhân viên
            System.out.println("Ten nhan vien: ");
            ten = sc.nextLine();

            System.out.println("Tuoi nhan vien: ");
            tuoi = sc.nextInt();
            sc.nextLine();

            System.out.println("Gioi tinh nhan vien: ");
            gioitinh = sc.nextLine();

            System.out.println("Dia chi: ");
            diachi = sc.nextLine();

            // Thêm dữ liệu nhân viên vừa thu thập vào hộp ArrayList tên biến là "nv"
            nv.add(new NhanVien(diachi, gioitinh, ten, tuoi));

            System.out.println("Muon them nua ko?");
            nhap = sc.nextLine();
        } while (nhap.equals("Y"));
    }

    public void Hien() {
        for (NhanVien b : nv) {
            if (nv.isEmpty()) {
                System.out.println("Khong co thong tin");
            } else {
                b.inThongTin();
            }
        }
    }

    public void Sua() {
        Scanner sc = new Scanner(System.in);
        String gioitinh, diachi, tenNhanVien;
        int tuoi;
        Boolean check = false;

        System.out.println("Ten Nhan Vien: ");
        tenNhanVien = sc.nextLine();

        for (NhanVien tim : nv) {
            if (tim.getTen().equals(tenNhanVien)) {
                check = true;
                //Thu thập thông tin của Nhân viên
                System.out.println("Tuoi nhan vien: ");
                tuoi = sc.nextInt();
                sc.nextLine();

                System.out.println("Gioi tinh nhan vien: ");
                gioitinh = sc.nextLine();

                System.out.println("Dia chi: ");
                diachi = sc.nextLine();

                nv.remove(tim);
                nv.add(new NhanVien(diachi, gioitinh, tenNhanVien, tuoi));
                break;
            } else {
                check = false;
            }
        }
        if(check == false) {
            System.out.println("Khong tim thay nhan vien");
        }
    }

    public void Xoa() {
        /**
         *  Giống hàm Sua();
         * 
         * Thao tác -> Tìm nhân viên 
         * - Input: Ten nhân viên 
         * Step 1: Dùng forEach lấy thông tin nhân viên 
         * Step 2: Sử dụng điều kiện if else kiểm tra xem có đúng tên nhân viên cần nhập không?
         *
         * Thao tác -> Xóa thông tin nhân viên
         * - Xóa dữ liệu của nhân viên trong hộp ArrayList
         */

        Scanner sc = new Scanner(System.in);
        String tenNhanVien;
        Boolean check = false;

        System.out.println("Ten Nhan Vien: ");
        tenNhanVien = sc.nextLine();

        for (NhanVien tim : nv) {
            //Tìm nhân viên
            if (tim.getTen().equals(tenNhanVien)) {
                check = true;
                //Xóa thông tin nhân viên
                nv.remove(tim);
                break;
            } else {
                // Nếu không tìm thấy
                check = false;
            }
        }
        if(check == false) {
            // Nếu không tìm thấy
            System.out.println("Khong tim thay nhan vien");
        }
    }

    public void TimTuoiCaoNhat() {
        /**
         * Sử dụng forEach lấy thông tin tuổi của nhân viên
         * 
         * - Thao tác:
         * Đặt 1 biến tên max và max = 0
         * 
         * Hiểu thuật toán sau:
         * - Nếu tuổi nhân viên lớn hơn max thì max = tuổi nhân viên
         */

        //Đặt biến max = 0
        int max = 0;

        //Thực hiện vòng forEach để lấy thông tin tuổi
        for(NhanVien tuoi : nv) {
            //Nếu tuổi nhân viên lớn hơn max => Max = tuổi nhân viên
            if(tuoi.getTuoi() > max) {
                max = tuoi.getTuoi();
            }
        }
        System.out.println("Nhan vien co so tuoi cao nhat la" + max);
    }

    public void TimNhanVienNu() {
        /**
         * Sử dụng forEach lấy thông tin giới tính Nhân Viên
         * 
         * - Thao tác:
         * Nếu giới tính.equals("Nu") => True
         */

        // forEach lấy thông tin giới tính nhân viên
        for(NhanVien gioitinh : nv) {
            // Nếu thông tin giới tính nhân viên = Nữ => In thông tin
            if(gioitinh.getGioitinh().equals("Nu")) {
                gioitinh.inThongTin();
            }
        }
    }
}
