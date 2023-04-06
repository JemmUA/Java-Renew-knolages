package codeBro;
import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input your name");
        JOptionPane.showMessageDialog(null, "Hi, " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Hi, " + name + "you are "+age);
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "Hi, " + name + "you are "+age+ ", your height is: "+height);
    }
}
