package codeBro.swing.animation;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;

    MyFrame() {
        panel = new MyPanel();
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Cats in space");
        this.setResizable(false);
    }
}
