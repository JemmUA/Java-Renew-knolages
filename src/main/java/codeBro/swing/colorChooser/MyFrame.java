package codeBro.swing.colorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton fgButton;
    JButton bgButton;
    JLabel label;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        fgButton = new JButton("Pick a text color");
        fgButton.addActionListener(this);
        fgButton.setFocusable(false);

        bgButton = new JButton("Pick a background text color");
        bgButton.addActionListener(this);
        bgButton.setFocusable(false);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setText("Text");
        label.setFont(new Font("Courier", Font.BOLD, 100));


        this.add(fgButton);
        this.add(bgButton);
        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JColorChooser colorChooser = new JColorChooser();
        Color color = JColorChooser.showDialog(null, "Pick a color", Color.BLACK);

        if (e.getSource() == fgButton) {
            label.setForeground(color);
        }
        if (e.getSource() == bgButton) {
            label.setBackground(color);
        }

    }
}
