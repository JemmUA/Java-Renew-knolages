package hilelll.ecxeptions;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ExceptionsService exceptionsService = new ExceptionsService();
//        exceptionsService.throwUncheckedException();
//        exceptionsService.throwCheckedException();
//        exceptionsService.throwTwoCheckedExceptions();
//        throw new MyException("My exception");

        try (Scanner scanner = new Scanner(System.in)) { // try with resources (if class implements Closable)
            String name = scanner.nextLine();
            exceptionsService.throwCheckedException();
        }
        catch (IOException e){
            System.err.println(e);
            System.err.println(e.getMessage());
            e.printStackTrace();
            try{
                System.out.println("nested try/catch");
            }
            catch (NullPointerException | IndexOutOfBoundsException ee){
                System.out.println("nested catch");
            }
            finally{
                System.out.println("nested finally");
            }

        }
        finally {
            System.out.println("it is finally");
        }

    }
}
