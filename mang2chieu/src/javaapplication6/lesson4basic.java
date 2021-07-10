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
public class lesson4basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNew = {9, 7, 3, 3, 4};
        //mang 2 chieu
        int[] array = new int[5];
        //ox
        int[][] array2D = new int[5][5];
        //oxy
        int[][] array2DNew = {
            {6, 7, 8, 6, 8},
            {6, 7, 8, 6, 9},
            {6, 6, 8, 6, 8},
            {6, 7, 8, 0, 9},
            {6, 8, 8, 6, 8}};
        //array2D[3]={6,7,8,0,9}
        //array2D[3][4]=9
        //oxy
        for (int i = 0; i < array2DNew.length; i++) {
            System.out.println("Do dai cua phan tu " + i + " la:" + array2DNew[i].length);
            for (int j = 0; j < array2DNew[i].length; j++) {
                System.out.println("Do dai cua phan tu [" + i + "][" + j + "] la:" + array2DNew[i][j]);
            }
        }
        for (int i = 0; i < array2DNew.length; i++) {
            System.out.println("vong lap thu" + i);
            for (int j = 0; j < array2DNew[i].length; j++) {
                System.out.println("array2DNew [" + i + "][" + j + "] la:" + array2DNew[i][j]);
            }
        }
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("nhap vao phan tu thu [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }

    }

}
