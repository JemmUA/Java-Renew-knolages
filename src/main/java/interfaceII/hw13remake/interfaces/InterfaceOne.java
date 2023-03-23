package main.java.interfaceII.hw13remake.interfaces;

public interface InterfaceOne {
    void On();

    void Off();
    default void print() {
        System.out.println("print A1");
    }
    static void diagnostics() {
        System.out.println("Make check");
    }

}
