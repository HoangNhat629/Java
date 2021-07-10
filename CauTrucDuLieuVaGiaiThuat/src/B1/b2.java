/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class b2 {

    public static void NhapMang(int[] a, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(1000000);
        }
    }

    public static void XuatMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }
    }

    static int TimKiem(int A[], int x) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (x == A[i]) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1000;
        int[] a = new int[n];
        NhapMang(a,n);
        System.out.println("Nội dung mảng 1000: ");
        XuatMang(a, n);
        System.out.println("");
        int n2 = 10000;
        int[] a1 = new int[n2];
        NhapMang(a1,n2);
        System.out.println("Nội dung mảng 10000: ");
        XuatMang(a1, n2);        
        System.out.println("");
        System.out.println("Nhập phần tử cần tìm:");
        int x = input.nextInt();
        long start = System.nanoTime();
        int y = TimKiem(a, x);
        long end = System.nanoTime();
        long execution = end - start;
        if (y == 1) {
            System.out.println("mảng có phần tử tìm");
        } else {
            System.out.println("mảng không có phần tử cần tìm");
        }
         System.out.println("thời gian tính toán " + execution/ 1000 + " microsecond");
         
        long start1 = System.nanoTime();
        int z = TimKiem(a1, x);
        long end1 = System.nanoTime();
        long execution1 = end1 - start1;
        if (z == 1) {
            System.out.println("mảng có phần tử tìm");
        } else {
            System.out.println("mảng không có phần tử cần tìm");
        }
         System.out.println("thời gian tính toán " + execution1/ 1000 + " microsecond");
    }
}
