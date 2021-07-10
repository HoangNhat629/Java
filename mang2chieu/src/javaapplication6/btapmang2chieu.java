
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
public class btapmang2chieu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("nhap phan tu[" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("tong cac phan tu : " + sum);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 3 == 0) {
                    System.out.println("cac so chia het cho 3 : " + arr[i][j]);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int dem = 0;
                for (int k = 1; k <= arr[i][j]; k++) {
                    if (arr[i][j] % k == 0) {
                        dem = dem + 1;
                    }
                }
                if (dem == 2) {
                    System.out.println("cac so nguyen to la : " + arr[i][j]);
                }
            }
        }
    }
}
