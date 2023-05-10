package hilelll.java9To17.entjty;

public sealed class Human implements  HumanSkill permits Woman, Man  {

    @Override
    public void speak() {
        System.out.println("I speak");
    }

    @Override
    public void walk() {
        System.out.println("I walk");

    }

    @Override
    public void sleep() {
        System.out.println("I sleep");

    }

    @Override
    public void eat() {
        System.out.println("I eat");

    }

    @Override
    public void drink() {
        System.out.println("I drink");


    }

    @Override
    public void work() {
        System.out.println("I work");

    }

    @Override
    public void play() {
        System.out.println("I play");

    }
}
