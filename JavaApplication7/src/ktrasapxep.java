
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
public class ktrasapxep {

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
        boolean tangdan = true;
        boolean giamdan = true;
        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i] > matrix[i + 1]) {
                tangdan = false;
            }
            if (matrix[i] < matrix[i + 1]) {
                giamdan = false;
            }
        }
        if (tangdan) {
            System.out.println("mang tang dan");

        } else if (giamdan) {
            System.out.println("mang giam dan");

        } else {
            System.out.println("chua duoc sap xep");
        }
    }
}
