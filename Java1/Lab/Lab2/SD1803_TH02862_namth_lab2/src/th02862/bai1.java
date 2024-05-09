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
public class bai1 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = data.nextInt();
        System.out.print("Nhập b: ");
        double b = data.nextInt();
        if(a == 0) {
            String checkB = b == 0 ? "vo so nghiem" : "vo nghiem";
            System.out.println(checkB);
        } else {
            double x = -b/a;
            System.out.printf("Nghiem cua X la: %f", x);
        }
    }
}
