package codeBro.swing.keyLIstener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    int step = 5;
    ImageIcon rocket;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.addKeyListener(this);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.BLACK);

        rocket = new ImageIcon("src/main/java/codeBro/swing/resources/rocket.png");

        label = new JLabel();
        label.setBounds(0, 0, 43, 100);
        label.setBackground(Color.red);
//        label.setOpaque(true);
        label.setIcon(rocket);


        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // KeyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-step, label.getY());
            break;
            case 'd': label.setLocation(label.getX()+step, label.getY());
            break;
            case 'w': label.setLocation(label.getX(), label.getY()-step);
            break;
            case 's': label.setLocation(label.getX(), label.getY()+step);
            break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // KeyPressed = Invoked when a physical key (button) is pressed down. Uses KeyCode, int output
        switch (e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-step, label.getY());
                break;
            case 39: label.setLocation(label.getX()+step, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-step);
                break;
            case 40: label.setLocation(label.getX(), label.getY()+step);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // KeyReleased whenever a button is released
        System.out.println("You released key char: "+ e.getKeyChar()+" key code: " + e.getKeyCode());

    }
}
