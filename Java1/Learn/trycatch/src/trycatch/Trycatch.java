/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatch;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Trycatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Nhập số nguyên");
        int a = data.nextInt();
        try {
            System.out.println("AI hỏi??");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Ngu");
        }
    }
    
}
