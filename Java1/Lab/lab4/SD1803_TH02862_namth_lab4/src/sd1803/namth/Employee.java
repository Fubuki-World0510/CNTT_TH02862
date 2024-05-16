/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803.namth;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Employee {
    public String fullname;
    public double salary;
    
    public void in() {
        Scanner d = new Scanner(System.in);
        System.out.println("Nhập full name: ");
        this.fullname = d.nextLine();
        
        System.out.println("Nhập tiền: ");
        this.salary = d.nextDouble();
    }
    
    public void out() {
        System.out.println("FUll NAME: " + this.fullname);
        System.out.println("Salery: " + this.salary);
    }
}
