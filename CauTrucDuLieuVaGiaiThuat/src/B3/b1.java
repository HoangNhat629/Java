/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3;
//Tìm phần tử có giá trị x có xuất hiện trong dãy  bằng đệ quy
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class b1 {

    static int timso(int[] arr, int s, int e, int x) {
        if (e < s) {
            return 1;
        }
        if (arr[s] == x) {
            return s;
        }
        if (arr[e] == x) {
            return e;
        }
        return timso(arr, s + 1, e - 1, x);
    }

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n;
        int k;
        System.out.print("Số phần tử của mảng: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(n);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println("");
        System.out.println("Số cần kiểm tra: ");
        k = sc.nextInt();
        int a = timso(arr, 0, n - 1, k);
        if (a != 1) {
            System.out.println(k + " thuộc dãy");
        } else {
            System.out.println(k + " khong thuoc day");
        }

    }

}
