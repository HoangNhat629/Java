
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
public class s1 {

    public static void main(String[] args) {

        //Input: 1 so tu nhien bat ki
        //output; moi so chan nho hon so tu nhien do
        int a;
        System.out.println("nhap vao so tu nhien a :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                System.out.println("cac so chan nho hon a la" + i);
            }
        }
        // input 1 so tu nhien
        // output 1 2 3 4 6 12
        // tim tat ca uoc cua so day
        int b;
        System.out.println("nhap vao so tu nhien b :");
        b = sc.nextInt();
        for (int j = 1; j < b; j++) {
            if ( b % j == 0 ) {
                System.out.println("uoc cua" + b + " la : " + j);
            }
        }

    }

}
