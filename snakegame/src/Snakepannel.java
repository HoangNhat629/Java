/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class Snakepannel extends JFrame {

    private int d;

    public Snakepannel(int map) {
        System.out.println(map);
        boolean food = false;
        boolean flag = false;
        this.setBackground(Color.BLACK);
        int[][] matrix = new int[main.y / main.moi][main.x / main.moi];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    matrix[i][j] = 1;
                } else if (i == matrix.length - 1) {
                    matrix[i][j] = 1;
                } else if (j == 0) {
                    matrix[i][j] = 1;
                } else if (j == (matrix[i].length - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        if (map == 1) {
            int b = matrix.length - 20;
            for (int i = 11; i < matrix[0].length - 11; i++) {
                matrix[b][i] = 1;
            }
        } else if (map == 2) {
            int a = 10;
            int b = matrix.length - 10;
            for (int i = 12; i < matrix[0].length - 12; i++) {
                matrix[a][i] = 1;
                matrix[b][i] = 1;
            }
            for (int j = a; j <= b; j++) {
                for (int k = 5; k < 6; k++) {
                    matrix[j][matrix[0].length - 5] = 1;
                    matrix[j][k] = 1;
                }
            }
        }
    }

    public void setMatrix(int i, int j, int num) {
        int[][] matrix = null;
        matrix[i][j] = num;
    }

    public int getMatrix(int i, int j) {
        int[][] matrix = null;
        return matrix[i][j];
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getD() {
        return this.d;
    }

    protected void paintCompomnent(Graphics g) {
        
    }
}
