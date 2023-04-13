package codeBro.swing.menuBars;

import org.hibernate.annotations.common.reflection.java.JavaMetadataProvider;
import org.hibernate.annotations.common.reflection.java.JavaXMember;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem newItem;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    JMenuItem cutItem;
    JMenuItem copyItem;
    JMenuItem pasteItem;
    JMenuItem propertiesItem;

    JMenuItem helpItem;

    ImageIcon newIcon;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;
    MyFrame(){
        newIcon = new ImageIcon("src/main/java/codeBro/swing/resources/new.png");
        loadIcon = new ImageIcon("src/main/java/codeBro/swing/resources/load.png");
        saveIcon = new ImageIcon("src/main/java/codeBro/swing/resources/save.png");
        exitIcon = new ImageIcon("src/main/java/codeBro/swing/resources/exit.png");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);


        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        newItem = new JMenuItem("New");
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        propertiesItem = new JMenuItem("Properties");

        helpItem = new JMenuItem("Help");


        newItem.addActionListener(this);
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        propertiesItem.addActionListener(this);

        helpItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        newItem.setMnemonic(KeyEvent.VK_N);
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        cutItem.setMnemonic(KeyEvent.VK_U);
        copyItem.setMnemonic(KeyEvent.VK_C);
        pasteItem.setMnemonic(KeyEvent.VK_P);
        propertiesItem.setMnemonic(KeyEvent.VK_E);

        helpItem.setMnemonic(KeyEvent.VK_H);

        fileMenu.add(newItem);
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);
        editMenu.add(propertiesItem);

        helpMenu.add(helpItem);

        newItem.setIcon(newIcon);
        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            System.out.println("New File");
        }

        if (e.getSource() == loadItem) {
            System.out.println("Load File");
        }

        if (e.getSource() == saveItem) {
            System.out.println("Save File");
        }

        if (e.getSource() == exitItem) {
            System.out.println("Exit");
        }

        if (e.getSource() == cutItem) {
            System.out.println("Cut");
        }

        if (e.getSource() == copyItem) {
            System.out.println("Copy");
        }

        if (e.getSource() == pasteItem) {
            System.out.println("Paste");
        }

        if (e.getSource() == propertiesItem) {
            System.out.println("Properties");
        }

        if (e.getSource() == helpItem) {
            System.out.println("Help");
        }

    }
}
