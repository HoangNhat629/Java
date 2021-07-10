/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huongdoituong;

import java.util.Calendar;

/**
 *
 * @author admin
 */
public class Teacher extends person {

    public double salary;
//constructor ke thua
    public Teacher(String Name, String Code, int Birthday) {
        super(Name, Code, Birthday);
    }

   

    

    public void setSalary(double vSalary) {
        this.salary = vSalary;
    }

    public double getSalary() {
        return salary;
    }

    //Overriding( sự ghi đè): Xuất hiện trong lớp cha và lớp con. Khi đối tượng thuộc lớp con gọi phương thức thì sẽ lựa chọn và chạy theo phương thức trong lớp con còn nếu lớp con k có thì mới gọi phương thức trong lớp cha
    public void showInf() {
//         System.out.println("Person information: ");
//        System.out.println("nam sinh " + this.getBirthday());
//        System.out.println("ten " + this.getName());
//        System.out.println("code " + this.getCode());
//        System.out.println("Age " + this.getAge());
//thay thế: 
        super.showInf();
        System.out.println("Salary " + this.getSalary());
    }
}
