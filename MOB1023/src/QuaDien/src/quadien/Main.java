/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /**
     * Đề bài: Tạo 1 hệ thống quản lý Hololive member 
     * - Thêm thành viên 
     * - Chỉnh sửa thành viên 
     * - Xóa thành viên 
     * - Trộn số tuổi thành viên 
     * - Lấy người có số tiền super chat cao nhất 
     * - Tìm thành viên ở các cơ sở Hololive khác nhau
     *
     * Dữ liệu cần nhập: 
     * TenThanhVien: String 
     * Tuoi: int 
     * SuperChat: float 
     * Coso: String 
     * MaThanhVien: Number
     */
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a;
        QuanLyThanhVien tv = new QuanLyThanhVien();
        do {
            System.out.println("1. Them thanh vien\n2. Chinh sua thanh vien\n3. Xoa thanh vien\n4. Tron so tuoi thanh vien\n5. Thanh vien co so super chat cao nhat\n6. Tim cac thanh vien o co so Hololive JP\n7. Hien thi tat ca thanh vien\n0. Thoat chuong trinh\n\nMoi ban chon [1-6]: ");
            a = nhap.nextInt();

            switch (a) {
                case 1 ->
                    tv.Them();

                case 7 ->
                    tv.Hien();
            }
        } while (a != 0);
    }
}
