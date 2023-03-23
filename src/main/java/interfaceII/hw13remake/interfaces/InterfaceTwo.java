package main.java.interfaceII.hw13remake.interfaces;

public interface InterfaceTwo extends InterfaceOne{
    void On();

    void Off();
    default void print() {
        System.out.println("print A2");
    }
    static void diagnostics() {
        System.out.println("Shake");
    }

}
