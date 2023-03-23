package interfaceII;

public class Doll extends Child implements First, Second{
//    @Override
//    public void conflict() {
//        First.super.conflict();
//        Second.super.conflict();
//    }

    @Override
    public void jump() {
        super.jump();
        super.jump();
        super.jump();
    }

    @Override
    public void work() {
        System.out.println("I play with child. It's my work");
    }
}
