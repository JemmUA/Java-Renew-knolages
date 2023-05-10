package hilelll.interfaces.practice2;

import hilelll.interfaces.practice2.animalSkills.CatSkills;
import hilelll.interfaces.practice2.animalSkills.DogSkills;
import hilelll.interfaces.practice2.entity.Cat;
import hilelll.interfaces.practice2.entity.Dog;
import hilelll.interfaces.practice2.enums.Gender;

public class Main {
    public static void main(String[] args) {
        // Interface can be extended
        // To resolve multiple inheritance conflict here are to ways:
        //      1. Override method
        //      2. Extend one interface by other to define who is main
        //          The heir takes precedence over the parent in a multiple inheritance conflict
        // Interfaces can't be final
        Cat cat = new Cat(true, "black", Gender.FEMALE, 1, "Persian");
        Dog dog = new Dog(true, "white", Gender.MALE, 3,"Dog");
        dog.voice();
        cat.voice();
        System.out.println(CatSkills.introduceMyself);
        System.out.println(DogSkills.introduceMyself);
    }
}
