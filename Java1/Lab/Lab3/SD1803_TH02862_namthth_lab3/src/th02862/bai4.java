/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th02862;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai4 {
    /*
    Yêu cầu: 
    - Nhập 2 mảng
      + Họ tên (String)
      + Điểm (double)
    - Xuất mảng và học lực sinh viên
    - Sort danh sách sinh viên theo điểm
    
    <---Method--->
    ghi điểm sinh viên, sử dụng hàm if để phân loại, đưa phân loại vào mảng
    */
    
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập số sinh viên muốn nhập: ");
        int e0 = data.nextInt();
        int[] a = new int[e0];
        System.out.print("Nhập tên sinh viên");
        String e = data.nextLine();
        System.out.print("Nhập số điểm của sinh viên");
        double e1 = data.nextDouble();
        
    }
}
