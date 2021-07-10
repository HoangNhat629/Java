
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
public class btapmang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doDai = 10; // == a.leghth
        int[] a = new int[doDai];
        for (int n = 0; n < doDai; n++) {
            System.out.println("phan tu thu " + n + " la ");
            a[n] = sc.nextInt();
        }
        for (int index = 0; index < doDai; index++) {
            System.out.println("Phan tu mang A tai vi tri " + index + " la " + a[index]);
        }
        int dem = 0;
        System.out.println("nhap phan tu can tim");
        int key = sc.nextInt();
        System.out.println("da tim thay " + key + " o vi tri ");       
        for (int i = 0; i < doDai; i++) {
            if (a[i] == key) {
                System.out.println("tim thay tai vi tri " + i);
                dem = dem + 1;
            }
        }
        if (dem == 0) {
            System.out.println("k tim thay");
        } else {
            System.out.println("tim thay " + dem + " kqua");
        }      // flag 
        int[] data = new int[doDai];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            data[i] = -1;
        }
        for (int i = 0; i < doDai; i++) {
            if (a[i] == key) {
                data[count] = i;
                count++;
            }

            System.out.println("Tim thay " + key + " o vi tri: ");
            for (int j = 0; j < doDai; j++) {
                if (j < doDai - 1) {
                    if (data[j + 1] == -1) {
                        System.out.print("a[" + data[j] + "]");
                        break;
                    } else {
                        System.out.print("a[" + data[j] + "],");
                    }
                }
            }

        }

    }
}
