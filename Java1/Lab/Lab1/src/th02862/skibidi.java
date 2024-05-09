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
public class skibidi {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
//BT 1
        System.out.println("BÀI TẬP 1");
        System.out.print("Nhập họ tên của bạn: ");
        String ten = data.nextLine();

        System.out.print("Điểm: ");
        double diem = data.nextDouble();
        System.out.printf("Bạn tên là %s và điểm trung bình của bạn là %.1f\n", ten, diem);

//Bt 2
        System.out.println("BÀI TẬP 2");
        System.out.print("Nhập 2 cạnh của hình chữ nhật\n");
        double canh1 = data.nextDouble();
        double canh2 = data.nextDouble();

        //Chu vi
        double chuvi = (canh1 + canh2) * 2;
        //Diện tích
        double dientich = canh1 * canh2;

        System.out.printf("Chu vi HCN là %.1f và diện tích HCN là %.1f, cạnh nhỏ nhất có số đo là %.1f\n", chuvi, dientich, Math.min(canh1, canh2));

//Bt 3
        System.out.println("BÀI TẬP 3");
        System.out.print("Nhập cạnh của khối lập phương đi lào: ");
        double canh = data.nextDouble();
        double thetich = Math.pow(canh, 3);
        System.out.println("Thể tích: " + thetich);
//Bt 4
        System.out.println("BÀI TẬP 4");
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
//BT 5
        System.out.println("\nBÀI TẬP 5");
        System.out.println("Nhập 3 số nguyên đi, nhanh nào còn kết thúc bài");
        double n1 = data.nextDouble();
        double n2 = data.nextDouble();
        double n3 = data.nextDouble();

        double tb = (n1 + n2 + n3) / 3;
        System.out.println("Trung bình của 3 số nguyên là: " + tb);

        data.close();
    }
}
