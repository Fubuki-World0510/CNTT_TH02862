package khachhang.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import khachhang.model.KhachHang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nguyenvv
 */
public class docfile {

    public static void main(String[] args) {
        // Đường dẫn tới file chứa danh sách khách hàng
        String filePath = "output.txt";

        // Tạo một ArrayList để lưu danh sách khách hàng
        ArrayList<KhachHang> customerList = new ArrayList<>();

        try {
            // Mở file để đọc
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            // Đọc từng dòng trong file và thêm vào danh sách khách hàng
            while ((line = bufferedReader.readLine()) != null) {
                // Tách dòng thành id và name bằng dấu phẩy
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

            // Đóng BufferedReader
            bufferedReader.close();

            // In ra danh sách khách hàng đã đọc
            System.out.println("Danh sách khách hàng:");
            for (KhachHang customer : customerList) {
                System.out.println(customer);
            }
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
