package codeBro;

import java.util.Scanner;

public class Input {

    private static String yourName;
    private static String food;
    private static int age;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        yourName = scanner.nextLine();
        System.out.println("How old are you?");
        age = scanner.nextInt();
        System.out.println("What is your favorite food?");
        scanner.nextLine(); // clear new Line from /n
        food = scanner.nextLine();
        System.out.println("Hello, " + yourName);
        System.out.println("You are " + age + " and you are pretty young :)");
        System.out.println("You like to eat " + food);
//        scanner.nextLine();
//        scanner.nextLine();
//        System.out.println(scanner.nextInt());
        scanner.close();

    }

}
