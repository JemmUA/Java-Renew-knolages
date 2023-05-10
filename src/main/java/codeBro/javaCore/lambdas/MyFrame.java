package codeBro.javaCore.lambdas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton button;
    JButton button2;

    MyFrame() {
        button = new JButton("BIG button");
        button.setBounds(0, 0, 200, 50);
        button.setFocusable(false);
        button2 = new JButton("Second BIG button");
        button2.setBounds(0, 0, 200, 50);
        button2.setFocusable(false);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Here is a button. What now?");
//            }
//        });

        button.addActionListener((e)->System.out.println("Here is a button. I used Lambda! What now?"));
        button2.addActionListener((e) -> System.out.println("easy"));


        this.add(button);
        this.add(button2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
