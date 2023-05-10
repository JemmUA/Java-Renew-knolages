package codeBro.javaCore.exceptions.part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // exception =  an event, after  execution that disrupts normal flow of the program
        // ex.ArithmeticException, ArrayIndexOutOfBoundException, FileNotFoundException

        // user defined exception = custom exception
        // AgeException, MyException etc.

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Hi, mate, enter your age, pls:");
            int age = scanner.nextInt();
            checkAge(age);
        }
        catch (Exception e){
            System.err.println("Problem occurred: " + e);
        }
    }

    public static void checkAge(int age) throws AgeException {
        if (age >= 10 && age < 18) {
            throw new AgeException("Hey, teenager, You are too young!");
        }
        else if (age >= 0 && age <= 9) {
            throw new AgeException("Hey, baby, You are too young!");
        }
        else if (age < 0) {
            throw new AgeException("Hey You, please be born before :)");
        }
        else {
            System.out.println("Congratulations! You are signed up now.");
        }
    }
}
