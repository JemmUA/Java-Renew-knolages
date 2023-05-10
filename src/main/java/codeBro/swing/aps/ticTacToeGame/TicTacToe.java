package codeBro.swing.aps.ticTacToeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TicTacToe implements ActionListener {
    //    Date currentDate;
    Random random;
    JFrame frame;
    JPanel titlePanel;
    JPanel buttonsPanel;
    JLabel messageLabel;
    JTextField textField;
    JButton[] buttons;
    boolean playerOneTurn;


    TicTacToe() {
//        currentDate = new Date();
        random = new Random();
        titlePanel = new JPanel();
        buttonsPanel = new JPanel();
        messageLabel = new JLabel();
        buttons = new JButton[9];
        textField = new JTextField();

        frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.getContentPane().setBackground(new Color(0x777777));
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 0));

        textField.setFont(new Font("Ink free", Font.BOLD, 75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("TicTacToe");
        textField.setEditable(false);

        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0, 0, 800, 100);
        titlePanel.add(textField);


        buttonsPanel.setLayout(new GridLayout(3, 3));
        buttonsPanel.setBackground(new Color(0x99aaaaa));


        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttonsPanel.add(buttons[i]);
            buttons[i].setFont(new Font(null, Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(buttonsPanel);
        frame.setVisible(true);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (playerOneTurn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(Color.RED);
                        buttons[i].setText("X");
                        playerOneTurn = false;
                        textField.setText("O turn");
                        check();
                    }

                } else {
                    buttons[i].setForeground(Color.BLUE);
                    buttons[i].setText("O");
                    playerOneTurn = true;
                    textField.setText("X turn");
                    check();
                }
            }
        }
    }

    public void firstTurn() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (random.nextInt(2) == 0) {
            playerOneTurn = true;
            textField.setText("X turn");
        } else {
            playerOneTurn = false;
            textField.setText("O turn");

        }

    }

    public void check() {
        // check X wins conditions
        if ((buttons[0].getText() == "X") &&
                (buttons[1].getText() == "X") &&
                (buttons[2].getText() == "X")
        ) {
            xWins(0, 1, 2);
        }

        if ((buttons[3].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[5].getText() == "X")
        ) {
            xWins(3, 4, 5);
        }

        if ((buttons[6].getText() == "X") &&
                (buttons[7].getText() == "X") &&
                (buttons[8].getText() == "X")
        ) {
            xWins(6, 7, 8);
        }

        if ((buttons[0].getText() == "X") &&
                (buttons[3].getText() == "X") &&
                (buttons[6].getText() == "X")
        ) {
            xWins(0, 3, 6);
        }

        if ((buttons[1].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[7].getText() == "X")
        ) {
            xWins(1, 4, 7);
        }

        if ((buttons[2].getText() == "X") &&
                (buttons[5].getText() == "X") &&
                (buttons[8].getText() == "X")
        ) {
            xWins(2, 5, 8);
        }
        if ((buttons[0].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[8].getText() == "X")
        ) {
            xWins(0, 4, 8);
        }
        if ((buttons[2].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[6].getText() == "X")
        ) {
            xWins(2, 4, 6);
        }

        // check O wins conditions
        if ((buttons[0].getText() == "O") &&
                (buttons[1].getText() == "O") &&
                (buttons[2].getText() == "O")
        ) {
            oWins(0, 1, 2);
        }

        if ((buttons[3].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[5].getText() == "O")
        ) {
            oWins(3, 4, 5);
        }

        if ((buttons[6].getText() == "O") &&
                (buttons[7].getText() == "O") &&
                (buttons[8].getText() == "O")
        ) {
            oWins(6, 7, 8);
        }

        if ((buttons[0].getText() == "O") &&
                (buttons[3].getText() == "O") &&
                (buttons[6].getText() == "O")
        ) {
            oWins(0, 3, 6);
        }

        if ((buttons[1].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[7].getText() == "O")
        ) {
            oWins(1, 4, 7);
        }

        if ((buttons[2].getText() == "O") &&
                (buttons[5].getText() == "O") &&
                (buttons[8].getText() == "O")
        ) {
            oWins(2, 5, 8);
        }
        if ((buttons[0].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[8].getText() == "O")
        ) {
            oWins(0, 4, 8);
        }
        if ((buttons[2].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[6].getText() == "O")
        ) {
            oWins(2, 4, 6);
        }


    }

    public void xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textField.setText("X wins");
    }

    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textField.setText("O wins");

    }

//    public <C extends JComponent> void blinkComponent(JComponent c) {
//        c.setVisible(blink(500));
//    }
//
//    public boolean blink(int period) {
//        currentDate = new Date();
//        int x = (int) (currentDate.getTime() / period % 2);
//        System.out.println(currentDate.getTime());
//        System.out.println(x);
//        return x == 1;
//    }
}
