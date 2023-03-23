package main.java.interfaceII.hw13remake.interfaces;

public interface InterfaceThree {
    void On();

    void Off();

    default void print() {
        System.out.println("print A3");
    }
    static void diagnostics() {
        System.out.println("Look inside");
    }

}
