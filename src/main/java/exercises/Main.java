package exercises;

public class Main {
    public static void main(String[] args) {
        One one = new One();
        Echo echo = new Echo();

        one.print(1);
        one.print("One");

        echo.print(1);
        echo.print("One");

        {
            int x = 10;
            System.out.println(x);
        }
        int x = 3;
        System.out.println(x);
    }


}
