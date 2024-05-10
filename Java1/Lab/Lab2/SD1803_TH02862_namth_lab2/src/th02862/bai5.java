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
public class bai5 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.print("Hãy nhập 3 số a, b. v luôn đi: ");
        double a = d.nextDouble();
        double b = d.nextDouble();
        double c = d.nextDouble();
        double max;
        
        max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        
        System.out.printf("Số lớn nhất trong 3 số a, b, c là: %.1f", max);
        
    }
}
