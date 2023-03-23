package inharitance.animals;

public class Cat extends Animal{
    String color;

    public Cat() {
    }

    public Cat(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void sayMaw() {
        System.out.println("mav");
    }

    @Override
    public void jump() {
        System.out.println("Lazy jump");
    }
}
