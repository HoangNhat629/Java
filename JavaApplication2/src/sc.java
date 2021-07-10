
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
class sc {public static void main(String[] args){
    double aa,bb,cc;
    double result;
    System.out.println("Nhap vao a");
    aa = sc.nextDouble();
    System.out.println("Nhap vao b:");
    bb = sc.nextDouble();
    System.out.println("Nhap vao c:");
    cc = sc.nextDouble();
    result = (cc - bb)/aa;
    System.out.println("ket qua la:"+result);
     Scanner sc = new Scanner(System.in);
}

    private static double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
