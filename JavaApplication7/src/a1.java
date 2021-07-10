
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
public class a1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kich thuc mang :");
        int n = sc.nextInt();
        int[] matrix = new int[n];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("a [" + i + "]");
            matrix[i] = sc.nextInt();
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < matrix.length; i++) {
            int phantuhientai = matrix[i];
            while (phantuhientai / 10 >= 10) {
                phantuhientai = phantuhientai / 10;
            }
            System.out.println(phantuhientai);
            if (phantuhientai % 2 != 0) {
                System.out.println("phan tu dau tien la so le la : " + matrix[i]);
            }
            break; //System.exit(0): dừng hẳn chương trình
            //break : dừng hẳn vòng lặp
        }
        //cach2
        for (int i = 0; i < matrix.length; i++) {
            //String = array of character in ASCII0
            int a = 123;
            String s = String.valueOf(matrix[i]);
            char firstChar = s.charAt(0);//bien matrix[i] thanh Sring
            int value = firstChar - '0';//Interger.valueOf(firstChar);
            if (value % 2 == 1) {
                System.out.println("phan tu dau co phantu dau la so le" + matrix[i]);
            }//end of program = System.exit(0);
        }
    }
}
