package codeBro.swing.optionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // JOptionPane =    pop up a standard dialog box that prompts user for a value or
        //                  informs them of something

//        JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.ERROR_MESSAGE);

        // responses:
        // close window: -1
        // yes: 0
        // no: 1
        // cancel: 2

        String name = JOptionPane.showInputDialog(null, "What is your name?", "acquaintance", JOptionPane.PLAIN_MESSAGE);
        int answer = JOptionPane.showConfirmDialog(null, "Do You want tea?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);

        ImageIcon icon = new ImageIcon("src/main/java/codeBro/swing/resources/catti2.png");
        String[] responses = {"Yes! Of course", "Not now"};
        System.out.println(JOptionPane.showOptionDialog(null, "Would you like black tea?", "default tea", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0));
        System.out.println(JOptionPane.showOptionDialog(
                null,
                "Would you like sugar?",
                "tea from Catti", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                icon,
                responses,
                0));
                JOptionPane.showMessageDialog(null, "You must try it, " + name, "order", JOptionPane.PLAIN_MESSAGE);

    }
}
