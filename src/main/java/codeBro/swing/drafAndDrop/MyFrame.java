package codeBro.swing.drafAndDrop;

import javax.swing.*;

public class MyFrame extends JFrame {
    DragPanel panel;
    MyFrame() {
        panel = new DragPanel();

        this.add(panel);
        this.setTitle("Drag and drop");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setVisible(true);
    }

}
