package main.java.functionalInterface;

public interface Printer {
    default void print(String string){
        System.out.println(string);
    }
}
