package hilelll.referenceMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        List<Boy> boys = new ArrayList<>();
        Function<String, Boy> createBoy = Boy::new; // Constructor with one parameter

        boys.add(createBoy.apply("Alex"));
        boys.add(createBoy.apply("Bob"));
        System.out.println(boys);
//        createBoy.apply("Oleg");
        Boy miha = new Boy("Miha");
        Boy bob= new Boy("Bob");
        bob.say("Hey");

        Supplier<Boy> boyNoName = Boy::new; // Constructor with no parameters
        Function<String, Boy> boy = Boy::new; // Constructor with 'name' parameter
        System.out.println(boyNoName.get());
        System.out.println(boy.apply("Denis"));

        Supplier<Integer> count = Boy::showBoysCount; // Static method
        count.get();

        Consumer<String> say = (miha::say); // Not static method of the concrete object
//        Consumer<String> say = (new Boy("Dima")::say);
        say.accept("Hoho");

        BiConsumer<Boy, String> boySay = Boy::say; // Not static method of class type

        boySay.accept(bob, "gogo");
                Boy.showBoysCount();
    }
}
