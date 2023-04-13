package codeBro.swing.openNewWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow{
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello! New window is here!");
    NewWindow(){

        label.setBounds(20, 20, 300, 30);
        label.setFont(new Font("Courier", Font.BOLD, 20));
        label.setForeground(Color.BLUE);
        label.setBackground(Color.green);
        label.setOpaque(true);
        label.setFont(new Font(null, Font.PLAIN, 20));


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setBackground(Color.green);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
    }
}
