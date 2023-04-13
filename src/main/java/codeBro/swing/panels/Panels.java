package codeBro.swing.panels;

import javax.swing.*;
import java.awt.*;

public class Panels {

    public static void main(String[] args) {

        Font font32= new Font("Courier",Font.BOLD, 32);
        Font font24= new Font("Courier",Font.BOLD, 24);
        Font font12= new Font("Courier",Font.BOLD, 12);

        ImageIcon icon = new ImageIcon(
                "src/main/java/codeBro/gui/resources/s2.png");
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel("How are you?");
        JLabel label3 = new JLabel("I miss you");
        JLabel label4 = new JLabel("KUKU))");
        label4.setForeground(Color.yellow);
        label4.setFont(font32);
        label4.setForeground(Color.red);
        label4.setBounds(0,400,200,200);

        label1.setText("Hello!");
        label1.setForeground(Color.yellow);
        label1.setFont(font32);
        label1.setIconTextGap(50);
        label1.setIcon(icon);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setBounds(0, 0, 400, 400);

        label2.setBounds(0, 0, 400, 400);
        label2.setForeground(Color.white);
        label2.setHorizontalAlignment(JLabel.RIGHT);
        label2.setVerticalAlignment(JLabel.BOTTOM);
        label2.setFont(font12);

        label3.setForeground(Color.blue);
        label3.setFont(font24);
        //JPanel = a GUI that functions as container to hold other components
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(10,200,220,220);
        redPanel.setVisible(true);
        redPanel.add(label1);
        redPanel.setOpaque(true);
//        redPanel.setLayout(null);
//        redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(50,10,150,150);
        bluePanel.setForeground(Color.yellow);
        bluePanel.add(label2);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(300,10,150,150);
        greenPanel.add(label3);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(300,200,250,250);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.add(yellowPanel);
        frame.add(label4);

    }

}
