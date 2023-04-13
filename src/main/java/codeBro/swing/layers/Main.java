package codeBro.swing.layers;

import javax.swing.*;
import java.awt.*;

public class Main {
    // JLayeredPane =   Swing container that provides a
    //                  third dimension for positioning components
    //                   ex. depth, Z-index

    public static void main(String[] args) {

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(20, 50, 180, 80);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(40, 100, 180, 80);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(60, 150, 180, 80);

        JLabel label4 = new JLabel();
        label4.setOpaque(true);
        label4.setBackground(Color.CYAN);
        label4.setBounds(80, 200, 180, 80);

        JLabel label5 = new JLabel();
        label5.setOpaque(true);
        label5.setBackground(Color.MAGENTA);
        label5.setBounds(100, 250, 180, 80);

        JLabel label6 = new JLabel();
        label6.setOpaque(true);
        label6.setBackground(Color.PINK);
        label6.setBounds(120, 10, 50, 400);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); // !
        frame.setVisible(true);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setOpaque(false);
        layeredPane.setBounds(0, 0, 500, 500);
        frame.add(layeredPane);
//        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);// Integer.valueOf<=0
//        layeredPane.add(label2, JLayeredPane.PALETTE_LAYER);// Integer.valueOf<=100
//        layeredPane.add(label3, JLayeredPane.MODAL_LAYER);// Integer.valueOf<=200
//        layeredPane.add(label4, JLayeredPane.POPUP_LAYER);// Integer.valueOf<=300
//        layeredPane.add(label5, JLayeredPane.DRAG_LAYER);// Integer.valueOf<=400
        layeredPane.add(label1, Integer.valueOf(1));
        layeredPane.add(label2, Integer.valueOf(3));
        layeredPane.add(label3, Integer.valueOf(2));
        layeredPane.add(label4, Integer.valueOf(111));
        layeredPane.add(label5, Integer.valueOf(4));
        layeredPane.add(label6, Integer.valueOf(110));
    }
}