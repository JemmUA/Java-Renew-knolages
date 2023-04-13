package codeBro.javaCore.entity;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(String name, int xSize, int ySize){
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(xSize, ySize);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle(name);
        this.getContentPane().setBackground(new Color(20,100,30));
        System.out.println(this.isVisible());
        System.out.println(this.isActive());

        ImageIcon icon = new ImageIcon("C:/Users/Jemm/IdeaProjects/refreshKnowlages/src/main/java/codeBro/gui/jemm_.jpg");
        this.setIconImage(icon.getImage());
    }


}
