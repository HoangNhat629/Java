
import static java.lang.Math.sqrt;
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
public class homeworks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // xet tam giac va tinh dien tich
        System.out.println("nhap so thu nhat");
        int x = sc.nextInt();
        System.out.println("nhap so thu hai");
        int y = sc.nextInt();
        System.out.println("nhap so thu ba");
        int z = sc.nextInt();
        int p, S;
        if ((x + y) > z && (y + z) > x && (z + y) > x) {
            if (x == y || y == z || z == x) {
                System.out.println("3 so da cho tao thanh 1 tam giac deu");
            } else if (x == y && y == z && z == x) {
                System.out.println("3 so da cho tao thanh tam giac deu");
            } else if ((x * x + y * y) == z * z || (z * z + y * y) == x * x || (x * x + z * z) == y * y) {
                System.out.println("3 so da cho tao thanh 1 tam giac vuong");
            } else {
                System.out.println("3 so da cho tao thanh 1 tvam giac thuong");
            }
            p = (x + y + z) / 2;
            S = (int) sqrt(p * (p - x) * (p - y) * (p - z));
            System.out.println("dien tich tam giac la : " + S);
        } else {
            System.out.println("3 so da cho khong tao thanh 1 tam giac");
        }
        // xet toa do M
        System.out.println("nhap toa do M ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("toa do M( " + a + " , " + b + " )");
        if (a > 0 && b > 0) {
            System.out.println("M nam o goc phan tu thu I");
        } else if (a > 0 && b < 0) {
            System.out.println("M nam o goc phan tu thu II");
        } else if (a < 0 && b < 0) {
            System.out.println("M nam o goc phan tu thu III");
        } else if (a < 0 && b > 0) {
            System.out.println("M nam o goc phan tu thu IV");
        }
        //in bang cuu chuong
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int tich = i * j;
                System.out.println(i + "x" + j + "=" + tich);
            }
        }
    }

}
