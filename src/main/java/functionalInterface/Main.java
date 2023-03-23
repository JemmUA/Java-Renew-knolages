package main.java.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        Schoolboy schoolboy = new Schoolboy();
//        schoolboy.print("Hi");
        String say = say("hi");
        System.out.println(say);
        Robot robot = (string) -> string.repeat(2);
        robot.doubleString("haha");

        List<String> stringList = Arrays.asList("first", "second", "third", "fours");

        stringList.sort(String::compareTo);
//        Collections.sort(stringList, (o1, o2) -> o1.compareTo(o2));
//        Collections.sort(stringList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        Predicate<Optional<Integer>> predicate = (i) -> i.orElse(0) != 0;
        System.out.println(predicate.test(Optional.ofNullable(2)));
        System.out.println(predicate.test(Optional.ofNullable(0)));
        System.out.println(predicate.test(Optional.ofNullable(null)));

        Predicate<Integer> predicateInteger = (i) -> Optional.ofNullable(i).orElse(0) != 0;
        System.out.println(predicateInteger.test(1));
        System.out.println(predicateInteger.test(0));
        System.out.println(predicateInteger.test(null));

        Consumer<String> consumer = (s) -> System.out.println(s);
//        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello!");

        Function<Integer, Boolean> function = (i) -> i < 0;
        System.out.println(function.apply(1));

        Supplier<String> supplier = () -> "Hello world!!!";
        System.out.println(supplier.get());

        System.out.println(new Me() instanceof GrandMa);

        Supplier<? super Me> legacy = () -> new Me();
        System.out.println(legacy.get());

        BiPredicate<String, String> biPredicate = (s, ss) -> ss.contains(s);
        System.out.println(biPredicate.test("la", "tralala"));

        BiConsumer<Integer, Double> sum = (i, d) -> System.out.println(i + d);
        sum.accept(3, 232.22);

        BiFunction<String, Integer, Boolean> biFunction = (s, i) -> s.length() > i;
        System.out.println(biFunction.apply("long", 7));

        UnaryOperator<String> unaryOperator = s -> s.repeat(2);
        System.out.println(unaryOperator.apply("ku "));

        BinaryOperator<String> binaryOperator = (s, ss) -> s.concat(ss);
        System.out.println(binaryOperator.apply("Hello ", "world!"));

        CustomFunction<Integer, Integer, Double, Boolean, String> customFunction = (i, ii, d, b) -> {
            if (b) {
                return String.valueOf((i + ii) * d);
            } else {
                return "Because of FALSE";
            }
        };
        System.out.println(customFunction.countSomething(43, 11, 9.9, true));
    }

    static String say(String say) {
//        System.out.println(say);
        return say.repeat(2);
    }


}
