
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
public class tongquatphepnhan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thu 1:");
        int x = sc.nextInt();
        System.out.println("nhap so thu 2:");
        int y = sc.nextInt();
        int doDai = 10;
        int[] i = new int[doDai];
        System.out.println("-----------");
        System.out.println("   " + x);
        System.out.println("X");
        System.out.println("   " + y);
        for (int n = 1; n < doDai; n++) {
            i[n] = (y % 10 ^ (n - 1)) / 10 ^ (n - 1);
            System.out.println("    " + (i[n] * x));
        }
        System.out.println("-----------");
        System.out.println(x * y);

    }

}
