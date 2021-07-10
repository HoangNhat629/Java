/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toanroirac;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class HonNhanBenVung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v;
        System.out.print("So cap nam nu can ghep cap la: ");
        v = sc.nextInt();
        int[][] A = new int[v][v];
        int[][] B = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print("do uu tien chang trai " + i + " doi voi co gai : ");
                A[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print("do uu tien co gai " + i + " doi voi chang trai : ");
                B[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("do uu tien cua cac co gai voi cac chang trai:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("do uu tien cua cac chang trai voi cac co gai:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();

        }
        int[][] result = HNBV(A, B, v);
        System.out.println("cac cap doi phu hop");
        System.out.println(Arrays.deepToString(result));

    }

    private static int[][] HNBV(int[][] A, int[][] B, int v) {
        int[] fallInLove = new int[v];
        int[][] ranking = new int[v][v];
        int[] next = new int[v];
        Queue<Integer> freeMan = new LinkedList<>();
        Arrays.fill(fallInLove, -1);
        Arrays.fill(next, 0);

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                ranking[i][B[i][j]] = j;
            }
        }
        for (int i = 0; i < v; i++) {
            freeMan.add(i);
        }
        int m, w;
        while (!freeMan.isEmpty()) {

            m = freeMan.peek().intValue();
            w = A[m][next[m]++];
            if (fallInLove[w] == -1) {

                fallInLove[w] = m;
                freeMan.poll();

            } else {
                if (ranking[w][m] < ranking[w][fallInLove[m]]) {

                    freeMan.poll();
                    freeMan.add(fallInLove[w]);
                    fallInLove[w] = m;
                }
            }
        }
        int[][] caccapdoiphuhop = new int[v][2];
        for (int i = 0; i < v; i++) {
            caccapdoiphuhop[i][0] = fallInLove[i];
            caccapdoiphuhop[i][1] = i;
        }

        return caccapdoiphuhop;
    }
}
