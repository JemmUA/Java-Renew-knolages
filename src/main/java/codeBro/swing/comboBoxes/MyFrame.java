package codeBro.swing.comboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        String[] animals = {"dog", "cat", "cow", "bird", "pig", "horse"};
//        Integer[] animals = {1,3,5,8};// Referral types only
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        comboBox.setEditable(true);

        comboBox.insertItemAt("chicken",1);
        comboBox.addItem("monkey");
        comboBox.setSelectedItem("pig");
        comboBox.setSelectedIndex(3);
//        comboBox.removeItem("bird");
//        comboBox.removeItemAt(comboBox.getItemCount()-1);
//        comboBox.removeAllItems();


        System.out.println("Items in combobox: " + comboBox.getItemCount());


        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }

    }
}
