/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803_th02862_namthth_lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Menu {

    Scanner data = new Scanner(System.in);
    ArrayList<String> ob = new ArrayList<String>();
    public void menu() {
        while (true) {
            System.out.println("Số thực fr: ");
            ob.add(data.nextLine());
            System.out.print("Tiếp tục ? (Y/N)");
            if (data.nextLine() == "N" || data.nextLine() == "n") {
                break;
            }
        }
    }

    public void xuat() {
        for (String string : ob) {
            System.out.println(string);
        }
    }
}
