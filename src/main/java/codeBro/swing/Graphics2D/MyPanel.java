package codeBro.swing.Graphics2D;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image image;
    MyPanel() {
        this.setPreferredSize(new Dimension( 400, 400));
        image = new ImageIcon("src/main/java/codeBro/swing/resources/cars_1.jpg").getImage();

    }
    public void paint(Graphics g) {
        Graphics2D g2D= (Graphics2D) g;

        g2D.drawImage(image, 0 , 0 , null);
        g2D.setPaint(Color.red);
        g2D.setStroke(new BasicStroke(5));
//        g2D.drawLine(0, 0, 400, 400);
//        g2D.drawRect(0, 0, 100, 200);
//        g2D.fillRect(5, 5, 90, 190);

//        g2D.setPaint(Color.orange);
//        g2D.drawOval(0, 0, 100, 100);
//        g2D.fillOval(0, 0, 100, 100);

//        g2D.drawArc(0, 0, 100, 100, 90,120);
//        g2D.fillArc(0, 0, 100, 100, 180,180);
//
//        g2D.setPaint(Color.white);
//        g2D.fillArc(0, 0, 100, 100, 0,180);

//        g2D.setPaint(Color.green);
//        int[] xPoints = {150, 250, 350};
//        int[] yPoints = {300, 150, 300};
//        g2D.drawPolygon(xPoints, yPoints, 3);
//        g2D.fillPolygon(xPoints, yPoints, 3);

        g2D.setFont(new Font("Ink free", Font.BOLD, 40));
        g2D.drawString("You are the best", 50, 390);


    }
}
