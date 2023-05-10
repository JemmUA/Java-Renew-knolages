package codeBro.swing.aps.loginSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame;
    JButton loginButton;
    JButton resetButton;
    HashMap<String, String> loginInfo;
    JTextField userIdField;
    JPasswordField userPasswordField;
    JLabel userIdLabel;
    JLabel userPasswordLabel;
    JLabel messageLabel;

    LoginPage(HashMap<String, String> loginInfo) {
        this.loginInfo = loginInfo;
        frame = new JFrame();
        loginButton = new JButton("Login");
        resetButton = new JButton("Reset");
        userIdField = new JTextField();
        userPasswordField = new JPasswordField();
        userIdLabel = new JLabel("User ID: ");
        userPasswordLabel = new JLabel("Password: ");
        messageLabel = new JLabel("Message: ");

        userIdField.setBounds(130, 100, 200, 25);
        userPasswordField.setBounds(130, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        userIdLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(50, 250, 350, 65);
        messageLabel.setFont(new Font(null, Font.ITALIC, 15));

        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(messageLabel);
        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userId = userIdField.getText();
            String userPassword = String.valueOf(userPasswordField.getPassword());

            if (loginInfo.containsKey(userId)&&loginInfo.get(userId).equals(userPassword)) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setFont(new Font(null, Font.ITALIC, 25));
                    messageLabel.setText("You are welcome!");
                frame.dispose();
                WelcomePage welcomePage = new WelcomePage(userId);
            } else {
                messageLabel.setForeground(Color.RED);
                messageLabel.setFont(new Font(null, Font.ITALIC, 15));
                messageLabel.setText("Wrong login or password. Please, try again!");

            }

    }

        if(e.getSource()==resetButton)

    {
        userIdField.setText("");
        userPasswordField.setText("");
    }

}
}
