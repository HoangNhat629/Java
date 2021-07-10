/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class function2 {

    static boolean checkSNT(int a) {
        boolean flag = true;
        int dem = 0;
        for (int j = 1; j <= a / 2; j++) {
            if (a % j == 0) {
                dem = dem + 1;
            }
        }
        if (dem == 1) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        int a = 7;
        boolean check = checkSNT(a);
        System.out.println(check);
    }
}
