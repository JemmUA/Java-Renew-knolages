package codeBro.swing.radioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton morningButton;
    JRadioButton dayButton;
    JRadioButton eveningButton;
    JRadioButton nightButton;
    ButtonGroup buttonGroup;
    JTextField text;
    ImageIcon morningIcon;
    ImageIcon morningIconPick;
    ImageIcon morningIconOk;
    ImageIcon morningIconOff;
    ImageIcon dayIcon;
    ImageIcon dayIconPick;
    ImageIcon dayIconOk;
    ImageIcon dayIconOff;
    ImageIcon eveningIcon;
    ImageIcon eveningIconPick;
    ImageIcon eveningIconOk;
    ImageIcon eveningIconOff;
    ImageIcon nightIcon;
    ImageIcon nightIconPick;
    ImageIcon nightIconOk;
    ImageIcon nightIconOff;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(100, 500));
//        this.setLayout(new FlowLayout());
        this.setLayout(new GridLayout(5 ,1));
        this.setLocationRelativeTo(null);

        morningIcon = new ImageIcon("src/main/java/codeBro/swing/resources/morning.png");
        morningIconPick = new ImageIcon("src/main/java/codeBro/swing/resources/morning_pick.png");
        morningIconOk = new ImageIcon("src/main/java/codeBro/swing/resources/morning_ok.png");
        morningIconOff = new ImageIcon("src/main/java/codeBro/swing/resources/morning_off.png");
        dayIcon = new ImageIcon("src/main/java/codeBro/swing/resources/day.png");
        dayIconPick = new ImageIcon("src/main/java/codeBro/swing/resources/day_pick.png");
        dayIconOk = new ImageIcon("src/main/java/codeBro/swing/resources/day_ok.png");
        dayIconOff = new ImageIcon("src/main/java/codeBro/swing/resources/day_off.png");
        eveningIcon = new ImageIcon("src/main/java/codeBro/swing/resources/evening.png");
        eveningIconPick = new ImageIcon("src/main/java/codeBro/swing/resources/evening_pick.png");
        eveningIconOk = new ImageIcon("src/main/java/codeBro/swing/resources/evening_ok.png");
        eveningIconOff = new ImageIcon("src/main/java/codeBro/swing/resources/evening_off.png");
        nightIcon = new ImageIcon("src/main/java/codeBro/swing/resources/night.png");
        nightIconPick = new ImageIcon("src/main/java/codeBro/swing/resources/night_pick.png");
        nightIconOk = new ImageIcon("src/main/java/codeBro/swing/resources/night_ok.png");
        nightIconOff = new ImageIcon("src/main/java/codeBro/swing/resources/night_off.png");

        text = new JTextField("Greetings");
        text.setFont(new Font("Courier", Font.ITALIC, 20));
        text.setForeground(Color.red);
        text.setAlignmentX(CENTER_ALIGNMENT);
        text.setAlignmentY(CENTER_ALIGNMENT);
        text.setEditable(false);
        text.setFocusable(false);

        morningButton = new JRadioButton( "morning");
        morningButton.addActionListener(this);
        morningButton.setIcon(morningIconOff);
        morningButton.setSelectedIcon(morningIcon);
        morningButton.setRolloverSelectedIcon(morningIconPick);
        morningButton.setRolloverIcon(morningIconOk);
        morningButton.setFocusable(false);
        dayButton = new JRadioButton( "day");
        dayButton.setFocusable(false);
        dayButton.addActionListener(this);
        dayButton.setIcon(dayIconOff);
        dayButton.setSelectedIcon(dayIcon);
        dayButton.setRolloverSelectedIcon(dayIconPick);
        dayButton.setRolloverIcon(dayIconOk);
        eveningButton = new JRadioButton( "evening");
        eveningButton.addActionListener(this);
        eveningButton.setIcon(eveningIconOff);
        eveningButton.setSelectedIcon(eveningIcon);
        eveningButton.setRolloverSelectedIcon(eveningIconPick);
        eveningButton.setRolloverIcon(eveningIconOk);
        eveningButton.setFocusable(false);
        nightButton = new JRadioButton( "night");
        nightButton.addActionListener(this);
        nightButton.setIcon(nightIconOff);
        nightButton.setSelectedIcon(nightIcon);
        nightButton.setRolloverSelectedIcon(nightIconPick);
        nightButton.setRolloverIcon(nightIconOk);
        nightButton.setFocusable(false);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(morningButton);
        buttonGroup.add(dayButton);
        buttonGroup.add(eveningButton);
        buttonGroup.add(nightButton);

        this.add(text);
        this.add(morningButton);
        this.add(dayButton);
        this.add(eveningButton);
        this.add(nightButton);
//        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == morningButton) {
            System.out.println("Good morning");
        }
        if (e.getSource() == dayButton) {
            System.out.println("Good afternoon");
        }
        if (e.getSource() == eveningButton) {
            System.out.println("Good evening");
        }
        if (e.getSource() == nightButton) {
            System.out.println("Good night");
        }
    }
}
