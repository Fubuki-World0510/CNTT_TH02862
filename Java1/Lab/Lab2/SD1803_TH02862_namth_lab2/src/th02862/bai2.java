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
public class bai2 {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Nhập a, b và cả c luôn đi cho đỡ mệt");
        double a = data.nextDouble();
        double b = data.nextDouble();
        double c = data.nextDouble();
        double delta = (b * b - 4 * a * c);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Vô số nghiệm");
                } else {
                    System.out.println("Vô nghiệm");
                }
            } else if (b != 0) {
                System.out.printf("Phương trình b khác 0, kết quả: %f", -c / b);
            }
        } else if (a != 0) {
            if (delta < 0) {
                System.out.printf("Vô nghiệm delta");
            } else if (delta == 0) {
                System.out.printf("Delta có nghiệm kép: %f", -b / 2 * a);
            } else {
                System.out.printf("Delta có 2 nghiệm\n");
                System.out.printf("X1: %f", -b - Math.sqrt(delta) / (2 * a));
                System.out.printf("\nX2: %f", -b - Math.sqrt(delta) / (2 * a));
            }
        }

        data.close();
    }
}
