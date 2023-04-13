package codeBro.swing.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 400);
//        frame.setVisible(true);
//        frame.setResizable(false);
//        frame.setTitle("Let's do something interesting");
//        frame.getContentPane().setBackground(new Color(20,100,30));
//        System.out.println(frame.isVisible());
//        System.out.println(frame.isActive());
//
//        ImageIcon icon = new ImageIcon("src/main/java/codeBro/gui/resources/jemm_.jpg");
//        frame.setIconImage(icon.getImage());

        ImageIcon image1 = new ImageIcon("src/main/java/codeBro/gui/resources/jemm_.jpg");

        Border border = BorderFactory.createLineBorder(Color.red,5);
        JLabel label = new JLabel("Wou, this is my first label!!!"); // creat label
        //        label.setText("Wauuuu,  this is my first label!!!");
        label.setVisible(true); // visibility
        label.setIcon(image1);
        label.setFont(new Font("Courier", Font.ITALIC, 21));//set font
        label.setHorizontalTextPosition(JLabel.CENTER ); //set text LEFT, RIGHT,CENTER of image icon
        label.setVerticalTextPosition(JLabel.TOP);//set text TOP, BOTTOM,CENTER of image icon
        label.setForeground(new Color(0x00FF00)); //ser font color of text
        label.setIconTextGap(0);// set gap of text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true);// display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);// set vertical position text and icon of frame
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position
        label.setBounds(200,100, 200,200);// set position and size of label

//        MyFrame myFrame = new MyFrame("Best frame", 1920, 1080);
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLayout(null); // set manager. Not default manager allows to manage position and size of label
        frame.add(label);

//        frame.pack();// resize frame by content. May be useful alternative to fixed dimensions!!!

    }
}
