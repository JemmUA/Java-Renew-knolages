package hilelll.functionalInterface.practice2;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // Annotation:
        //      @FunctionalInterface
        // Functional interface can have single abstract method only

        // We can assign some function to variable

        // Transformation explaining:
        // step 1

 /*       SomeFunction function = new SomeFunction() {
            @Override
            public void square(int i) {
                System.out.println("square of "+  i+" = " + i*i);
            }
        };
*/
//        function.square(3);
        // step 2
/*
        SomeFunction function2 = (i) -> System.out.println("square of "+  i+" = " + i*i);
        function2.square(4);
*/
        // Premade
/*
        Predicate<T>    boolean test(T t);
        Consumer<T>     void accept(T t);
        Function<T, R>  R apply(T t);
        Supplier<T>     T get();
*/
        Predicate<Integer> hotWeather = t -> t > 20;
        int temperature = 21;
        System.out.println(String.format("Temperature outside is %d°C. Is it hot? \nAnswer: %b", temperature, hotWeather.test(temperature)));

        Consumer<Integer> jump = j -> {
            for (int i = 1; i <= j; i++) System.out.println("jump " + i);
        };
        jump.accept(3);

        Function<String, String> greetings = s -> {
            if (s.equalsIgnoreCase("hi")) return "Hello!";
            if (s.equalsIgnoreCase("bye")) return "So long!";
            return "A polite nod";
        };
        System.out.println(greetings.apply("kuku"));
        System.out.println(greetings.apply("hi"));
        System.out.println(greetings.apply("bye"));

        Supplier<Car> car = Car::new;
        car.get();

        Function<String, Car> carModel = Car::new;
        System.out.println(carModel.apply("Audi").getModel());

        // ++++++++++++++++++++++++++++++++++++
        // Bi Function
/*
        BiPredicate<T,U>     boolean test(T t, U u);
        BiConsumer<T, U>     void accept(T t, U u);
        BiFunction<T, U, R>  R apply(T t, U u);
*/
        // ++++++++++++++++++++++++++++++++++++
        // UnaryOperator
/*
        Function<T>     T apply(T t);
*/
        // BinaryOperator
/*
        Function<T>     T apply(T t1, T t2);
*/
        BinaryOperator<Integer> sum = (a,b) -> a+b;
        System.out.println("Sum " + sum.apply(1, 2));
    }
}
