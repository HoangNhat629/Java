
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class mang {

    public static void main(String[] args) {
        int doDai = 10; // == a.leghth
        int[] a = new int[doDai];
        a[5] = 9;
        for (int index = 0; index < doDai; index++) {
            a[index] = index;
            System.out.println("phan tu mang A tai vi tri " + index + " la " + a[index]);
        }

    }

}
