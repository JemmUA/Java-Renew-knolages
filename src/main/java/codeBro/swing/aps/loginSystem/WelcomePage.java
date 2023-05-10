package codeBro.swing.aps.loginSystem;

import javax.swing.*;
import java.awt.*;

public class WelcomePage extends JFrame {
    JLabel welcome;

    WelcomePage(String user) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 100);
        this.setVisible(true);

        welcome = new JLabel("Hello, " + user + "! You are welcome!");
        welcome.setBounds(0, 0, 200, 35);
        welcome.setForeground(new Color(0x007700));
        welcome.setHorizontalAlignment(SwingConstants.CENTER);
        welcome.setFont(new Font(null, Font.BOLD, 25));


        this.add(welcome);
        this.setLocationRelativeTo(null);


    }
}
