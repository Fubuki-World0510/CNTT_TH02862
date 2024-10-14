/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ThongTinXeMay {

    ArrayList<XeMay> xm = new ArrayList();

    public ArrayList<XeMay> getInfo() {
        return xm;
    }

    public ThongTinXeMay() {
        xm.add(new XeMay(1, "ABC", "S23", 900));
        xm.add(new XeMay(2, "ABC1", "S24", 910));
        xm.add(new XeMay(3, "ABC2", "S25", 920));
        xm.add(new XeMay(4, "ABC3", "S26", 930));
    }

    public String addMore(XeMay list) {
        xm.add(list);
        return "Heloo helloo heloo hello";
    }

    public String edit() {

        return "OK ok ok ok ok";
    }

    public String remove(int index) {
        xm.remove(index);
        return "Bye bye bye bye";
    }

    public boolean isNan(String i) {
        try {
            Integer.parseInt(i);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
