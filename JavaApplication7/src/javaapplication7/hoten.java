/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class hoten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = {
            "Tran  C",
            "Hoang X",
            "Nguyen O",
            "Tran B",
            "Tran C"};
        int[] point = {5, 9, 8, 10, 7};

        for (int i = 0; i < point.length; i++) {
            for (int j = 0; j < point.length - 1; j++) {
                if (point[i] > point[j]) {
                    int temp = point[j];
                    point[j] = point[i];
                    point[i] = temp;
                    String x = name[j];
                    name[j] = name[i];
                    name[i] = x;
                }
            }
        }
        for (int i = 0; i < point.length; i++) {
            System.out.println(name[i] + " : " + point[i]);
        }
    }

}
