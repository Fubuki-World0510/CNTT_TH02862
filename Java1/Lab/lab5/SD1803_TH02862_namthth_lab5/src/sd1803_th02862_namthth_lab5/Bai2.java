/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803_th02862_namthth_lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai2 {

    public static void main(String[] args) {
        Menu d = new Menu();
        int nhap;
        Scanner data = new Scanner(System.in);
        while (true) {
            System.out.println("1. Nhập danh sách họ và tên\n"
                    + "2. Xuất danh sách vừa nhập\n"
                    + "3. Xuất danh sách ngẫu nhiên\n"
                    + "4. Sắp xếp giảm dần và xuất danh sách\n"
                    + "5. Tìm và xóa họ tên nhập từ bàn phím\n"
                    + "0. Kết thúc");
            nhap = Integer.parseInt(data.nextLine());

            switch (nhap) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }
        }
    }
}
