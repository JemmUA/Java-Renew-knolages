package hilelll.inharitance.animals;

public class YourCat extends MyCat{
    public YourCat(String color) {
        super(color);
    }

    public YourCat(String color, String eyes) {
        super(color, eyes);
    }

    @Override
    public void sayMaw() {
        System.out.print("Muuur ");
//        super.sayMaw();
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("Yuhooooo");
    }
}
