package hilelll.polymorphism;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Diagnostics diagnostics = new Printer();
        diagnostics.diagnostic();
        printer.print(10);
        printer.print("John");
        printer.diagnostic();
        printer.diagnostic(true);
    }
}
