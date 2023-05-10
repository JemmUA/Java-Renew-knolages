package hilelll.interfaces.practice2.entity;

import hilelll.interfaces.practice2.animalSkills.DogSkills;
import hilelll.interfaces.practice2.enums.Gender;

public class Dog extends animal implements DogSkills {
    public Dog() {
    }

    public Dog(boolean tail, String color, Gender gender, int age, String breed) {
        super(tail, color, gender, age, breed);
    }

    @Override
    public void drink() {
        System.out.println("I drink water");
    }

    @Override
    public void eat() {
        System.out.println("I eat food for dogs");

    }

    @Override
    public void go() {
        System.out.println("I go");

    }

    @Override
    public void hunt() {
        System.out.println("I don't hunt now");
    }

    @Override
    public void jump() {
        System.out.println("I jump");
    }

    @Override
    public void lie() {
        System.out.println("I lie");
    }

    @Override
    public void serve() {
        System.out.println("I serve");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep");
    }

    @Override
    public void smellTrace() {
        System.out.println("I smell traces");
    }

    @Override
    public void stand() {
        System.out.println("I stand");
    }

    @Override
    public void voice() {
        System.out.println("I say Woof");
    }
}
