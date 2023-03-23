package inharitance.animals;

public class CatService {
    public void showColor(Cat cat) {
        if (cat instanceof MyCat) {
            System.out.println("My cat instance ");
        }
        if (cat instanceof YourCat) {
            System.out.println("Your cat instance");
        }
        if (cat instanceof Cat) {
            System.out.println("Cat instance");
        }
        System.out.println("Color: "+ cat.getColor());
    }
}
