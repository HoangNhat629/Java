
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Jframe3 extends JFrame implements KeyListener {

    public Jframe3() {
//        addKeyListener(this);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);
       JButton b = new JButton();
        b.setBounds(20, 50, 100, 50);
        ImageIcon Icon = new ImageIcon("src\\images\\cross.png");
        b.setIcon(Icon);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("hello");
            }
        });
        add(b);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval(50, 90, 100, 100);

    }

    public static void main(String[] args) {
        Jframe3 a = new Jframe3();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                System.out.println("up");
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("down"); 
                
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("right");
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("left");
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
