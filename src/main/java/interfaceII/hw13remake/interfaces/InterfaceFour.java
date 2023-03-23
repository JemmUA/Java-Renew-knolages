package main.java.interfaceII.hw13remake.interfaces;

public interface InterfaceFour {
    void On();

    void Off();
    default void print() {
        System.out.println("print A4");
    }

    static void diagnostics() {
        System.out.println("Make diagnostics");
    }
}
