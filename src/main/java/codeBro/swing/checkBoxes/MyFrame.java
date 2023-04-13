package codeBro.swing.checkBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JCheckBox checkBox;
    JButton button;
    ImageIcon YIcon;
    ImageIcon NIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
//        this.setSize(new Dimension(200, 80));
        this.setResizable(false);

        YIcon = new ImageIcon("src/main/java/codeBro/swing/resources/chbOn2.png");
        NIcon = new ImageIcon("src/main/java/codeBro/swing/resources/chbOff2.png");

        button = new JButton("Submit");
        button.addActionListener(this);
        button.setFocusable(false);

        checkBox = new JCheckBox();
        checkBox.setText("Check me in");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.ITALIC, 15));
        checkBox.setIcon(NIcon);
        checkBox.setSelectedIcon(YIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
