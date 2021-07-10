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
public class b3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(1000000);
        }
        System.out.println("Nội dung mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }
        System.out.println("");
        int[] l = new int[n];
        l[0] = 1;
        int lmax;
        for (int i = 1; i < n; i++) {
            lmax = 0;
            int jmax = 0;
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    if (l[j] > lmax) {
                        lmax = l[j];
                        jmax = j;
                    }
                }
            }
            l[i] = lmax + 1;
            b[i] = jmax;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + l[i]);
        }
        int lengthMax = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > lengthMax) {
                lengthMax = l[i];
            }
        }
        System.out.println("");
        System.out.println("do dai max: " + lengthMax);
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + b[i]);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > l[max]) {
                max = i;
            }
        }
        System.out.println("");
        while (true) {
            int i = max;
            System.out.print("dãy tăng có độ dài lớn nhất: " + a[i]);
            max = b[i];
            if (b[max] == 0) {
                System.out.println("\t"+a[max]);
                break;
            }
        }
    }

}
