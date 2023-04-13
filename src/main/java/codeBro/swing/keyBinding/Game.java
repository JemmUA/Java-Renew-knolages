package codeBro.swing.keyBinding;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    char upKey;
    char downKey;
    char leftKey;
    char rightKey;

    int step = 5;
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    Game() {
        frame = new JFrame("Key Binding");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(420, 420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(0, 0, 100, 100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        upKey = 'w';
        downKey='s';
        leftKey='a';
        rightKey = 'd';

        label.getInputMap().put(KeyStroke.getKeyStroke(upKey), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke(downKey), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke(leftKey), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke(rightKey), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        frame.add(label);
        frame.setVisible(true);

    }

    public class UpAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
//            label.setLocation(label.getLocation().x, label.getLocation().y - step);
            label.setLocation(label.getX(), label.getY() - step);
            System.out.println("up");
        }
    }

    public class DownAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + step);
            System.out.println("down");
        }
    }
    public class LeftAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - step, label.getY());
            System.out.println("left");
        }
    }
    public class RightAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + step, label.getY());
            System.out.println("right");
        }
    }
}
