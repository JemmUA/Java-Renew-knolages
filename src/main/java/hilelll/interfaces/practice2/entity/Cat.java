package hilelll.interfaces.practice2.entity;

import hilelll.interfaces.practice2.animalSkills.CatSkills;
import hilelll.interfaces.practice2.enums.Gender;

public class Cat extends animal implements CatSkills {
    public Cat() {
    }

    public Cat(boolean tail, String color, Gender gender, int age, String breed) {
        super(tail, color, gender, age,breed);
    }
    @Override
    public void climb() {
        System.out.println("I climb on tree");
    }

    @Override
    public void drink() {
        System.out.println("I drink milk");
    }

    @Override
    public void eat() {
        System.out.println("I eat cat's food");
    }

    @Override
    public void go() {
        System.out.println("I walk");
    }

    @Override
    public void hunt() {
        System.out.println("I hunt mouses");
    }

    @Override
    public void jump() {
        System.out.println("I jump everywhere");
    }

    @Override
    public void lickBalls() {
        System.out.println("I ... not your deal");
    }

    @Override
    public void lie() {
        System.out.println("I lie ");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep");
    }

    @Override
    public void stand() {
        System.out.println("I stand");
    }

    @Override
    public void voice() {
        System.out.println("I say Maw");
    }
}
