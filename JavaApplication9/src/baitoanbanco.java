
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
public class baitoanbanco {

    static int x, y; //toa do quan co
    static int endX, endY; //vi tri ket thuc cua quan co
    static final int LENGTH = 5;//FINAL de co dinh do dai = 5

    public static void main(String[] args) {
        endX = (int) (Math.random() * LENGTH);
        endY = (int) (Math.random() * LENGTH);
        //Math.random() =>return 0.0 <= float value < 1
        x = 2;
        y = 2;
        while (true) {
            show();
            String vuaNhap = input();
            move(vuaNhap);
            boolean ketqua = check();
            if (ketqua == true) {
                System.out.println("WIN");
                break;
            }
        }
    }

    static void show() {
        for (int YY = 0; YY < LENGTH; YY++) {
            for (int XX = 0; XX < LENGTH; XX++) {
                if (YY == x && XX == y) {
                    System.out.print(" X ");
                } else if (YY == endX && XX == endY) {
                    System.out.print(" O ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }
    }

    static String input() {
        System.out.println("Nhap Vao: TRAI PHAI TREN DUOI");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

//    static char inputACharacter() {
//        Scanner sc = new Scanner(System.in);//nhap vao  1 ki tu
//        String input = sc.nextLine();
//        System.out.println("INPUT" + input);
//        char firstCharacter = input.charAt(0);
//        System.out.println("firstCharacter" + firstCharacter);
//        return firstCharacter;
//    }
    static void move(String vuaNhap) {// tao ham di chuyen
        switch (vuaNhap) {
            case "TRAI":
                if (x > 0) {
                    x = x - 1;
                }
                break;
            case "PHAI":
                if (x < LENGTH - 1) {
                    x = x + 1;
                }
                break;
            case "TREN":
                if (y > 0) {
                    y = y - 1;
                }
                break;
            case "DUOI":
                if (y < LENGTH - 1) {
                    y = y + 1;
                }
                break;
            default:
                System.out.println("ki tu k hop le");
        }
    }

    private static boolean check() {
        boolean ketqua = true;
        if (y == endY && x == endX) {
            ketqua = true;
        } else {
            ketqua = false;
        }
        return ketqua;
    }

}
