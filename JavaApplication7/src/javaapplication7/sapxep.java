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
public class sapxep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kich thuoc mang :");
        int n = sc.nextInt();
        int[] matrix = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a [" + i + "]");
            matrix[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.println("kich thuoc mang 2 : ");
        int m = sc.nextInt();
        int[] matrix2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("a [" + i + "]");
            matrix2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < m; i++) {
            System.out.print(matrix2[i] + "\t");
        }
        System.out.println("");
        int max = matrix[0];
        for (int i = 0; i < matrix.length; i++) {
            if (max < matrix[i]) {
                max = matrix[i];
            }
        }
        System.out.println("phan tu lon nhat " + max);
        int min = matrix[0];
        for (int i = 0; i < matrix.length; i++) {
            if (min > matrix[i]) {
                min = matrix[i];
            }
        }
        System.out.println("phan tu nho nhat " + min);
        int temp = matrix[0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[i] < matrix[j]) {
                    temp = matrix[j];
                    matrix[j] = matrix[i];
                    matrix[i] = temp;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + "\t");
        }
        System.out.println("");
        int temp2 = matrix2[0];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length - 1; j++) {
                if (matrix2[i] < matrix2[j]) {
                    temp2 = matrix2[j];
                    matrix2[j] = matrix2[i];
                    matrix2[i] = temp2;
                }
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            System.out.print(matrix2[i] + "\t");
        }
        System.out.println("");
        int[] matrix3 = new int[m + n];
        for (int i = 0; i < matrix.length; i++) {
            matrix3[i] = matrix[i];
            if (i == matrix.length - 1) {
                for (int j = 0; j < matrix2.length; j++) {
                    matrix3[matrix.length + j] = matrix2[j];
                }
            }
        }
        System.out.println("array3 : ");
        for (int i = 0; i < matrix3.length; i++) {
            System.out.print(matrix3[i] + "\t");
        }
    }
}
