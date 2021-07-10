/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Sinh ra mảng số nguyên ngẫu nhiên 1tr phần tử, 
//tìm và in ra phần tử có tần số xuất hiện lớn nhất trong mảng, nếu có nhiều thì chỉ cần in ra 1 là được
package B4;

import B1.b1;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class b3 {

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

    //dem so lan xuat hien cua x trong A
   public static int Count(int A[], int n, int x) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == x) {
                temp++;
            }
        }
        return temp;
    }
//tim phan tu xuat hien nhat lan nhat trong A

    public static int Count(int A[], int n) {
        int temp1, temp = Count(A, n, A[0]), index = 0;
        for (int i = 1; i < n; i++) {
            temp1 = Count(A, n, A[i]);
            if (temp < temp1) {
                temp = temp1;
                index = i;
            }
        }
        return A[index];
    }

    public static void main(String[] args) {
        b1 ob = new b1();
        Scanner input = new Scanner(System.in);
        int n = 1000000;
        int[] a = new int[n];
        NhapMang(a, n);
        System.out.println("Nội dung mảng: ");
        XuatMang(a, n);
        System.out.println("");
        System.out.println("Phần tử xuất hiện nhiều nhất " + Count(a,n));

    }
}
