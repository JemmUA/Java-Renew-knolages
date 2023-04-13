package codeBro.swing.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    static int switcher = 0;
    JLabel label;

    JButton button ;
    static int clicks = 1;

    MyFrame(){

        ImageIcon icon = new ImageIcon("src/main/java/codeBro/gui/resources/pf3.png");
        ImageIcon icon2 = new ImageIcon("src/main/java/codeBro/gui/resources/s1.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(10,10,60,60);
        label.setVisible(false);

        Font font12= new Font("Courier",Font.BOLD, 12);
        button = new JButton();
        button.setBounds(90, 10, 160, 60);
        button.addActionListener(this);
//        button.addActionListener(e -> {
//            System.out.println("click");
//            button.setText(clicks+" - Wow, one more!");
//            System.out.println(++clicks);
//        });

        button.setFocusable(false);
        button.setText("Press me ;)");
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(font12);
        button.setIconTextGap(-45);// omg))
        button.setForeground(Color.blue);
        button.setBackground(Color.yellow );
        button.setBorder(BorderFactory.createBevelBorder(1,Color.LIGHT_GRAY, Color.GRAY));
        button.setEnabled(true);
        //        button.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setSize(278, 120);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switcher = Math.abs(switcher) -1;
        if (e.getSource()==button) {
            System.out.println("click");
            button.setText(clicks+" - Wow, one more!");
            System.out.println(++clicks);

            if (switcher==0) {
                label.setVisible(false);
            } else {
                label.setVisible(true);
            }
            System.out.println(switcher);

        }
    }
}
