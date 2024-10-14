/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khachhang.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import khachhang.model.KhachHang;

/**
 *
 * @author nguyenvv
 */
public class QuanLyKhachHang {

    ArrayList<KhachHang> list = new ArrayList<>();

    public QuanLyKhachHang() {
        list.add(new KhachHang(1, "Nguyen Van A", "Ha Noi", "Nam", 2006));
        list.add(new KhachHang(2, "Nguyen Van B", "Ha Noi", "Nu", 2007));
        list.add(new KhachHang(3, "Nguyen Van C", "Ha Noi", "Nam", 2008));
    }

    public ArrayList<KhachHang> docFile() {
        String path = "output.txt";
        ArrayList<KhachHang> customerList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String diaChi = parts[2];
                String gioiTinh = parts[3];
                int namSinh = Integer.parseInt(parts[4]);

                // Tạo đối tượng KhachHang và thêm vào ArrayList
                KhachHang customer = new KhachHang(id, name, diaChi, gioiTinh, namSinh);
                customerList.add(customer);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
        return customerList;
    }

    public ArrayList<KhachHang> getList() {
        return list;
    }

    public String them(KhachHang khachHang) {
        list.add(khachHang);
        return "Them thanh cong";
    }

    public String xoa(int viTri) {
        list.remove(viTri);
        return "Xoa thanh cong";
    }

    public String capNhap(int viTri, KhachHang khachHang) {
        list.set(viTri, khachHang);
        return "Cap nhat thanh cong";
    }

}
