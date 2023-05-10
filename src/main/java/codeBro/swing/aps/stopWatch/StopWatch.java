package codeBro.swing.aps.stopWatch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatch implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton startButton;
    private JButton resetButton;
    private JLabel timeLabel;
    private int elapsedTime;
    private int seconds;
    private int minutes;
    private int hours;
    private boolean started;
    private String secondsStr;
    private int xWidth;
    private int yHeight;
    private Timer timer;


    StopWatch(int xWidth, int yHeight) {
        this.xWidth = xWidth;
        this.yHeight = yHeight;

        frame = new JFrame("Timer");
        frame.setSize(xWidth, yHeight);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setSize(xWidth, yHeight);
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        panel.setOpaque(true);

        secondsStr = String.format("%02d : %02d : %02d", hours, minutes, seconds);

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elapsedTime += 1000;
                hours = (elapsedTime / 36000000);
                minutes = (elapsedTime / 600000) % 60;
                seconds = (elapsedTime / 1000) % 60;
                timeLabel.setText(String.format("%02d : %02d : %02d", hours, minutes, seconds));
            }
        });

        startButton = new JButton("Start");
        startButton.setBounds(140, 130, 80, 30);
        startButton.setForeground(Color.YELLOW);
        startButton.setBackground(new Color(0x222222));
        startButton.setFont(new Font("Ink Free", Font.PLAIN, 14));
        startButton.setFocusPainted(false);
        startButton.addActionListener(this);
        resetButton = new JButton("Reset");
        resetButton.setBounds(220, 130, 80, 30);
        resetButton.setForeground(Color.YELLOW);
        resetButton.setBackground(new Color(0x222222));
        resetButton.setFont(new Font("Ink Free", Font.PLAIN, 14));
        resetButton.setFocusPainted(false);
        resetButton.addActionListener(this);
        timeLabel = new JLabel();
        timeLabel.setText(secondsStr);
        timeLabel.setBounds(15, 15, 400, 100);
        timeLabel.setFont(new Font("a_LCDNOVA", Font.PLAIN, 80));
        timeLabel.setForeground(Color.YELLOW);
        timeLabel.setBackground(new Color(0x404000));
        timeLabel.setOpaque(true);
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setHorizontalAlignment(JTextField.CENTER);
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        started = false;

        frame.add(panel);
        panel.add(timeLabel);
        panel.add(startButton);
        panel.add(resetButton);

        panel.setVisible(true);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!started) {
                started = true;
                startButton.setText("Stop");
                start();
            } else {
                started = false;
                startButton.setText("Start");
                stop();
            }

        }
        if (e.getSource() == resetButton) {
            started = false;
            reset();
        }
    }

    public void start() {
        timer.start();
        timeLabel.setBackground(new Color(0x004000));
        panel.add(timeLabel);

    }

    public void stop() {
        timer.stop();
        timeLabel.setBackground(new Color(0x400000));
        panel.add(timeLabel);

    }

    public void reset() {
        timer.stop();
        elapsedTime = 0;
        hours =0;
        minutes = 0;
        seconds = 0;
        timeLabel.setText(String.format("%02d : %02d : %02d", hours, minutes, seconds));
        timeLabel.setBackground(new Color(0x404000));
        panel.add(timeLabel);

    }
}
