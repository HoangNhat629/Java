/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class map implements Runnable {
    private int map;
    private int speed;
    public void setMap (int map){this.map = map;}
    public void tocDo (int tocdo){this.speed = tocdo;}

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      new ran (map , speed);
    }
    
}
