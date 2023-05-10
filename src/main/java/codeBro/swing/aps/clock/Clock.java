package codeBro.swing.aps.clock;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock extends JFrame {
    int xSize;
    int ySize;
    JPanel panel;
    Calendar calendar;
    SimpleDateFormat dateFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    int fontSize;


    Clock(int xSize,int ySize) throws InterruptedException {

        this.xSize = xSize;
        this.ySize = ySize;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("The best ever clock");
        this.setSize(xSize, ySize);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setOpaque(false);
        panel.setBounds(0, 0, xSize, ySize);
        panel.setBackground(new Color(0x111711));
        panel.setLayout(new FlowLayout());

        panel.setOpaque(true);
        panel.setVisible(true);

        fontSize = 45;

//        dateFormat = new SimpleDateFormat("E");
//        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeFormat = new SimpleDateFormat("hh:mm");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("a_LCDNOVA", Font.PLAIN, 2*fontSize));
        timeLabel.setForeground(new Color(0x00ff00));
        timeLabel.setOpaque(false);

        dayFormat = new SimpleDateFormat("EEEE");
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Gabriola", Font.BOLD, fontSize));
        dayLabel.setForeground(new Color(0x00ff00));
        dayLabel.setOpaque(false);


        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Gabriola", Font.BOLD, fontSize));
        dateLabel.setForeground(new Color(0x00ff00));
        dateLabel.setOpaque(false);



        panel.add(dateLabel);
        panel.add(timeLabel);
        panel.add(dayLabel);

        this.add(panel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() throws InterruptedException {
        while (true) {

//            if (blink(500)) {
//                timeFormat = new SimpleDateFormat("hh:mm.");
////                timeFormat = new SimpleDateFormat("hh:mm.ss a");
//
//            } else {
//                timeFormat = new SimpleDateFormat("hh:mm ");
//            }
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);


            Thread.sleep(500);
        }
    }

    public boolean blink(int period) {
        calendar = Calendar.getInstance();
        int x = (int) (calendar.getTimeInMillis() / period % 2);
        return x == 1;
    }
}
