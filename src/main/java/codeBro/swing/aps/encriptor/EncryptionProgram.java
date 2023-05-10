package codeBro.swing.aps.encriptor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EncryptionProgram {

    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private String line;
    private char[] letters;
    private char[] secretLetters;
    char response;

    EncryptionProgram() {
        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList<Character>();
        shuffledList = new ArrayList<Character>();

        createKey();
        while (true) askQuestion();
    }


    private void askQuestion() {
        String question = "c - Create key; g - Get key; e - Encrypt; d - Decrypt; q - quit";
        System.out.println("*".repeat(question.length()));
        System.out.println(question);
        System.out.println("*".repeat(question.length()));

        String scan = scanner.nextLine().toLowerCase();
        if (scan.isEmpty()) {
            System.out.println("Please, make your choice:");
            return;
        } else {
            response = scan.charAt(0);
        }
        if (response == 'c') {
            createKey();
        } else if (response == 'g') {
            getKey();
        } else if (response == 'e') {
            encrypt();
        } else if (response == 'd') {
            decrypt();
        } else if (response == 'q') {
            quit();
        } else System.out.println("wrong choice, pls try again");
    }

    private void createKey() {
        list.clear();
        shuffledList.clear();

        for (int i = 32; i < 127; i++) {
            list.add((char) i);

            shuffledList = new ArrayList<>(list);
            Collections.shuffle(shuffledList);
        }
        System.out.println("new Key has been generated");


    }

    private void getKey() {
        System.out.println("Key: ");
        for (char c : list) System.out.print(c);
        System.out.println();
        for (char c : shuffledList) System.out.print(c);
        System.out.println();

    }

    private void encrypt() {
        System.out.println("Enter message to be encrypted: ");
        String message = scanner.nextLine();

        letters = message.toCharArray();

        crypt(letters, list, shuffledList);

        System.out.println("Encrypted:");
        for (char c : letters) {
            System.out.print(c);
        }
        System.out.println();
    }

    private void decrypt() {
        if (letters == null) {
            System.out.println("There is not massage for decryption!");
            System.out.println("Please, encode some message");
            return;
        }
        System.out.println("Decrypted message: ");
        crypt(letters, shuffledList, list);

        for (char c : letters) {
            System.out.print(c);
        }
        System.out.println();

    }

    private void quit() {
        System.out.println("Cya, mate!");
        System.exit(0);
    }

    private void crypt(char[] letters, ArrayList<Character> from, ArrayList<Character> to) {
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (letters[i] == from.get(j)) {
                    letters[i] = to.get(j);
                    break;
                }
            }
        }
    }
}

