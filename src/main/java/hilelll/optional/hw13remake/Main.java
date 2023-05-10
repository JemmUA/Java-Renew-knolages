package hilelll.optional.hw13remake;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1));
        students.add(new Student(3));
        students.add(new Student(3));
        students.add(new Student(5));
        students.add(new Student(4));
        students.add(new Student(3));
        students.add(new Student(2));
        students.add(new Student(4));

        students.forEach(System.out::println);

        Optional<List<Student>> optionalMy = Optional.ofNullable(students);

        System.out.println("\nLet's check list of students");
        helper(optionalMy).get().stream().forEach(System.out::println);

        System.out.println();
        Optional<Student> optionalBox = Optional.of(new Student("Alex",4));
        Optional<Student> optionalNullableBox = Optional.ofNullable(null);
        Optional<?> optionalEmptyBox = Optional.empty();

        System.out.println(optionalBox.get());
        System.out.println(optionalBox);
//        optionalNullableBox.orElseThrow();
        System.out.println(optionalNullableBox.orElse(new Student("Newman", 1)));
        System.out.println(optionalNullableBox.or(() -> Optional.of(new Student("Bob", 3))));

        Object x = 222;

        Optional<Object> xx = Optional.ofNullable(x);

        Object xxx = xx.orElse(new Object());
        System.out.println("---");
        System.out.println(xxx);
    }
    static Optional<List<Student>> helper(Optional<List<Student>> listOfStudents) {
        if (listOfStudents.isEmpty()) {
            System.out.println("Optional is empty");
//            return Optional.empty();
            List<Student> students = new ArrayList<>();
            students.add(new Student(1));
            students.add(new Student(4));
            listOfStudents = Optional.ofNullable(students);
            listOfStudents.get().add(new Student(5));
            listOfStudents.get().add(new Student(2));
            listOfStudents.get().add(new Student(3));
            return listOfStudents;

        }

        System.out.println(Optional.ofNullable(listOfStudents).isPresent());
        if (listOfStudents.get().size() != 0) {
            return listOfStudents;
        } else {
            listOfStudents.get().add(new Student(1));
            listOfStudents.get().add(new Student(5));
            listOfStudents.get().add(new Student(2));
            listOfStudents.get().add(new Student(3));
            return listOfStudents;
        }
    }

}
