/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th02862;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        
        int[] a = new int[5];
        
        for(int i = 0; i < a.length; i++) {
            System.out.print("Nhập phần tử số" + i + ":");
            a[i] = cc.nextInt();
        }
        Arrays.sort(a);
        for(int r : a) {
            System.out.println(r);
        }
    }
}


//Sắp xếp từ lớn đến bé, fr
//for(int i = 0; i < a.length - 1; i++) {
//  for(int j = i + 1; j < a.length - 1; i++) {
//    if(a[j] > a[i]) {
//        int temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//    }
//  }
//}
//
//for (int i : a) {
//    System.out.print(i)
//}