package inharitance.animals;


import inharitance.skill.Behavior;

public class MyCat extends Cat implements Behavior {
    private String eyes;
    public MyCat() {
    }

    public MyCat(String color, String eyes) {
        super(color);
        this.eyes = eyes;
    }

    public MyCat(String color) {
        super(color);
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }
//    public MyCat(String color) {
//        super(color);
//    }

    @Override
    public void sayMaw() {
        System.out.println("Murk MUUUURK ");
        super.sayMaw();
    }

    @Override
    public void drink() {
        System.out.println("I drink");
    }

    @Override
    public void eat() {
        System.out.println("I eat");

    }

    @Override
    public void slip() {
        System.out.println("I slip");

    }

    @Override
    public void jump() {
        System.out.println("ok, jump");
    }
}
