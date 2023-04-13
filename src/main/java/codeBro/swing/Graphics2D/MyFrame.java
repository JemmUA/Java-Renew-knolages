package codeBro.swing.Graphics2D;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;
        MyFrame() {
            panel = new MyPanel();

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(400, 400);
            this.setLocationRelativeTo(null);

            this.add(panel);
            this.pack();
            this.setVisible(true);
    }


}
