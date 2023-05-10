package codeBro.javaCore.anonymousClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame /*implements ActionListener*/ {
    JButton jButton1;
    JButton jButton2;
    JButton jButton3;
    MyFrame(){
        jButton1 = new JButton("Button #1");
        jButton2 = new JButton("Button #2");
        jButton3 = new JButton("Button #3");
        jButton1.setFocusable(false);
        jButton2.setFocusable(false);
        jButton3.setFocusable(false);
        jButton1.setBounds(20, 100, 100, 100);
        jButton2.setBounds(120, 100, 100, 100);
        jButton3.setBounds(220, 100, 100, 100);

        jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("This is super SECRET button #1 with anonymous listener");
            }
        });
        jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("This is super SECRET button #2 with anonymous listener");
            }
        });
        jButton3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("This is super SECRET button #3 with anonymous listener");
            }
        });
//        jButton1.addActionListener(this);
//        jButton2.addActionListener(this);
//        jButton3.addActionListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(jButton1);
        this.add(jButton2);
        this.add(jButton3);
//        this.setSize(400, 400);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        if (e.getSource() == jButton1) {
//            System.out.println("Button #1 pressed");
//        }
//        if (e.getSource() == jButton2) {
//            System.out.println("Button #2 pressed");
//        }
//        if (e.getSource() == jButton3) {
//            System.out.println("Button #3 pressed");
//        }
//    }
}
