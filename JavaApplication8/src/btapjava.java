/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class btapjava {

    public static void main(String[] args) {
        int[] A = {1, 23, 4, 5, 23, 6};
        int tong = tong(A);
        System.out.println(tong);
        int i = 6;
        boolean check = ktraSoChan(i);
        System.out.println(check);
        char[] a = {'a', 'x', 'v', 'c', 'd'};
        char[] b = Arrange(a);
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + "\t");
        }
    }

    static int tong(int[] A) {
        int sum = 0;
        for (int i = 1; i < A.length; i++) {
            sum = sum + A[i];
        }
        return sum;
    }

    static boolean ktraSoChan(int i) {
        boolean flag;
        if (i % 2 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    static char[] Arrange(char[] a) {
        char temp;
        for (int k = 0; k < a.length; k++) {
            for (int i = 0; i < a.length - 1; i++) {
                if ((int) a[i] > (int) a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        return a;
    }
}
