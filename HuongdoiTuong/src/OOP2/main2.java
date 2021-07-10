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
//Static keyword được sử dụng chủ yếu trong việc quản lisi bộ nhớ
//stactic áp dụng cho: variable, method, block, nested class
public class main2 {

    public static void main(String[] args) {
        counter count1 = new counter();
        counter count2 = new counter();
        counter count3 = new counter();

//        count1.showCount();
//        count2.showCount();
//        count3.showCount();
        //in ra 1 vì khi tạo ra 3 đối tượng trên ta sẽ có 3 thùng nhớ cho 3 đối tượng trên và mỗi đối tượng sẽ thao tác với 1 biến count của nó
        //khi biến count có từ khóa static thì ta có thể truy cập nó k cần phải tạo ra đối tượng của class counter, ta làm như sau:
        System.out.println(counter.count); //static variable
        counter.showCount();//static method

    }
}
