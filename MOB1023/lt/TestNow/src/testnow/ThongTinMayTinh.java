/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testnow;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ThongTinMayTinh {
    ArrayList<MayTinh> mt = new ArrayList();
    
    public String add(MayTinh list) {
        mt.add(list);
        return "Da them";
    }
    
    public String remove(int index) {
        mt.remove(index);
        return "Da xoa";
    }
    
    public ThongTinMayTinh() {
        mt.add(new MayTinh(1, "Toshiba", "intel", "có", 7.500));
        mt.add(new MayTinh(2, "Toshiba", "intel", "ko", 7.600));
        mt.add(new MayTinh(3, "Toshiba", "intel", "ko", 7.700));
        mt.add(new MayTinh(4, "Toshiba", "intel", "có", 7.800));
        mt.add(new MayTinh(5, "Toshiba", "intel", "có", 7.900));
    }
}
