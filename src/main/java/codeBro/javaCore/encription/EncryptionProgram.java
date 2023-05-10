package codeBro.javaCore.encription;

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

    EncryptionProgram(){
        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList<>();
        shuffledList =  new ArrayList<>();
        character = ' ';
        while (true) {
            askQuestion();
        }

    }

    private void askQuestion() {
        String question = "What do you want to do?";
        System.out.println("*".repeat(question.length()));
        System.out.println(question);
        System.out.print("c - create key; ");
        System.out.print("g - get key; ");
        System.out.print("e - encrypt; ");
        System.out.print("d - decrypt; ");
        System.out.println("q - quit; ");

        char response = scanner.next().charAt(0);

        if      (response == 'c') { crateKey();}
        else if (response == 'g') { getKey();}
        else if (response == 'e') { encrypt();}
        else if (response == 'd') { decrypt();}
        else if (response == 'q') { quit();}
        else { System.out.println("wrong choose, try again...");}
    }

    private void crateKey() {
        character = ' ';
        list.clear();
        shuffledList.clear();
        for (int i = 32; i < 127; i++) {
//            list.add(Character.valueOf(character));
//            character++;
            list.add((char)(i));

            shuffledList = new ArrayList(list);
            Collections.shuffle(shuffledList);
        }
        System.out.println("New Key has been generated");
    }

    private void getKey() {
        System.out.println("Key: ");
        for (char x : list) {
            System.out.print(x);
        }
        System.out.println();
        for (char x : shuffledList) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void encrypt() {
        System.out.println("Enter message to encrypt: ");
        String message = scanner.next();
        letters = message.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            for (int l = 0; l < list.size(); l++) {
                if (list.get(l) == letters[i]) {
                    System.out.println(list.get(l));
                    System.out.println(shuffledList.get(l));
                    letters[i] = shuffledList.get(l);
                }
            }
            System.out.println(letters);
        }
//                list.set((int)(c) - 32,shuffledList.get((int) (c) - 32));
        System.out.println("Encrypted message: " + message);
    }
    private void decrypt() {

    }

    private void quit() {

    }
}
