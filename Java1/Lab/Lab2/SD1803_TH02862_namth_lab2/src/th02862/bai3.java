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
public class bai3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập số điện của bạn: ");
        double sodien = data.nextDouble();
        double tien;
        if(sodien < 50) tien = sodien*1000;
        else tien = 50*1000+(sodien-50)*1200;
        
        System.out.printf("Số tiền bạn phải trả là: %.1f", tien);
        
    }
}
