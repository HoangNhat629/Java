/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3;
//Đếm số lượng số có 4 chữ số sao cho số sau bằng tổng các số trước
//VD. 1236, 1124
//Chú ý: 2 chữ số đầu luôn đúng, chỉ cần check từ số thứ 3

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class b2 {

    public static int count = 0;

    public static boolean check(int[] A, int n) {

        if (n == 0 || n == 1) {
            return true;
        }
        if (n == 2) {
            if (A[2] == A[1] + A[0]) {
                return true;
            }
        } else if (n > 2) {
            if (A[n] == 2 * A[n - 1]) {
                return check(A, n - 1);
            }
        }
        return false;
    }

    public static void printValue(int[] A, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]);

        }
        System.out.println("");
    }

    public static void Try1(int[] A, int n, int idx) {
        int start = 1;
        if (idx > 0) {
            start = 0;
        }
        for (int i = start; i <= 9; i++) {
            A[idx] = i;
            if (check(A, idx)) {
                if (idx == n - 1) {
                    printValue(A, n);
                    count++;
                } else {
                    Try1(A, n, idx + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = new int[4];
        Try1(A, 4, 0);
        System.out.println("có " + count + "số thỏa mãn");
    }

}
