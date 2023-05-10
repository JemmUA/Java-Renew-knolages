package codeBro.javaCore.exceptions.part1;

import main.java.exceptions.myExceptions.CheckedException;

public class Main {
    public static void main(String[] args) throws CheckedException {
        try {
            if (true) {
                callException();
            }
        } catch (CheckedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        } finally {
            System.out.println("perform finally");
        }

//        //try with resources
//        try (Scanner scanner = new Scanner(System.in)) {
//            String scan = scanner.nextLine();
//            System.out.println(scan);
//        }catch (CheckedException e) {
//
//        } catch (BindException e) {
//
//        } catch (FileSystemException e) {
//
//        }

//
//        try {
//            callException();
//        } catch (CheckedException | FileSystemException e) {
//        }
//
//    }
//

    }
    public static void callException () throws CheckedException {
        throw new CheckedException("exception happened");

    }
}
