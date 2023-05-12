package hilelll.stream.practice1.hw15remake;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        System.out.println(Student.getNumberOfStudent());


        Stream<Long> stream = Stream.empty();
        Long countOfEmpty = stream
                .distinct()
                .limit(0)
                .skip(0)
                .sorted()
                .count();
        System.out.println(countOfEmpty);
        System.out.println("-".repeat(20) + "\n");

        List<String> names = List.of("Bob", "Ben", "Ken", "Enny", "Bob", "Den", "Ken", "Enny", "Mini", "Ben",
                "Lara", "Enny", "Bred", "Sem", "Dolli", "Martin", "Bred");
        System.out.println(names);
        System.out.println("-".repeat(20) + "\n");

        Set<String> namesSet = names.stream()
//                .distinct()
                .skip(0)
                .limit(20)
                .collect(Collectors.toSet());
        namesSet.forEach(System.out::println);

        System.out.println("-".repeat(30) + "\n");

        List<String> stringList = namesSet.stream().toList();
        stringList.forEach(System.out::println);

        Map<Integer, String> studentsMap = namesSet.stream()
                .map(Student::new)
                .collect(Collectors.toMap(Student::getId, Student::getName));

        System.out.println(studentsMap);
        System.out.println();

        List<Integer> studentsId = new ArrayList<>(studentsMap.keySet());
        System.out.println(studentsId);

        List<String> studentsValue = studentsMap.values().stream()
                .peek(System.out::println)
                .toList();

        List<String> intString = List.of("2", "3", "4", "5", "8", "89", "34", "33", "44", "88", "12", "32", "3", "11");
        List<Integer> intStream = intString.stream()
                .skip(1)
                .limit(111)
//                .mapToInt(Integer::parseInt)
//                .boxed()
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .distinct()
                .toList();

        List<String> intString2 = List.of("2", "3", "4", "5", "8", "89", "34", "33", "44", "88", "12", "32", "3", "11");
        List<Integer> intStream2 = intString.stream()
                .skip(1)
                .limit(111)
                .mapToInt(Integer::parseInt)
                .boxed()
                .filter(n -> n % 2 == 0)
                .distinct()
                .toList();

    }
}
