/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th02862;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Services {

    private List<NhanVien> nv = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private boolean check;

    public void menu() {
        int nhap = 1;
        do {
            try {
                System.out.println("----------------+----------------");
                System.out.println("1. Nhap danh sach nhan vien tu ban phim.\n"
                        + "2. Xuat danh sach nhan vien ra man hinh.\n"
                        + "3. Tim va hien thi nhan vien theo ma tu ban phim\n"
                        + "4. Xoa nhan vien theo ma\n"
                        + "5. Cap nhat thong tin nhan vien theo nhap tu ban phim\n"
                        + "6. TIm cac nhan vien theo khoang luong nhap tu ban phim.\n"
                        + "7. Sap xep nhan vien theo ho va ten\n"
                        + "8. Sap xep nhan vien theo thu nhap\n"
                        + "9. Xuat 5 nhan vien co thu nhap cao nhat\n"
                        + "0. Thoat");
                System.out.println("----------------+----------------");
                System.out.print("Chon chuc nang [1 -> 9]: ");
                nhap = Integer.parseInt(sc.nextLine());
                switch (nhap) {
                    case 0:
                        System.exit(0);
                    case 1:
                        danhSach();
                        break;
                    case 2:
                        xuatList();
                        break;
                    case 3:
                        timVaHienThi();
                        break;
                    case 4:
                        removeNV();
                        break;
                    case 5:
                        updateNV();
                        break;
                    case 6:
                        timKhoangLuong();
                        break;
                    case 7:
                        sortTen();
                        break;
                    case 8:
                        sortThuNhap();
                        break;
                    case 9:
                        xuatLuongCao();
                        break;
                    default:
                        System.out.println("Khong co gi ca bri a");
                }
            } catch (Exception e) {
                System.out.println("Unexpected, wtf do u thing");
            }
        } while (nhap != 0);
        System.out.println("Cook day");
    }

    public void danhSach() {
        while (true) {
            System.out.print("Ho va ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Ma: ");
            String ma = sc.nextLine();
            System.out.print("Luong: ");
            double luong = Double.parseDouble(sc.nextLine());
            nv.add(new NhanVien(ma, hoTen, luong));
            System.out.print("Nhap tiep ? Y/N ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void xuatList() {
        for (NhanVien nhanVien : nv) {
            System.out.println("Ho ten: " + nhanVien.getHoTen());
            System.out.println("Ma: " + nhanVien.getMa());
            System.out.println("Luong: " + nhanVien.getLuong());
        }
    }

    public void timVaHienThi() {
        System.out.print("Nhap ma: ");
        String ma = sc.nextLine();
        for (NhanVien nhanvien : nv) {
            if (nhanvien.getMa().equals(ma)) {
                System.out.println("Thong tim tim thay:");
                nhanvien.xuatThongTin();
                check = true;
            } else {
                check = false;
            }
            break;
        }
        if (check == false) {
            System.out.println("Nah, nothing i found");
        }
    }

    public void removeNV() {
        System.out.print("Nhap ma nhan vien: ");
        String ma = sc.nextLine();
        for (NhanVien nhanvien : nv) {
            if (nhanvien.getMa().equals(ma)) {
                check = true;
                nv.remove(nhanvien);
                System.out.println("Da xoa");
                break;
            } else {
                check = false;
            }
            break;
        }
        if (check == false) {
            System.out.println("Nah, nothing i found");
        }
    }

    public void updateNV() {
        System.out.print("Nhap ma nhan vien: ");
        String ma = sc.nextLine();
        for (NhanVien nhanvien : nv) {
            if (nhanvien.getMa().equals(ma)) {
                System.out.print("Nhap ho va ten (NEW): ");
                String hoTen = sc.nextLine();
                System.out.print("Nhap ma (NEW): ");
                String manv = sc.nextLine();
                System.out.print("Nhap luong (NEW): ");
                double luong = Double.parseDouble(sc.nextLine());
                nhanvien.setHoTen(hoTen);
                nhanvien.setLuong(luong);
                nhanvien.setMa(manv);
                System.out.println("Da cap nhat thong tin: " + ma);
                return;
            } else {
                check = false;
            }
            break;
        }
    }

    public void timKhoangLuong() {
        System.out.print("Nhap luong thap nhat: ");
        double thap = sc.nextDouble();
        System.out.print("Nhap luong cao nhat: ");
        double cao = sc.nextDouble();
        for (NhanVien nhanvien : nv) {
            if (nhanvien.getLuong() >= thap && nhanvien.getLuong() <= cao) {
                nhanvien.xuatThongTin();
            }
        }
    }

    public void sortTen() {
        Collections.sort(nv, Comparator.comparing(NhanVien::getHoTen));
        System.out.println("Danh sach sort theo ho ten:");
        xuatList();
    }

    public void sortThuNhap() {
        Collections.sort(nv, Comparator.comparingDouble(NhanVien::getThuNhap));
        System.out.println("Danh sach sort theo thu nhap:");
        xuatList();
    }

    public void xuatLuongCao() {
        nv.sort(Comparator.comparingDouble(NhanVien::getThuNhap).reversed());
        if (nv.size() == 0) {
            System.out.print("BAN DA CO DANH SACH CHUA?");
        } else {
            System.out.println("Top 5 thu nhap:");
            for (int i = 0; i < Math.min(5, nv.size()); i++) {
                System.out.println("Ho ten: " + nv.get(i).getHoTen());
                System.out.println("Ma: " + nv.get(i).getMa());
                System.out.println("Luong: " + nv.get(i).getThuNhap());
            }
        }
    }
}
