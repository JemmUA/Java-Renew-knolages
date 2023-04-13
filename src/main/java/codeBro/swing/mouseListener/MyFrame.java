package codeBro.swing.mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyFrame extends JFrame implements MouseListener, MouseMotionListener {
    ImageIcon rocket;
    JLabel label;
    MyFrame(){
        rocket = new ImageIcon("src/main/java/codeBro/swing/resources/rocket.png");

        label = new JLabel();
        label.setBounds(0, 0, 44, 100);
        label.setBackground(Color.red);
//        label.setOpaque(true);
        label.setIcon(rocket);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.addMouseListener(this);

        label.addMouseMotionListener(this);

        this.add(label);
        this.setVisible(true);

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse was CLICKED (PRESSED and RELEASED) on component
//        this.getContentPane().setBackground(Color.BLACK);
        label.setLocation(getMousePosition().x,getMousePosition().y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when the mouse was PRESSED on component
//        this.getContentPane().setBackground(Color.BLACK);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when the mouse was RELEASED on component

        System.out.println("mouse released: " + getMousePosition().x + "   "+getMousePosition().y );
//        label.setLocation(getMousePosition().x, getMousePosition().y);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when moose enters component
        System.out.println("in");
        this.getContentPane().setBackground(new Color(0x000011));

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when exits enters component
        System.out.println("out");
        this.getContentPane().setBackground(Color.BLACK);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("mouse drag");
        label.setLocation(getMousePosition().x-22, getMousePosition().y-50);

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("mouse move");
//        label.setLocation(getMousePosition().x, getMousePosition().y);
    }
}
