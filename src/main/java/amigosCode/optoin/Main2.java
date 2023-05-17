package amigosCode.optoin;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
Person person = new Person("Bob", null);
        String email = person
                .getEmail()
                .map(String::toLowerCase)
                .orElse("no email");

        System.out.println(email);

        // Another ordinary java way
        if (person.getEmail().isPresent()){
            String email2 = person.getEmail().get();
            System.out.println(email2.toLowerCase());
        } else {
            System.out.println("no email");
        }
    }
    }
class Person{
private String name;
private String email;

    public Person() {
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

