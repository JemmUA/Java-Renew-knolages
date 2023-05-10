package hilelll.interfaces.practice2.entity;

import hilelll.interfaces.practice2.enums.Gender;

public abstract class animal {
    boolean tail;
    String color;
    Gender gender;
    int age;
    String breed;

    public animal() {
    }

    public animal(boolean tail, String color, Gender gender, int age, String breed) {
        this.tail = tail;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.breed = breed;
    }
}
