package hilelll.functionalInterface.practice1;

public interface Printer {
    default void print(String string){
        System.out.println(string);
    }
}
