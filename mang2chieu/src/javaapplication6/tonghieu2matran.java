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
public class tonghieu2matran {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix, matrix2, tongmatrix3, hieumatrix3, tichmatrix3;
        //int matrixB[][];
        int hang = sc.nextInt();
        int cot = sc.nextInt();
        matrix = new int[hang][cot];
        int hang2 = sc.nextInt();
        int cot2 = sc.nextInt();
        matrix2 = new int[hang2][cot2];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("nhap phan tu[" + i + "][" + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < hang2; i++) {
            for (int j = 0; j < cot2; j++) {
                System.out.println("nhap phan tu[" + i + "][" + j + "]");
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < hang2; i++) {
            for (int j = 0; j < cot2; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("tong 2 ma tran");
        tongmatrix3 = new int[hang][cot];
        hieumatrix3 = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                tongmatrix3[i][j] = matrix[i][j] + matrix2[i][j];
                hieumatrix3[i][j] = matrix[i][j] - matrix2[i][j];

            }
        }
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(tongmatrix3[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("hieu hai ma tran : ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(hieumatrix3[i][j] + "\t");
            }
            System.out.println("");
        }
        if (hang != hang2) {
            System.out.println("k co tich hai ma tran");
        }
        tichmatrix3 = new int[hang][cot2];
        System.out.println("tich hai ma tran : ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot2; j++) {
                tichmatrix3[i][j] = 0;
                for (int k = 0; k < cot; k++) {
                    tichmatrix3[i][j] = tichmatrix3[i][j] + matrix[i][k] * matrix2[k][j];
                    //tichmatrix[i][j] += matrix[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot2; j++) {
                System.out.print(tichmatrix3[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
