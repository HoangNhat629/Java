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
public class dinhthuc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        //int matrixB[][];
        int hang = sc.nextInt();
        int cot = sc.nextInt();
        //nhap mang hai chieu
        matrix = new int[hang][cot];
        int sum = 0;
        int tongchiahetcho3 = 0;
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("nhap phan tu[" + i + "][" + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                //in ra tung phan tu 
                System.out.print(matrix[i][j] + "\t");
                sum = sum + matrix[i][j];
                if (matrix[i][j] % 3 == 0) {
                    tongchiahetcho3 = tongchiahetcho3 + matrix[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("tong cac phan tu " + sum);
        System.out.println("tong cac phan chia het cho 3 " + tongchiahetcho3);
        // chuyen vi cua ma tran
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println("");
        }
      
    }

}
