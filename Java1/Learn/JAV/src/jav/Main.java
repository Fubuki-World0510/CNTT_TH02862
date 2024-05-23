package jav;

import java.util.ArrayList;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        JAVA d = new JAVA("Gay", 90, 9.9);
        JAVA d1 = new JAVA("Gay", 90, 9.9);
        JAVA d2 = new JAVA("Gay", 90, 9.9);
        ArrayList<JAVA> ob = new ArrayList<JAVA>();
        
        ob.add(d);
        ob.add(d1);
        ob.add(d2);
        
        Comparator<JAVA> e1 = new Comparator<JAVA>() {
            @Override
            public int compare(JAVA o1, JAVA o2) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }
}
