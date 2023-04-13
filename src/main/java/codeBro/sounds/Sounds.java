package codeBro.sounds;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
public class Sounds {
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:/Users/Jemm/IdeaProjects/refreshKnowlages/src/main/java/codeBro/d.wav");

        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P - play, S - stop, R - reset, Q - quit");
            System.out.println("Enter your choice:");

            response = scanner.next().toUpperCase();

            switch (response) {
                case ("P"): clip.start();
                    break;
                case ("S"): clip.stop();
                    break;
                case ("R"): clip.setFramePosition(0);
                    break;
                case ("Q"): clip.close();
                    break;
                default:
                    System.out.println("Press better ;)");
            }
        }
        System.out.println("Nice! Pls, come again");
    }

}
