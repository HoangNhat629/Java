/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class btvn2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        int hang = sc.nextInt();
        int cot = sc.nextInt();
        matrix = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("nhap phan tu[" + i + "][" + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
        int[] tonghang = new int[hang];
        for (int i = 0; i < hang; i++) {
            tonghang[i] = 0;
            for (int j = 0; j < cot; j++) {
                tonghang[i] = tonghang[i] + matrix[i][j];
            }
        }
        for (int i = 0; i < hang; i++) {
            System.out.println("tong hang " + i + " la " + tonghang[i]);
        }
        int max = tonghang[1];
        for (int i = 0; i < hang; i++) {
            if (max < tonghang[i]) {
                max = tonghang[i];
            }
        }
        
        for (int i = 0; i < hang; i++) {
            if (max == tonghang[i]) {
                System.out.println("hang " + i + " co tong lon nhat " + tonghang[i]);               
            }
        }
        System.out.println("");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (max == tonghang[i]) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        }
    }

}
