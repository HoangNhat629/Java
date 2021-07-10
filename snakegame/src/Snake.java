
import java.awt.Point;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Snake {

    private int doDai;
    private Point[] point;
    private int length;

    public Snake() {
        doDai = 3;
    }

    public int getLength() {
        return doDai;
    }
    public void setLength ( int length){
    this. length = length;  
    }
}
