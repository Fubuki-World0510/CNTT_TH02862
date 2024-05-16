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
        System.out.print("Nhập số: ");
        int d = data.nextInt();
        //Số chia hết cho một
        //Chia hết cho chính nó
        int check = 0;
        for(int i = 2; i < Math.abs(d); i++ ) {
            if(d%i == 0) {
                check++;
            }
        }
        if(check <= 2 && d != 0) System.err.println("Số nguyên tố.com.vn");
    }
}
