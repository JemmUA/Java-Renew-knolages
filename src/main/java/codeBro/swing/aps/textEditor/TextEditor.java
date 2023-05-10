package codeBro.swing.aps.textEditor;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class TextEditor extends JFrame implements ActionListener {
    int xSize;
    int ySize;
    int margins;
    int headerHeight;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JSpinner fontSizeSpinner;
    private JLabel fontLabel;
    private int fontSize;
    private int fontSizeMin;
    private JButton fontColorButton;
    private JComboBox comboBoxFont;
    private JComboBox comboBoxStyle;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem openItem;
    private JMenuItem saveItem;
    private JMenuItem exitItem;
    private HashMap<String, Integer> style;

    TextEditor(int xSize, int ySize) {
        style = new HashMap<>();
        style.put("Plain", 0);
        style.put("Bold", 1);
        style.put("Italic", 2);
        style.put("BoldItalic", 3);

        this.xSize = xSize;
        this.ySize = ySize;
        margins = 16;
        headerHeight = 90;
        fontSize = 20;
        fontSizeMin = 6;

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Text editor");
        this.setSize(xSize, ySize);
        this.setLayout(new FlowLayout());

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(xSize-margins, ySize-margins-headerHeight));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Courier", Font.PLAIN, fontSize));

        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(xSize-margins, ySize-margins-headerHeight));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


        fontLabel = new JLabel("Font size");
        fontLabel.setPreferredSize(new Dimension(50, 25));

        fontColorButton = new JButton("Pick color");
        fontColorButton.setBounds(0, 0, 40, 20);
        fontColorButton.setFocusable(false);
        fontColorButton.addActionListener(this);


        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        comboBoxFont = new JComboBox(fonts);
        comboBoxFont.addActionListener(this);
        comboBoxFont.setSelectedItem("Arial");

//        String[] styles = {"Plain", "Italic", "Bold"};
        String[] styles = new String[style.size()];
        for (int i = 0; i < style.size(); i++) {
            styles[i] = (String)style.keySet().toArray()[i];
        }
        comboBoxStyle = new JComboBox(styles);
        comboBoxStyle.addActionListener(this);
        comboBoxStyle.setSelectedItem("Plain");

        fontSizeSpinner = new JSpinner();
        fontSizeSpinner.setPreferredSize(new Dimension(50, 25));
        fontSizeSpinner.setValue(fontSize);
        fontSizeSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                textArea.setFont(new Font(textArea.getFont().getFamily(), style.get(comboBoxStyle.getSelectedItem()), (int) fontSizeSpinner.getValue()));
                if ((int) fontSizeSpinner.getValue() < fontSizeMin) {
                    fontSizeSpinner.setValue(fontSizeMin);
                }
            }
        });


        // MenuBar

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Close");

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        // /MenuBar

        this.setJMenuBar(menuBar);
        this.add(comboBoxFont);
        this.add(comboBoxStyle);
        this.add(fontLabel);
        this.add(fontSizeSpinner);
        this.add(fontColorButton);
        this.add(scrollPane);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fontColorButton) {
            Color color = JColorChooser.showDialog(null, "Color Picker", Color.black);
            JColorChooser colorChooser = new JColorChooser();
            textArea.setForeground(color);
        }
        if (e.getSource() == comboBoxFont) {
            textArea.setFont(new Font((String) comboBoxFont.getSelectedItem(), textArea.getFont().getStyle(), textArea.getFont().getSize()));
        }
        if (e.getSource() == comboBoxStyle) {

            textArea.setFont(new Font((String) comboBoxFont.getFont().getFamily(), style.get(comboBoxStyle.getSelectedItem()), textArea.getFont().getSize()));
        }
        if (e.getSource() == openItem) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("./src/textEditor"));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
            fileChooser.setFileFilter(filter);
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try (Scanner fileIn = new Scanner(file)) {
                    if (file.isFile()) {
                        while (fileIn.hasNextLine()) {
                            String line = fileIn.nextLine() + "\n";
                            textArea.append(line);
                        }
                    }
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }

            }
        }
        if (e.getSource() == saveItem) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("./src/textEditor"));
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file;
                file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try (PrintWriter fileOut = new PrintWriter(file)) {
                    fileOut.println(textArea.getText());
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
