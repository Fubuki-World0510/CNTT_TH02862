/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th02862;

/**
 *
 * @author Administrator
 */
public class bai2 {
    public static void main(String[] args) {
        //For 1: 9 cửu chương
        //For 2: Nhân dần lên
        /*
          Trong đó: For 2: có số
        
        ----> Thao tác như sau:
        For 1 lưu trữ vòng lặp 9 cửu chương
        For 2 thực hiện vòng lặp chạy bảng cửu chương
        - Sử dụng số từ vòng lặp để thực hiện main 
         -> main*số vòng lặp = kết quả
        */
        for(int i = 1; i <= 10; i++) {
            for(int j = 0; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }
    }
            
    
}
