package codeBro.swing.catsInSpace;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image cat;
    Image cat2;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 2;
    int x2Velocity = 2;
    int y2Velocity = 3;
    int x = 0;
    int y = 0;
    int x2 = 100;
    int y2 = 400;


    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        cat = new ImageIcon("src/main/java/codeBro/swing/resources/catti2.png").getImage();
        cat2 = new ImageIcon("src/main/java/codeBro/swing/resources/catti2.png").getImage();
        backgroundImage = new ImageIcon("src/main/java/codeBro/swing/resources/deepspace.jpg").getImage();
        timer = new Timer(10, this);
        timer.start();

    }

    public void paint(Graphics g) {
        super.paint(g); // paint background
        Graphics g2D = (Graphics) g;
        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(cat, x, y, null);
        g2D.drawImage(cat2, x2, y2, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - cat.getWidth(null) || x < 0) {
            xVelocity *= -1;
        }
        if (y >= PANEL_HEIGHT - cat.getHeight(null) || y < 0) {
            yVelocity *= -1;
        }
        if (x2 >= PANEL_WIDTH - cat.getWidth(null) || x2 < 0) {
            x2Velocity *= -1;
        }
        if (y2 >= PANEL_HEIGHT - cat.getHeight(null) || y2 < 0) {
            y2Velocity *= -1;
        }
        x += xVelocity;
        y += yVelocity;
        x2 += x2Velocity;
        y2 += y2Velocity;
//        System.out.println(y);
        repaint();

    }
}
