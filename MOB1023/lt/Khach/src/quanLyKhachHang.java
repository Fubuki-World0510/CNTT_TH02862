
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author culua
 */
public class quanLyKhachHang {
    //Đặt tối ưu
    /*
     * Công việc:
     * - Tạo 1 array list chứa khác hàng
     * -> getList()
     * -> quanLyKhachHang() Thêm nhanh 5 dữ liệu
     */
    ArrayList<KhachHang> List = new ArrayList<>();
   
    // Đặt hàm, trả về array list
    public ArrayList<KhachHang> getList(){
        return List;
    }
    
    // hàm thêm dữ liệu
    public String them(KhachHang khachHang){
        List.add(khachHang);
        return "them thanh cong" ;
    }
  
    // Thêm mặc 5 dữ liệu
    public quanLyKhachHang() {
      List.add(new KhachHang("NV1" ,"Nguyen Van A" , "Ha Noi ", 2007 , "Nam"));
      List.add(new KhachHang("NV2" ,"Nguyen Van B" , "Ha Noi ", 2007 , "Nam"));
      List.add(new KhachHang("NV4" ,"Nguyen Van C" , "Ha Noi ", 2008 , "Nam"));
      List.add(new KhachHang("NV5" ,"Nguyen Van D" , "Ha Noi ", 2010 , "Nam"));  
    }
}