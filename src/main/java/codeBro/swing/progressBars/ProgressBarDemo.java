package codeBro.swing.progressBars;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(SwingConstants.HORIZONTAL,0,100);
    ProgressBarDemo() {
        bar.setValue(0);
        bar.setBounds(0, 0, 400, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Courier", Font.BOLD, 30));
        bar.setForeground(Color.red);
        bar.setBackground(Color.blue);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,90);
        frame.setVisible(true);
        frame.add(bar);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        fill();

        }

    public void fill(){
        for (int i=0; i<=100; i++) {
            bar.setValue(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        bar.setString("От і все )))");
    }
}
