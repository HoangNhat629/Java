
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class test {

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
        int temp;
        int max = matrix[0];
        int min = matrix[0];
        for (int i = 0; i < matrix.length; i++) {
            if (max < matrix[i]) {
                max = matrix[i];
            }
            if (min > matrix[i]) {
                min = matrix[i];
            }
        }
        System.out.println("gia tri lon nhat" + max);
        System.out.println("gia tri nho nhat" + min);
       System.out.println("");
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i] < matrix[j]) {
                    temp = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = temp;
                }
            }
        }
        System.out.println("mang giam dan:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i] < matrix[i + 1]) {
                max = matrix[i];
            }
            if (matrix[i] > matrix[i + 1]) {
                min = matrix[i];
            }
        }
        System.out.println("gia tri lon nhat" + max);
        System.out.println("gia tri nho nhat" + min);
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i] > matrix[j]) {
                    temp = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = temp;
                }
            }
        }
        System.out.println("mang tang dan :");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + "\t");
        }

    }
}
