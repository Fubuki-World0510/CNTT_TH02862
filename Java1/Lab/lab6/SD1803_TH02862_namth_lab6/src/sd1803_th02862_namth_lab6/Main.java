/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd1803_th02862_namth_lab6;

import java.util.Scanner;

/**
 *
 * @author Foob
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Nhập họ tên: ");
       String ten = s.nextLine();
       int index1 = ten.indexOf(" ");
       int index2 = ten.indexOf(" ");
       System.out.print("Ho: " + ten.substring(0, index1).toUpperCase());
       System.out.print("Tên đệm: " + ten.substring(index1+1, index2).toUpperCase());
       
        
        // String se = "Dam Nguyen Quang Vinh";
        // for(String a : se.split(se)) {
        //     System.out.println(a);
        // }
        
    }
}