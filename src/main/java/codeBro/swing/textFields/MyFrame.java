package codeBro.swing.textFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        button = new JButton("Ok");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(300, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 15));
        textField.setForeground(new Color(0x00ff00));
        textField.setBackground(new Color(0x003300));
        textField.setCaretColor(new Color(0xffffff));
        // for just not editable text
        textField.setText("Jemm is learning");
//        textField.setEditable(false);

        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Submit: " + textField.getText());

            button.setEnabled(false);
            textField.setForeground(new Color(0x777777));
            textField.setBackground(new Color(0x222222));
            textField.setEditable(false);

        }
    }
}
