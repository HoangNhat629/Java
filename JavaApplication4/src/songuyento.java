
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
public class songuyento {

    public static void main(String[] args) {
        int b, dem;
        System.out.println("nhap b :");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        dem = 0;
        for (int j = 1; j <= b; j++) {
            if (b % j == 0) {
                dem = dem + 1;
            }
        }
        if (dem == 2) {
            System.out.println("so day la so ngto");
        } else {
            System.out.println("so day k la so nguyen to");
        }
    }
}
