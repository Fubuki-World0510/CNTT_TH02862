/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyStaff {
    ArrayList<Staff> st = new ArrayList();
    
    public QuanLyStaff() {
        st.add(new Staff(1, 20, "A", "Manager", "OK"));
        st.add(new Staff(2, 40, "B", "Manager", "NO"));
        st.add(new Staff(3, 30, "C", "Manager", "NO"));
        st.add(new Staff(4, 10, "D", "Manager", "OK"));
        st.add(new Staff(5, 25, "E", "Manager", "OK"));
    }
    
    public String isNumber(String id) {
        try {
            Integer.parseInt(id);
            return "OK";
        } catch(Exception e) {
            return "NO";
        }
    }
}
