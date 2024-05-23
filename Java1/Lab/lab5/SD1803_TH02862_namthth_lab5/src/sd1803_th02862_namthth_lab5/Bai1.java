/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd1803_th02862_namthth_lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        ArrayList ob = new ArrayList();
        while (true) {
            System.out.println("Số thực fr: ");
            ob.add(Double.parseDouble(data.nextLine()));
            System.out.print("Tiếp tục ? (Y/N)");
            if(data.nextLine() == "N" || data.nextLine() == "n") {
                break;
            }
            
            double tong = 0;
            System.out.println("Danh sách vừa nhập: ");
            for(Object d : ob){
                tong = tong;
            }
        }
    }

}
