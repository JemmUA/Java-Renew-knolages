package exercises;

public class Main {
    public static void main(String[] args) {
        One one = new One();
        Echo two = new Echo();

        one.print(1);
        one.print("One");

        two.print(1);
        two.print("One");
    }
}
