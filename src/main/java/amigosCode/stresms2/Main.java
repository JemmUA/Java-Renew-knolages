package amigosCode.stresms2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // List to stream
        List<String> names = List.of("Bo", "Hellen", "Nick");
        Stream<String> stream = names.stream();

        // List to stream
        Stream<String> nameStream = Stream.of("Bo", "Hellen", "Nick");

        // Stream ... list
        List<Object> collect = stream
                .limit(2)
                .map(null)
                .sorted(null)
                .dropWhile(null)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        long count = stream
                .limit(2)
                .count();
        System.out.println(count);

        // Array to Stream
        String[] namesArray = {};
        Arrays.stream(namesArray);
        List<String> list = Arrays.stream(namesArray).toList();
    }

}
