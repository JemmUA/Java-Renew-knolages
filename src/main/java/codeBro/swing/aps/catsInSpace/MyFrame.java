package codeBro.swing.aps.catsInSpace;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    final static int FRAME_WIDTH = 900;
    final static int FRAME_HEIGHT = 600;

    MyFrame() {

        panel = new MyPanel();
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Cats in space");
        this.setResizable(false);
    }
}
