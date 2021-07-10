/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class sapxep2 {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9};
        int lenA = A.length;
        int lenB = B.length;
        int lenC = lenB + lenA;
        int[] C = new int[lenC];
        Arrays.sort(A);//Arrays.sort(): hàm sắp xếp sẵn
        Arrays.sort(B);
        //C = {1,2,3,4,5,6,7,8,9};
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < lenC; i++) {
            //A het, B van con
            if (indexA == lenA && indexB < lenB) {
                C[i] = B[indexB];
                indexB++;
                continue;
            }
            //B het, A van con
            if (indexB == lenB && indexA < lenA) {
                C[i] = A[indexA];
                indexA++;
                continue;
            }
            // A, B van con
            if (A[indexA] < B[indexB]) {
                C[i] = A[indexA];
                indexA++;
            } else {
                C[i] = B[indexB];
                indexB++;
            }
        }
        for (int i = 0; i < lenC; i++) {
            System.out.print(C[i] + "\t");
        }
    }

}
