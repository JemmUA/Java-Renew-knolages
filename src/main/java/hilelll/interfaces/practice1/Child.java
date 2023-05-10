package hilelll.interfaces.practice1;

public class Child implements HyperActivity,Activity{

    @Override
    public void jump() {
        System.out.println("I jump!");
    }

    @Override
    public void work() {
        System.out.println("My work is to play");
    }

    @Override
    public void doSports() {
        System.out.println("I run on the backyard");
    }
    @Override
    public void shout(String shout) {
        Activity.super.shout(shout);
    }
}

