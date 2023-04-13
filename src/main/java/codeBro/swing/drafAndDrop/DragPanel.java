package codeBro.swing.drafAndDrop;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon image = new ImageIcon("src/main/java/codeBro/swing/resources/s1.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPT;

    DragPanel() {
        imageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.setBackground(Color.blue);
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this, g, imageCorner.x, imageCorner.y);

    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPT = e.getPoint();
        }

    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPT = e.getPoint();
            imageCorner.translate(
                    currentPT.x - prevPT.x,
                    currentPT.y - prevPT.y);
            prevPT = currentPT;
            repaint();
        }
    }
}
