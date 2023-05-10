package codeBro.swing.aps.catsInSpace;

import codeBro.swing.aps.catsInSpace.entity.Background;
import codeBro.swing.aps.catsInSpace.entity.Cat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class MyPanel extends JPanel implements ActionListener {
    private final int PANEL_WIDTH = MyFrame.FRAME_WIDTH;
    private final int PANEL_HEIGHT = MyFrame.FRAME_HEIGHT;
    private Image catImage;
    private Image backgroundImage;
    private Timer timer;
    private int catsN;
    Background background;
    private ArrayList<Cat> cats;
    private Random random;
    private int randomValue;


    MyPanel() {
        catsN = 7;
        random = new Random();

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        catImage = new ImageIcon("src/main/java/codeBro/swing/resources/catti2.png").getImage();
        backgroundImage = new ImageIcon("src/main/java/codeBro/swing/resources/deepspace4.png").getImage();


        background = new Background(backgroundImage,
                0, 0, 0, 0, 5, 5, 2, 2);
//        Image scaleImage = background.getImage().getScaledInstance(2400, 2400,Image.SCALE_DEFAULT);
//        background = new Background(scaleImage, 0, 0, 0, 0, 5, 5, 2, 2);
        cats = new ArrayList<>();

        for (int i = 0; i < catsN; i++) {
            cats.add(new Cat(
                    catImage,
                    random.nextInt(PANEL_WIDTH - catImage.getWidth(null)),
                    random.nextInt(PANEL_HEIGHT - catImage.getWidth(null)),
                    random.nextInt(4) - 2,
                    random.nextInt(4) - 2,
                    50, 50,
                    0, 0));
        }

        timer = new Timer(10, this);
        timer.start();

    }

    public void paint(Graphics g) {
        super.paint(g); // paint background
        Graphics g2D = (Graphics) g;

        // background matrix
        //1 2 3
        //4 5 6
        //7 8 9

        // 1
        g2D.drawImage(background.getImage(), background.getPosX() - backgroundImage.getWidth(null), background.getPosY() - backgroundImage.getHeight(null), null);
        // 2
        g2D.drawImage(background.getImage(), background.getPosX(), background.getPosY() - backgroundImage.getHeight(null), null);
        // 3
        g2D.drawImage(background.getImage(), background.getPosX() + backgroundImage.getWidth(null), background.getPosY() - backgroundImage.getHeight(null), null);
        // 4
        g2D.drawImage(background.getImage(), background.getPosX() - backgroundImage.getWidth(null), background.getPosY(), null);
        // 5
        g2D.drawImage(background.getImage(), background.getPosX(), background.getPosY(), null);
        // 6
        g2D.drawImage(background.getImage(), background.getPosX() + backgroundImage.getWidth(null), background.getPosY(), null);
        // 7
        g2D.drawImage(background.getImage(), background.getPosX() - backgroundImage.getWidth(null), background.getPosY() + backgroundImage.getHeight(null), null);
        // 8
        g2D.drawImage(background.getImage(), background.getPosX(), background.getPosY() + backgroundImage.getHeight(null), null);
        // 9
        g2D.drawImage(background.getImage(), background.getPosX() + backgroundImage.getWidth(null), background.getPosY() + backgroundImage.getHeight(null), null);


        for (Cat cat : cats) {
            g2D.drawImage(cat.getImage(), cat.getPosX(), cat.getPosY(), null);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // randomize background acceleration X
        randomValue = random.nextInt(100000000);// chance to accelerate
        if (randomValue < 3) {
            background.setAccelerationX(randomValue);
            background.setAccelerationX(background.getAccelerationX() - 1);
            if (background.getSpeedX() > background.getMaxSpeedX()) background.setAccelerationX(-1);
            if (background.getSpeedX() < -background.getMaxSpeedX()) background.setAccelerationX(1);
        }
        // randomize background acceleration Y
        randomValue = random.nextInt(100);// chance to accelerate
        if (randomValue < 3) {
            background.setAccelerationY(randomValue);
            background.setAccelerationY(background.getAccelerationY() - 1);
            if (background.getSpeedY() > background.getMaxSpeedY()) background.setAccelerationY(-1);
            if (background.getSpeedY() < -background.getMaxSpeedY()) background.setAccelerationY(1);
        }
////        System.out.println("sX: " + background.getSpeedX());
//        System.out.println("accX: " + background.getAccelerationX());
////        System.out.println(background.getSpeedX()+background.getAccelerationX());
        background.setSpeedX(background.getSpeedX() + background.getAccelerationX());
        background.setSpeedY(background.getSpeedY() + background.getAccelerationY());
        background.setAccelerationX(0);
        background.setAccelerationY(0);

        // LIMITS
        // right
        if (background.getPosX() > backgroundImage.getWidth(null)) {
            background.setPosX(background.getPosX() - backgroundImage.getWidth(null)
            );
        }

        // left
        if (background.getPosX() < -backgroundImage.getWidth(null)) {
            background.setPosX(background.getPosX() + backgroundImage.getWidth(null)
            );
        }
        // down
        if (background.getPosY() > backgroundImage.getHeight(null)) {
            background.setPosY(background.getPosY() - backgroundImage.getHeight(null)
            );
        }
        // up
        if (background.getPosY() < -backgroundImage.getHeight(null)) {
            background.setPosY(background.getPosY() + backgroundImage.getHeight(null)
            );
        }


        background.setPosX(background.getPosX() + background.getSpeedX());
        background.setPosY(background.getPosY() + background.getSpeedY());


        for (Cat cat : cats) {
            if (cat.getPosX() >= PANEL_WIDTH - catImage.getWidth(null) || cat.getPosX() < 0) {
                cat.setSpeedX(cat.getSpeedX() * -1);
            }
            if (cat.getPosY() >= PANEL_HEIGHT - catImage.getHeight(null) || cat.getPosY() < 0) {
                cat.setSpeedY(cat.getSpeedY() * -1);
            }
            cat.setPosX(cat.getPosX() + cat.getSpeedX());
            cat.setPosY(cat.getPosY() + cat.getSpeedY());

            repaint();
        }
    }
}
