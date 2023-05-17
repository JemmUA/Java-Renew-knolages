package amigosCode.optoin;

import java.util.Optional;

public class Main {

/*
     Optional
     Create:
              Optional.empty()
              Optional.of()
              Optional.ofNullable()

    Operations:
                .get()
                .orElse
                .otElseThrow()

                .isPresent()
                .isEmpty()
                .map().
                .orElseGet()
                .ifPresentOrElse()

*/

    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> of = Optional.of("world");
        Optional<String> hello = Optional.ofNullable("word");

        System.out.println(empty.isEmpty());
        System.out.println(empty.isPresent());

        empty = empty.of("Hello");
        String orElse = empty.orElse("world");
        System.out.println(orElse);

        orElse = hello
                .orElseGet(() -> {
            return "hello 2";
        });
        System.out.println(orElse);

        Optional<String> world3 = Optional.of("world 3");

        world3
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

        Optional<String> world4 = Optional.ofNullable("kuku");
        world4.ifPresentOrElse(System.out::println, () -> System.out.println("nobody understands me"));

        String emptyStr = empty.orElseThrow(NullPointerException::new);

    }

}
