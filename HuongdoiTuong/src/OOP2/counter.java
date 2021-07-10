/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

/**
 *
 * @author admin
 */
public class counter {

//    public int count = 0;//đếm xem có bao nhiêu đối tượng được tạo ra 
    //để 3 đói tượng thao tác với cùng 1 biến count thì ta thêm static
    public static int count = 0;

    public counter() {
        count++;//mỗi lần 1 đối tượng đc tạo ra thì count tăng lên 1
    }

    public int getCounter() {
        return count;
    }

//    public void showCount() {
//        System.out.println("Count: " + count);
//        
//    }
    // =>
    public static void showCount() {
        System.out.println("Count: " + count);
        // static method có thể truy cập vào nó mà k cần tạo ra đối tượng của class đó đồng thới các thuộc tính và các phương thức muốn truy cập trong static method thì các phương thức và thược tính đó phải ở dạng static
    }
    //static method thuộc về lớp không thuộc về đối tượng
    //static method được gọi mà không cần tạo 1 thể hiện của lớp
    //static method  có thể truy cập và thay đổi giá trị của static variable
    //các property và method k thỏa mãn static thì static method k có quyền truy cập vào 
}
