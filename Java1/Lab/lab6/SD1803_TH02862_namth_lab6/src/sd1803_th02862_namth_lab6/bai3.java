/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803_th02862_namth_lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Foob
 */
public class bai3 {
    public static void main(String[] args) {
        ArrayList<contruct> sv = new ArrayList<contruct>();
        Scanner d = new Scanner(System.in);
        while(true) {
            String checkSDT = "0+[0-9]{9,10}";
            String checkEmail = "\\w+@\\w+(\\.\\w{1,3})";
            String checkCMND = "[0-9]{9}";
            
            System.out.print("Nhap ten sv");
            String d1 = d.nextLine();
            if(!checkSDT.matches(d1)) System.out.println("Ban da nhap sai");
            System.out.print("Nhap SDT");
            int d2 = Integer.parseInt(d.nextLine());
            System.out.print("Nhap CMND");
            int d3 = Integer.parseInt(d.nextLine());
            sv.add(new contruct(d1, d2, d3));
            System.out.print(sv.size());
            if(sv.size() > 4) {
                break;
            }
        }
    }
    
}
