/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd1803_th02862_namth_ass1;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StandardCharsets.UTF_8.name();
        Scanner data = new Scanner(System.in);
        int nhap;
        do {
            try {
                System.out.println("1. Nhập danh sách nhân viên từ bàn phím\n"
                        + "2. Xuất danh sách nhân viên ra màn hình.\n"
                        + "3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.\n"
                        + "4. Xóa nhân viên theo mã nhập từ bàn phím.\n"
                        + "5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím\n"
                        + "6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.\n"
                        + "7. Sắp xếp nhân viên theo họ và tên.\n"
                        + "8. Sắp xếp nhân viên theo thu nhập.\n"
                        + "9. Xuất 5 nhân viên có thu nhập cao nhất.\n"
                        + "0. Thoát");
                System.out.print("Chọn chức năng: ");
                nhap = Integer.parseInt(data.nextLine());

                switch (nhap) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("Chức năng 1");
                        break;
                    case 2:
                        System.out.println("Chức năng 2");
                        break;
                    case 3:
                        System.out.println("Chức năng 3");
                        break;
                    case 4:
                        System.out.println("Chức năng 4");
                        break;
                    case 5:
                        System.out.println("Chức năng 4");
                        break;
                    case 6:
                        System.out.println("Chức năng 4");
                        break;
                    case 7:
                        System.out.println("Chức năng 4");
                        break;
                    case 8:
                        System.out.println("Chức năng 4");
                        break;
                    case 9:
                        System.out.println("Chức năng 4");
                        break;
                    default:
                        System.out.println("Chức năng không tồn tại");
                }
            } catch (Exception e) {
                System.out.print("Bạn đang không nhập số nguyên");
            }
        } while (true);
    }

}