package hilelll.optional.practgice1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Optional
        Integer integer = 11;
        // Creating:
        //          Optional.empty(), Optional.of(), Optional.ofNullable()
        // Extraction:
        //          .get(), .orElse(), .orElseThrow()
        //Operations:
        //          .isPresent()
        //          .filter(), .ifPresent(), .map()
        Optional<Integer> empty = Optional.empty();
        Optional<Integer> notNullable = Optional.of(integer);
        Optional<Integer> nullable = Optional.ofNullable(integer);

        notNullable.get();
        nullable.orElse(new Integer(3));
        nullable.orElseThrow();
        nullable.ifPresent(System.out::println);
        notNullable.map(n -> n * n);
        notNullable.filter(n -> n < 0);
        nullable.isEmpty();
        nullable.orElseThrow();

    }
}
