
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class maingame extends JPanel implements KeyListener, ActionListener {

    private int[] snakeXlength = new int[750];
    private int[] snakeYlength = new int[750];
    
    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;
    
    private ImageIcon rightmouth;
    private ImageIcon leftmouth;
    private ImageIcon upmouth;
    private ImageIcon downmouth;
    
    private int lengthofsnake = 3;
    
    private Timer timer;
    private int delay = 100;
    private ImageIcon snakeimage;
    private int[] enemyxpos = {25, 50, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475, 500, 525, 550, 575, 600, 625, 650, 675, 700, 725, 750, 775, 800, 825, 850};
    private int[] enemyypos = {75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475, 500, 525, 550, 575, 600, 625};
    private ImageIcon enemyimage;
    private Random random = new Random();
    private int xpos = random.nextInt(34);
    private int ypos = random.nextInt(23);
    private int score = 0;
    private int moves = 0;
    private ImageIcon titleImage;

    public maingame() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    public void paint(Graphics b) {
        if (moves == 0) {
            snakeXlength[2] = 50;
            snakeXlength[1] = 75;
            snakeXlength[0] = 100;

            snakeYlength[2] = 100;
            snakeYlength[1] = 100;
            snakeYlength[0] = 100;
        }
        // draw title image border
        b.setColor(Color.white);
        b.drawRect(24, 10, 551, 55);
        // draw title image
        titleImage = new ImageIcon("src\\images\\ig.png");
        titleImage.paintIcon(this, b, 25, 11);
        //draw border for maingame
        b.setColor(Color.WHITE);
        b.drawRect(24, 74, 851, 577);
        //draw background for the maingame
        b.setColor(Color.black);
        b.fillRect(25, 75, 850, 575);
        //draw scores
        b.setColor(Color.white);
        b.setFont(new Font("arial", Font.PLAIN, 14));
        b.drawString("Scores:   " + score, 780, 30);
        //draw length
        b.setColor(Color.white);
        b.setFont(new Font("arial", Font.PLAIN, 14));
        b.drawString("Length:   " + lengthofsnake, 780, 50);
        //draw snake
        rightmouth = new ImageIcon("src\\images\\right.png");
        rightmouth.paintIcon(this, b, snakeXlength[0], snakeYlength[0]);
        for (int i = 0; i < lengthofsnake; i++) {
            if (i == 0 && right) {
                rightmouth = new ImageIcon("src\\images\\right.png");
                rightmouth.paintIcon(this, b, snakeXlength[i], snakeYlength[i]);

            }
            if (i == 0 && up) {
                upmouth = new ImageIcon("src\\images\\up.png");
                upmouth.paintIcon(this, b, snakeXlength[i], snakeYlength[i]);
            }
            if (i == 0 && down) {
                downmouth = new ImageIcon("src\\images\\down.png");
                downmouth.paintIcon(this, b, snakeXlength[i], snakeYlength[i]);
            }
            if (i == 0 && left) {
                leftmouth = new ImageIcon("src\\images\\left.png");
                leftmouth.paintIcon(this, b, snakeXlength[i], snakeYlength[i]);
            }
            if (i != 0) {
                snakeimage = new ImageIcon("src\\images\\than.png");
                snakeimage.paintIcon(this, b, snakeXlength[i], snakeYlength[i]);
            }
        }
        enemyimage = new ImageIcon("src\\images\\than.png");
        if (enemyxpos[xpos] == snakeXlength[0] && enemyypos[ypos] == snakeYlength[0]) {
            score++;
            lengthofsnake++;
            xpos = random.nextInt(34);
            ypos = random.nextInt(23);
        }
        enemyimage.paintIcon(this, b, enemyxpos[xpos], enemyypos[ypos]);

        for (int i = 1; i < lengthofsnake; i++) {
            if (snakeXlength[i] == snakeXlength[0] && snakeYlength[i] == snakeYlength[0]) {
                right = false;
                up = false;
                left = false;
                down = false;
                b.setColor(Color.white);
                b.setFont(new Font("arial", Font.BOLD, 50));
                b.drawString("GAME OVER", 300, 300);
                
                b.setFont(new Font("arial", Font.BOLD, 20));
                b.drawString("SPACE to RESTART", 350, 340);
            }

        }

        b.dispose();

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
            moves = 0;
            score = 0;
            lengthofsnake = 3;
            repaint();
        }
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            moves++;
            right = true;
            if (!left) {
                right = true;
            } else {
                right = false;
                left = true;
            }
            up = false;
            down = false;
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            moves++;
            left = true;
            if (!right) {
                left = true;
            } else {
                left = false;
                right = true;
            }
            up = false;
            down = false;
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            moves++;
            up = true;
            if (!down) {
                up = true;
            } else {
                up = false;
                down = true;
            }
            right = false;
            left = false;
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            moves++;
            down = true;
            if (!up) {
                down = true;
            } else {
                down = false;
                up = true;
            }
            right = false;
            left = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        timer.start();
        if (right) {
            for (int i = lengthofsnake - 1; i >= 0; i--) {
                snakeYlength[i + 1] = snakeYlength[i];
            }
            for (int i = lengthofsnake - 1; i >= 0; i--) {
                if (i == 0) {
                    snakeXlength[i] = snakeXlength[i] + 25;
                } else {
                    snakeXlength[i] = snakeXlength[i - 1];
                }
                if (snakeXlength[i] > 850) {
                    snakeXlength[i] = 25;
                }
            }
            repaint();
        }
        if (left) {
            for (int i = lengthofsnake - 1; i >= 0; i--) {
                snakeYlength[i + 1] = snakeYlength[i];
            }
            for (int i = lengthofsnake - 1; i >= 0; i--) {
                if (i == 0) {
                    snakeXlength[i] = snakeXlength[i] - 25;
                } else {
                    snakeXlength[i] = snakeXlength[i - 1];
                }
                if (snakeXlength[i] < 25) {
                    snakeXlength[i] = 850;
                }
            }
            repaint();
        }
        if (down) {
            for (int i = lengthofsnake - 1; i >= 0; i--) {
                snakeXlength[i + 1] = snakeXlength[i];
            }
            for (int i = lengthofsnake - 1; i >= 0; i--) {
                if (i == 0) {
                    snakeYlength[i] = snakeYlength[i] + 25;
                } else {
                    snakeYlength[i] = snakeYlength[i - 1];
                }
                if (snakeYlength[i] > 625) {
                    snakeYlength[i] = 75;
                }
            }
            repaint();
        }
        if (up) {
            for (int i = lengthofsnake - 1; i >= 0; i--) {
                snakeXlength[i + 1] = snakeXlength[i];
            }
            for (int i = lengthofsnake - 1; i >= 0; i--) {
                if (i == 0) {
                    snakeYlength[i] = snakeYlength[i] - 25;
                } else {
                    snakeYlength[i] = snakeYlength[i - 1];
                }
                if (snakeYlength[i] < 75) {
                    snakeYlength[i] = 625;
                }
            }
            repaint();
        }
    }

    private void addKeyListener() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
