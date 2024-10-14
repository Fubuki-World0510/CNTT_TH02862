/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803;

/**
 *
 * @author Admin
 */
public class Staff {
    //Tạo đối tượng staff(id int, name, age, role(combobox), status(radio)
    int id, age;
    private String name, role, status;

    public Staff() {
    }

    public Staff(int id, int age, String name, String role, String status) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.role = role;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
