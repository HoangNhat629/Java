
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
public class baitoantomau {

    public static void main(String[] args) {
        int v, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("so dinh cua cay la: ");
        v = sc.nextInt();
        e = v - 1;
        int[][] edge = new int[e][2];

        System.out.println(v + " co " + e + " canh ");
        System.out.println("nhap cac cap dinh cua cay");
        for (int i = 0; i < e; i++) {
            System.out.println("nhap cap dinh cho canh " + (i + 1) + " :");
            System.out.println("V(1): ");
            edge[i][0] = sc.nextInt();
            System.out.println("V(2): ");
            edge[i][1] = sc.nextInt();
        }

        int[][] A = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (i < e) {
                    A[edge[i][0]][edge[i][1]] = 1;
                    A[edge[i][1]][edge[i][0]] = 1;
                }
            }
        }
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(A[i][j] + "\t");

            }
            System.out.println("");
        }

        int[] M = new int[v];
        int sm = 0, kt;
        for (int i = 0; i < v; i++) {
            if (M[i] == 0) {
                sm++;
                M[i] = sm;
                for (int j = i + 1; j < v; j++) {
                    if ((A[i][j] == 0) && (M[j] == 0)) {
                        kt = 1;
                        for (int k = i + 1; k < j; k++) {
                            if ((A[k][j] == 1) && (M[i] == M[k])) {
                                kt = 0;
                                break;
                            }
                        }
                        if (kt == 1) {
                            M[j] = sm;
                        }

                    }
                }
            }
        }
        for (int i = 1; i <= sm; i++) {
            System.out.print("Mau " + i + ": ");
            for (int j = 0; j < v; j++) {
                if (M[j] == i) {
                    System.out.print(j + "\t");
                }
            }
            System.out.println("");
        }
    }
}
