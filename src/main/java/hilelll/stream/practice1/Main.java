package hilelll.stream.practice1;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Object> objectStream = Stream.empty();
//        System.out.println(objectStream.toList().isEmpty());
//
//        List<String> stringList = new ArrayList<>();
//        stringList.add("1");
//        stringList.add("2");
//        stringList.add("3");
//        Stream<String> stringStream = stringList.stream();
//
//        Stream<String> stringStream2 = Arrays.asList("22,3232,34uo2u").stream();
//
//        String[] arrStr = new String[100];
//        Integer[] arrInt = new Integer[22];
//        Stream<String> stringStream3 = Arrays.stream(arrStr);
//
//        Stream<String> stringStream4 = Stream.of("0","1","33");
//        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        LongStream longStream = LongStream.of(32435352L, 2399877388378L);
//        DoubleStream doubleStream = DoubleStream.of(3.34, 6.3, 7.77);

        List<String> listStr = List.of(" ", "first", "second", "third", "third", "third", "third", "fours", "fours");
        Stream<String> streamStr = Stream.of(" ", "first", "second", "third", "third", "third", "third", "fours", "fours");
        IntStream stream = streamStr
//                .distinct()
                .filter(x -> x.length() > 2)
                .skip(0)
                .map(element -> {
//                    System.out.println(element + " mapped");
                    return element + "mapped";
                })
//                .limit(5)
                .mapToInt(str -> str.length())
                .sorted()
                .skip(1)
//                .limit(1)
                ;
//        listStr.stream().parallel();
//        listStr.parallelStream();


//        System.out.println(stream.count());
//        OptionalInt find = stream.findFirst();
//        System.out.println("First element: " + find.orElseThrow());
//        stream.forEach(System.out::println);

        System.out.println(stream.noneMatch(x -> x > 0));
    }
}
