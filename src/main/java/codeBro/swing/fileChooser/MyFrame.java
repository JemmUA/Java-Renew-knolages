package codeBro.swing.fileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton openButton;
    JButton saveButton;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        openButton = new JButton("Open file");
        openButton.addActionListener(this);
        openButton.setFocusable(false);

        saveButton = new JButton("Save file");
        saveButton.addActionListener(this);
        saveButton.setFocusable(false);

        this.add(openButton);
        this.add(saveButton);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("E:/Work/Temp_work"));
//        fileChooser.setCurrentDirectory(new File("."));// for project folder
//        fileChooser.setCurrentDirectory(new File(".."));
        int response = 0;

        if (e.getSource() == openButton) {
            System.out.println("open file");
            response = fileChooser.showOpenDialog(null);
        }

        if (e.getSource() == saveButton) {
            System.out.println("select file");
            response = fileChooser.showSaveDialog(null);
        }

        if (response == JFileChooser.APPROVE_OPTION) {
            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println(file);
        }
    }
}
