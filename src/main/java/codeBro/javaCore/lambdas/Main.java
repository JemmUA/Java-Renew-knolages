package codeBro.javaCore.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    /* Lambda expressions = feature for java 8 and above
     *                       also known as anonymous method
     *                       a shorter way to write anonymous classes with one method
     *
     *                       need to use functional interface or use pre-defined functional interface
     *                       they contain only one abstract method
     *                       ex. ActionListener, Runnable, user-defined
     *
     *                       A lambda expression can be used in any place where a functional interface is required
     *                       How to use lambda expression:
     *                       (argument) -> {statement/s}
     * */

    public static void main(String[] args) {
        String name = "Olexa";
        char symbol = '!';

        // user defined functional interface
        MyInterface mail = (n, s) -> System.out.println("Here is a message, " + name + s);
        MyInterface greetings = (n, s) -> System.out.println("Hello, " + name + s);

        mail.message(name, symbol);
        greetings.message(name, symbol);

        MyFrame frame = new MyFrame();
        frame.setTitle("Functional interface");

        Predicate<Integer> predicate = (x) -> x == 0;
        System.out.println("Predicate: method (test) returns boolean: " + predicate.test(0));

        Function<String, String> function = (s) -> s.repeat(3);
        System.out.println("Function: method (apply) returns accept and return: " + function.apply("hilelll/string"));

        Consumer<String> consumer = (x) -> System.out.println("I've got: " + x);
        System.out.print("Consumer: method (accept) - just consumes object: ");
        consumer.accept(name);

        Supplier<String> pre = () -> "Supplier: method (get) just return an object, just like this string";
        System.out.println(pre.get());

        System.out.println("'Bi' accepts 2 parameters");

        System.out.println("Unary operator - Function <T,T> -    T apply(T t);   ");
        System.out.println("Binary operator - Function <T,T,T> -    T apply(T t1,T t2);   ");
    }
}
