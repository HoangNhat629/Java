/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TinhLamPhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("so chi so lam phat: ");
        a = sc.nextInt();

        float A[][] = new float[a][4];
        float B[][] = new float[a][4];
        float C[][] = new float[a][4];
        float A1[][] = new float[a][4];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3) {
                    A[i][j] = 0;
                } else {
                    System.out.print("A[" + i + "," + j + "] = ");
                    A[i][j] = sc.nextFloat();
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println();

        float OWAWA = Owawa(A, B, C, a);

        System.out.println("Owawa = " + OWAWA);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 2) {
                    System.out.print("A1[" + i + "," + j + "] = ");
                    A1[i][j] = sc.nextFloat();
                } else {
                    A1[i][j] = A[i][j];
                }
            }
        }
        float HOWAWA = Howawa(B, C, A1, a);
        System.out.println("Howawa = " + HOWAWA);

        int[] U = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.print("U[" + i + "]: ");
            U[i] = sc.nextInt();
        }
        System.out.print("U = ");
        for (int i = 0; i < a; i++) {
            System.out.print(U[i] + "\t");
        }
        float IOWAWA = Iowawa(A, B, C, U, a);
        System.out.println("Iowawa = " + IOWAWA);

        float IHOWAWA = IHOWAWA(A1, B, C, U, a);
        System.out.println("IHowawa = " + IHOWAWA);

    }

    private static float Owawa(float[][] A, float[][] B, float[][] C, int a) {

        float tg, k;
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (A[i][0] < A[j][0]) {
                    tg = A[i][0];
                    A[i][0] = A[j][0];
                    A[j][0] = tg;

                    k = A[i][2];
                    A[i][2] = A[j][2];
                    A[j][2] = k;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < 3) {
                    B[i][j] = 0;
                } else {
                    B[i][j] = (float) (A[i][0] * (0.4 * A[i][1] + 0.6 * A[i][2]));
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.print("cslp" + "\t");
        System.out.print("tsbd" + "\t");
        System.out.print("tscg" + "\t");
        System.out.print("tslp" + "\t");
        System.out.println("\n");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println();
        float owawa = 0;
        for (int i = 0; i < a; i++) {

            owawa = owawa + C[i][3];

        }

        return owawa;
    }

    private static float Howawa(float[][] B, float[][] C, float[][] A1, int a) {
        float k;
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (A1[i][2] > A1[j][2]) {
                    k = A1[i][2];
                    A1[i][2] = A1[j][2];
                    A1[j][2] = k;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < 3) {
                    B[i][j] = 0;
                } else {
                    B[i][j] = (float) (A1[i][0] * (0.4 * A1[i][1] + 0.6 * A1[i][2]));
                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                C[i][j] = A1[i][j] + B[i][j];
            }
        }
        System.out.print("cslp" + "\t");
        System.out.print("tsbd" + "\t");
        System.out.print("tscg" + "\t");
        System.out.print("tslp" + "\t");
        System.out.println("\n");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println();
        float Howawa = 0;
        for (int i = 0; i < a; i++) {

            Howawa = Howawa + C[i][3];

        }
        return Howawa;
    }

    private static float Iowawa(float[][] A, float[][] B, float[][] C, int[] U, int a) {
        float tg, k;
        int l;
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (U[i] < U[j]) {
                    l = U[i];
                    U[i] = U[j];
                    U[j] = l;

                    tg = A[i][0];
                    A[j][0] = A[i][0];
                    A[j][0] = tg;

                    k = A[i][1];
                    A[j][1] = A[i][1];
                    A[j][1] = k;

                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < 3) {
                    B[i][j] = 0;
                } else {
                    B[i][j] = (float) (A[i][0] * (0.4 * A[i][1] + 0.6 * A[i][2]));
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println();
        System.out.print("cslp" + "\t");
        System.out.print("tsbd" + "\t");
        System.out.print("tscg" + "\t");
        System.out.print("tslp" + "\t");
        System.out.println("\n");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println();
        float Iowawa = 0;
        for (int i = 0; i < a; i++) {

            Iowawa = Iowawa + C[i][3];

        }
        return Iowawa;
    }

    private static float IHOWAWA(float[][] A1, float[][] B, float[][] C, int[] U, int a) {
        float tg, k;
        int l;
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (U[i] < U[j]) {
                    l = U[i];
                    U[i] = U[j];
                    U[j] = l;

                    tg = A1[i][0];
                    A1[j][0] = A1[i][0];
                    A1[j][0] = tg;

                    k = A1[i][1];
                    A1[j][1] = A1[i][1];
                    A1[j][1] = k;

                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < 3) {
                    B[i][j] = 0;
                } else {
                    B[i][j] = (float) (A1[i][0] * (0.4 * A1[i][1] + 0.6 * A1[i][2]));
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                C[i][j] = A1[i][j] + B[i][j];
            }
        }
        System.out.println();
        System.out.print("cslp" + "\t");
        System.out.print("tsbd" + "\t");
        System.out.print("tscg" + "\t");
        System.out.print("tslp" + "\t");
        System.out.println("\n");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println();
        float IHowawa = 0;
        for (int i = 0; i < a; i++) {

            IHowawa = IHowawa + C[i][3];

        }
        return IHowawa;
    }
}
