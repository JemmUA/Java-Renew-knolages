package codeBro.swing.openNewWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("New window");

    LaunchPage(){

        button.setBounds(40, 40, 120, 30);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(220,150);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose(); // launch window disposed
            NewWindow newWindow = new NewWindow();
        }
    }
}
