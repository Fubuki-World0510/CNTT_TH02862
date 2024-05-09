/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th02862;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai4 {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. END NOW");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Chọn chức năng [1-4]: ");
        int s = data.nextInt();

        switch (s) {
            case 1:
                bai1.main(args);
                break;
            case 2:
                bai2.main(args);
                break;
            case 3:
                bai3.main(args);
                break;
            default:
                throw new AssertionError();
        }

    }
}
