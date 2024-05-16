
import java.util.Scanner;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Administrator
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int sv = 5;
        boolean check;
        String[] e = new String[sv];
        double[] e1 = new double[sv];

        for (int i = 0; i < sv; i++) {
            System.out.println("Nhập họ tên: ");
            e[i] = data.nextLine();
            System.out.println("Nhập chiều cao: ");
            e1[i] = Double.parseDouble(data.nextLine());
        }
        double[] a = e1;
        Arrays.sort(a);
        System.out.print("Sinh viên có chiều cao thấp nhất là " + a[0]);
        for (int i = 0; i < sv; i++) {
            for (int j = i + 1; j < sv; j++) {
                if (e1[j] > e1[i]) {
                    double temp = e1[i];
                    e1[i] = e1[j];
                    e1[j] = temp;
                }
            }
        }
        
        check = false;
        for (double i : e1) {
            if(check == false) {
                System.out.printf("\nSinh viên có chiều cao lớn nhất là %.1f\n", i);
                check = true;
            }
            System.out.printf("Danh sinh viên từ lớn đến bé: %.1f\n", i);
        }
    }
}
