package codeBro.swing.sliders;

import codeBro.swing.openNewWindow.NewWindow;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    SliderDemo() {
        frame = new JFrame("Slider Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(440, 440);
        frame.setLocationRelativeTo(null);
//        frame.setLayout(null);


        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400, 200));
        slider.addChangeListener(this);

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(10);
        slider.setInverted(true);
        slider.setOrientation(SwingConstants.VERTICAL);

        slider.setPaintLabels(true);
        slider.setFont(new Font("Courier", Font.BOLD, 14));
        slider.setForeground(Color.BLUE);

        slider.setVisible(true);
        System.out.println(slider.getValue());

        label.setText(String.format("%d °C", slider.getValue()));
        label.setFont(new Font("Courier", Font.BOLD, 50));
        label.setForeground(Color.BLUE);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setVisible(true);

    }
    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == slider) {
            System.out.println(slider.getValue());
            label.setText(String.format("%d °C", slider.getValue()));

        }
    }
}
