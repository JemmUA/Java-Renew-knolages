package hilelll.polymorphism;

public class Printer implements Diagnostics{
    void print(String string) {
        System.out.println("string: "+string);
    }
    void print(int aInt) {
        System.out.println("integer: " +aInt);
    }

    @Override
    public void diagnostic() {
        System.out.println("make diagnostics");
    }
    public void diagnostic(boolean full) {
        System.out.println("make full diagnostics");
    }
}
