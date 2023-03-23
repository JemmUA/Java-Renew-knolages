package debug;

/**
 * Debugger
 */
public class Main {
    public static void main(String[] args) {
        int x = 0;
        x = getX(x);

    }

    private static int getX(int x) {
        System.out.println("Step "+ ++x);
        System.out.println("Step "+ ++x);
        System.out.println("Step "+ ++x);
        System.out.println("Step "+ ++x);
        System.out.println("Step "+ ++x);
        System.out.println("Step "+ ++x);
        for (int i = 0; i < 4; i++) {
            System.out.println("Step "+ ++x);
        }
        return x;
    }

    private static int returnX(int x) {
        System.err.print("!!! Warning !!! Value = ");
        return x;
    }
}
