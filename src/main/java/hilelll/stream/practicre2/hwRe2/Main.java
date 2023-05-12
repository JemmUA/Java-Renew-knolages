package hilelll.stream.practicre2.hwRe2;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Bob", "Ben", "Ken", "Enny", "Bob", "Den", "Ken", "Enny", "Mini", "Ben",
                "Lara", "Enny", "Bred", "Sem", "Dolli", "Martin", "Bred");
        Map<Integer,String> namesMap = new HashMap();
        for (int i = 0; i < names.size(); i++) namesMap.put(i+1,names.get(i));
        List<Integer> namesNumbs = namesMap.keySet().stream()
                .peek(System.out::println)
                .toList();

        Stream empty = Stream.empty()
                .skip(3)
                .limit(10)
                ;
        empty.forEach(System.out::println);

        Set<String> nameSet = names.stream()
                .filter(n -> n.length() > 1)
                .limit(100)
                .collect(Collectors.toSet());
        nameSet.forEach(System.out::println);

        List<String> mameList = nameSet.stream()
                .collect(Collectors.toList());

        Set<Integer> intStream = Stream.of("0","1","2","3","4","5","6","7","8","9")
                .skip(1)
                .limit(8)
//                .map(s-> Integer.valueOf(s)) // parse to Integer
//                .map(s-> Integer.parseInt(s)) // parse to Integer
                .map(Integer::valueOf)
                .filter(n -> n%2 == 0)
                .collect(Collectors.toSet());
        intStream.forEach(System.out::println);

        Optional<Integer> firstElement = IntStream.of(11111,22222,4,32,23,23432,332,111,0)
                .boxed()
                .parallel()
                .sorted()
                .filter(n -> n>10000)
                .findFirst();
        System.out.println(firstElement.get());
//        Stream<Integer> stream = IntStream.of(1, 2, 3, 4, 5).boxed();
//        Optional<Integer> stream1 = IntStream.of(1, 2, 3, 4, 5).boxed().findFirst();
//        OptionalInt stream2 = IntStream.of(1, 2, 3, 4, 5).findFirst();

        Student studentMisha = new Student("Misha");
        List<Student> studentsProcessed = Stream.of("Andrew", "Irina", "Vitaliy", "Elena", "Sasha", "Stanislav", "Alex", "Alex")
                .map(Student::new)
                .peek(Student::sayHello)
                .peek(Student::sayGoodbye)
                .peek(studentMisha::getStudentsCounter)
                .toList();

        studentsProcessed.forEach(System.out::println);

    }
}
