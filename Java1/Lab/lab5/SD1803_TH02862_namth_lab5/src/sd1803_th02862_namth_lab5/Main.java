/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd1803_th02862_namth_lab5;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList a = new ArrayList();
        
        a.add("Sech");
        a.add(9999);
        a.add(1, "Nuh");
        for(Object o : a) {
            System.out.println(o);
        }
        System.out.println(a.size());
    }
    
}
