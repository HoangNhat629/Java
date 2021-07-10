
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
public class songuyento2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap vao so n :");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int dem = 0;
            // thuc hien dem ươc cua i
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dem = dem + 1;
                }
            }
            if (dem == 2) {
                System.out.println("cac so ngto nho hon" + n + " la :" + i);
            }
             
        }
    }

}
