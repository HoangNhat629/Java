/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class tree {

    public static void main(String[] args) {
        int i, j, v, e, min, x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("so dinh cua cay la: ");
        v = sc.nextInt();
        e = v - 1;
        int[][] edge = new int[e][2];
        int[] deg = new int[v + 1];
        System.out.println(v + " co " + e + " canh ");
        System.out.println("nhap cac cap dinh cua cay");
        for (i = 0; i < e; i++) {
            System.out.println("nhap cap dinh cho canh " + (i + 1) + " :");
            System.out.println("V(1): ");
            edge[i][0] = sc.nextInt();
            System.out.println("V(2): ");
            edge[i][1] = sc.nextInt();

            deg[edge[i][0]]++;
            deg[edge[i][1]]++;
        }
        System.out.println("Prufer code cua cay la :");
        for (i = 0; i < v - 2; i++) {
            min = 10000;
            for (j = 0; j < e; j++) {
                if (deg[edge[j][0]] == 1) {
                    if (min > edge[j][0]) {
                        min = edge[j][0];
                        x = j;
                    }
                }
                if (deg[edge[j][1]] == 1) {
                    if (min > edge[j][1]) {
                        min = edge[j][1];
                        x = j;
                    }
                }
            }
            deg[edge[x][0]]--;
            deg[edge[x][1]]--;
            if (deg[edge[x][0]] == 0) {
                System.out.println("(" + edge[x][1] + ")");
            } else {
                System.out.println("(" + edge[x][0] + ")");
            }
        }
    }

}
