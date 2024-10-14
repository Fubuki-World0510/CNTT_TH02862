/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package khachhang.view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import khachhang.model.KhachHang;

/**
 *
 * @author nguyenvv
 */
public class ghifile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tạo một ArrayList
        ArrayList<KhachHang> list = new ArrayList<>();
        list.add(new KhachHang(1, "Nguyen Van A", "Ha Noi", "Nam", 2006));
        list.add(new KhachHang(2, "Nguyen Van B", "Ha Noi", "Nu", 2007));
        list.add(new KhachHang(3, "Nguyen Van C", "Ha Noi", "Nam", 2008));
        list.add(new KhachHang(4, "Nguyen Van C", "Ha Noi", "Nam", 2008));

        // Ghi ArrayList vào file

        String filePath = "output.txt";
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // Ghi từng khách hàng vào file
            for (KhachHang customer : list) {
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine(); // xuống dòng
            }

            // Đóng BufferedWriter
            bufferedWriter.close();
            System.out.println("Ghi thành công vào file output.txt");
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }

}
