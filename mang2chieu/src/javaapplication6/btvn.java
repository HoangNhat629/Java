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
public class btvn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kich thuc mang :");
        int n = sc.nextInt();
        int[] matrix = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a [" + i + "]");
            matrix[i] = sc.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i] + "\t");
        }
        System.out.println("");
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (matrix[i] == matrix[n - i - 1]) {
            } else {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("ma tran doi xung");
        } else {
            System.out.println("ma tran khong doi xung");
        }
        int max = matrix[0];
        for (int i = 0; i < n; i++) {
            if (max < matrix[i]) {
                max = matrix[i];
            }
        }
        System.out.println("phan tu lon nhat la:" + max);
        System.out.println("");
        int x;
        System.out.println("so tu nhien : ");
        x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (matrix[i] < x) {
                System.out.println("cac phan tu nho hon " + x + " la : " + matrix[i]);
            }
        }
        int y = matrix[0];
        for (int i = 0; i < n; i++) {
            if ((y < matrix[i]) && (matrix[i] < x)) {
                y = matrix[i];
            }
        }
        System.out.println("phan tu gan " + x + " la : " + y);
        System.out.println("");
        int min = matrix[0];
        for (int i = 0; i < n; i++) {
            if (min > matrix[i]) {
                min = matrix[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[i] == min) {
                matrix[i] = -1;
            }
            System.out.print(matrix[i] + "\t");
        }
        for (int i = 0; i < n; i++) {
            if (matrix[i] % 2 != 0) {
                matrix[i] = -1;
            }
            System.out.print(matrix[i] + "\t");
        }
    }
}
