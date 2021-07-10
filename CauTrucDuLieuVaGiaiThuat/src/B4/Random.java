/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Random {
    //Constructor khong tham so

    public Random() {
    }

//Phuong thuc xu ly
    public static ArrayList generate(int number, int n) {

//Khai bao thanh phan trung gian
        ArrayList tmp = new ArrayList();
        int count = 0;
        int value;
        boolean flag;

        while (count < number) {

            flag = false;
            value = (int) (Math.random() * n);
            for (int i = 0; i < tmp.size(); i++) {

                if (((Integer) tmp.get(i)).intValue() == value) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                tmp.add(value);
                count++;
            }
        }
        return tmp;
    }
    public static void main(String[] args) {
        System.out.println("số lượng số ngẫu nhiên cần sinh: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("mảng các số ngãu nhiên đã sinh:");
        ArrayList arrInt = Random.generate(n,n);
        System.out.print(arrInt);

    }

}
