/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803_th02862_namthth_lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai2 {

    public static void main(String[] args) {
        Menu d = new Menu();
        int nhap;
        String nhap2;
        ArrayList ob = new ArrayList();
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
                    while (true) {
                        System.out.println("Nhập họ và tên: ");
                        ob.add(data.nextLine());
                        System.out.print("Tiếp tục ? (Y/N)");
                        if (data.nextLine().equals("N")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Danh sách vừa nhập: ");
                    for(Object a : ob) {
                        System.out.println(a);
                    }
                    break;
                case 3:
                    Collections.shuffle(ob);
                    System.out.println("Danh sách ngẫu nhiên: ");
                    for(Object a : ob) {
                        System.out.println(a);
                    }
                    break;
                case 4:
                    Collections.sort(ob);
                    Collections.reverse(ob);
                    System.out.println("Danh sách theo thứ tự giảm dần: ");
                    for(Object a : ob) {
                        System.out.println(a);
                    }
                    break;
                case 5:
                    System.out.print("Nhập tên: ");
                    nhap2 = data.nextLine();
                    int a = Collections.binarySearch(ob, nhap2);
                    ob.remove(a);
                    System.out.print("Tìm thấy tên và đã thực hiện xóa tên khỏi danh sách");
                    break;
            }
        }
    }
}
