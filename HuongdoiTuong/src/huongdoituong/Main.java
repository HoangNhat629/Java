/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huongdoituong;

/**
 *
 * @author admin
 */
//Property : thuộc tính
// Method ; phương thức
public class Main {

    public static void main(String[] args) {
        Student studentOne = new Student();// (Kiểu dữ liệu) (tên của đối tượng)
//        Student studentOne = new Student("Yami9", "98127987",1999); c2
//        Student studentTwo = new Student();

        studentOne.setBirthday(1999);
        studentOne.setName("Nhat");
        studentOne.setCode("20176048");
        //Cách 1
        studentOne.showInf();

// Cách 2
//        System.out.println("nam sinh " + studentOne.getBirthday());
//        System.out.println("ten " + studentOne.getName());
//        System.out.println("code " + studentOne.getCode());
//        System.out.println("-----------------------------------");
//        studentTwo.birthday = 2000;
//        studentTwo.code = "918203";
//        studentTwo.name = "Yami";
//        System.out.println("nam sinh " + studentTwo.birthday);
//        System.out.println("ten " + studentTwo.name);
//        System.out.println("code " + studentTwo.code);

// K sử dụng constructor
//        Teacher teacherOne = new Teacher();
//        teacherOne.setName("Yami");
//        teacherOne.setCode("1215235");
//        teacherOne.setBirthday(1999);
//        teacherOne.setSalary(91828);
// Sử sụng constructor
     Teacher teacherOne = new Teacher("Yami","16353",1999);
        teacherOne.showInf();
        
       
    }
}

class Student1 {
    //access modifier là cấp độ truy cập cho class, property và method
    //Private: chỉ truy cập trong class (property và method)
    //Null : truy cập trong package (class, property và method)
    //Protected: truy cập trong package và các subclass(lớp con) (property và method) 
    //Public: truy cập bất cứ đâu (class, property và method)

}//k thêm public vào class student đc vì khi tạo ra tập tin main thì class chính là class main nên chỉ có thể thêm public vào class chính
