package codeBro.javaCore.namelessObjects;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        JLabel Label1 = new JLabel();
//        new JLabel();



        JFrame frame = new JFrame();
        ArrayList<JLabel> deck = new ArrayList<>();

        ImageIcon icon = new ImageIcon();
        for (int i = 0; i < 67; i++) {
            deck.add(new JLabel(new ImageIcon("src/main/resources/cardsNsmall/ ("+i+").png")));
            frame.add(deck.get(i));
        }

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1260, 650);
        frame.setLayout(new FlowLayout());
//        frame.pack();
        frame.setVisible(true);


    }
}
