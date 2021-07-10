
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
public class tongcacphantutrongmang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doDai = 10;
        int[] a = new int[doDai];
        int tong = 0;
        for (int i = 0; i < doDai; i++) {
            System.out.println("phan tu thu " + i + " la :");
            a[i] = sc.nextInt();
            tong = tong + a[i];

        }

        System.out.println("tong cac phan tu trong mang la :" + tong);
        for (int j = 0; j < doDai; j++) {
            if (j % 2 == 0) {
                System.out.println(" phan tu o vi tri chan :" + a[j]);
            } else {
                System.out.println(" phan tu o vi tri le :" + a[j]);
            }
        }
        int sum = 0;
        for (int n = 0; n < doDai; n++) {
            if (a[n] % 2 == 0) {
                sum = sum + a[n];
                System.out.println("cac phan tu chia het cho 2 : " + a[n]);
            }
        }
        System.out.println("tong cac phan tu chan :" + sum);
        for (int b = 0; b < doDai; b++) {
            if (a[b] % 5 == 1) {
                System.out.println("phan tu can tim la : " + a[b]);
            }
        }
    }
}
