package amigosCode.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Imperative approach

/*
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        females.forEach(System.out::println);
*/


        // Declarative approach

        // Filter
/*
        List<Person> females = people.stream().
                filter(person -> person.getGender().equals(Gender.FEMALE)).
                collect(Collectors.toList());

        females.forEach(System.out::println);
*/

        // Sort

        List<Person> sorted = people.stream().
                sorted(Comparator.comparing(Person::getAge)
                                .reversed()
                                .thenComparing(Person::getGender)
//                        .reversed()
                                .thenComparing(Person::getName)
//                         .reversed()
                )

                .toList();

        sorted.forEach(System.out::println);

        // All match

/*
        boolean allMatch = people.stream().
                allMatch(p -> p.getAge() < 40);
        System.out.println(allMatch);
*/

        // Any match
/*
        boolean anyMatch = people.stream()
                .anyMatch(p -> p.getGender().equals(Gender.MALE));
        System.out.println(anyMatch);
*/

        // None match
/*
        boolean noneMatch = people.stream()
                .noneMatch(p -> p.getName().equals("Alisa"));

        System.out.println(noneMatch);
*/

        // Max
/*
        Optional<Person> max = people.stream()
                .max(Comparator.comparing(Person::getAge));
//        System.out.println(max.get());
        System.out.println(max.orElseThrow());
        System.out.println(max.orElse(new Person()));
*/

        // Min
/*
        people.stream().
                min(Comparator.comparing(Person::getAge)).
                ifPresent(p -> System.out.println(p.getName() +" is youngest"));
*/

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream().
                collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, peopleGr) -> {
            System.out.println(gender);
            peopleGr.forEach(System.out::println);
        });
        Optional<String> youngest = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .min(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        youngest.ifPresent(System.out::println);

    }


    public static List<Person> getPeople() {
        return
                List.of(
                        new Person("Bob", 30, Gender.MALE),
                        new Person("Alina", 25, Gender.FEMALE),
                        new Person("Hellen", 21, Gender.FEMALE),
                        new Person("Kate", 16, Gender.FEMALE),
                        new Person("Ken", 30, Gender.MALE),
                        new Person("Alisa", 30, Gender.FEMALE),
                        new Person("Bella", 30, Gender.FEMALE),
                        new Person("Kevin", 30, Gender.MALE),
                        new Person("Den", 7, Gender.MALE),
                        new Person("John", 12, Gender.MALE)
                );
    }
}
