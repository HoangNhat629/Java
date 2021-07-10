
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
public class lesson2 {

    public static void main(String[] args) {
        boolean TF = true;
        if (3 >= 4) { //x = -b/(2*a)
            // toan tu so sanh: int float char byte long
            // > < >= <= == !=
            System.out.println("condition is TRUE");
        } else {
            System.out.println("condition is FALSE");
        }
        int n = -5;
        String k;
        k = n > 0 ? (" N lon hon 0") : ("N nho bang 0");
        System.out.println(k);
        int aa = 3;
        int bb = 2;
        System.out.println(aa > bb ? (aa + ">" + bb) : (aa + "<" + bb));
        //k = ( (conditon) ?  (true value) : (false value);
        // alt shift F format code
        System.out.println("FOR LOOPS");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("condese");
        }
        int i = 0;

        for (;;) {
            System.out.println("gia tri cua i là:" + i);
            i++;
            if (i > 15) {
                break;// for, while, do-while,switch-case}
            }
        }
        int condition = 0;
        while (true) {
            System.out.println("ok");
            condition = new Scanner(System.in).nextInt();
            if (condition == 9) {
                break;
            } else {
                System.out.println("so vua nhap khong phai 9");
            }

        }
    }
}
