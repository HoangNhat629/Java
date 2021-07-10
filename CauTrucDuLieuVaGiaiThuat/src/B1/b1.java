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
public class b1 {

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

    // Hàm sắp xếp nổi bọt
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //Sắp xếp lựa chọn – selection sort
    void sort(int arr[]) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        b1 ob = new b1();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = input.nextInt();
        int[] a = new int[n];
        NhapMang(a, n);
        System.out.println("Nội dung mảng: ");
        XuatMang(a, n);
        System.out.println("");
        // get the start time
        long start1 = System.nanoTime();
        ob.bubbleSort(a);
        // get the end time
        long end1 = System.nanoTime();
        System.out.println("Mảng sau khi sắp xếp 1:");
        XuatMang(a, n);
        // execution time
        long execution = end1 - start1;
        System.out.println("");
        System.out.println("thời gian tính toán " + execution / 1000 + " microsecond");
        // get the start time
        long start2 = System.nanoTime();
        ob.sort(a);
        // get the end time
        long end2 = System.nanoTime();
        long execution1 = end2 - start2;
        System.out.println("Mảng sau khi sắp xếp 2:");        
        XuatMang(a, n);
        System.out.println("");
        System.out.println("thời gian tính toán " + execution1 / 1000 + " microsecond");
        if(execution>execution1){System.out.println("thời gian tính toán theo selection sort nhanh hơn");}
        else{System.out.println("thời gian tính toán theo bubbleSort nhanh hơn ");}
    }
}
