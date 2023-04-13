package codeBro.swing.flowLayouts;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Layout manager = Defines the natural layout for components within a container

        // FlowLayout =     places components in a row, sized at their preferred size.
        //                  If the horizontal space in the container is too small,
        //                  the FlowLayout class uss the next available row.


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.blue);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));

//        JButton button1 = new JButton();
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));

        frame.add(panel);
        frame.setVisible(true);

    }
}
