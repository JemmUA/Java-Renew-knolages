package codeBro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);){
            int scanInt;

            System.out.println("100 divide by whole number: ");

            scanInt = scanner.nextInt();
            System.out.println(100 / scanInt);
        }
        catch (ArithmeticException e) {
            System.err.println("It's impossible to divide by ZERO");
        }
        catch (InputMismatchException e) {
            System.err.println("Enter number, pls");
        }
        catch (Exception e) {
            System.err.println("Here is your exception, lazy man... :" + e);
        }
        finally {
            System.out.println("We make it FINALLY in try/catch block anyway!");
        }
        System.out.println("Here we continue");
    }
}
