package inharitance;

import inharitance.animals.Cat;
import inharitance.animals.CatService;
import inharitance.animals.MyCat;
import inharitance.animals.YourCat;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Cat cat = new Cat("grey");
        System.out.println(cat.getColor());
        MyCat myCat = new MyCat("white");
        System.out.println(myCat.getColor());
        myCat.setEyes("green");
        System.out.println(myCat.getEyes());
        YourCat yourCat = new YourCat("black");
        yourCat.setColor("red");
        System.out.println(yourCat.getColor());
        CatService catService = new CatService();
        catService.showColor(myCat);
        catService.showColor(cat);
        catService.showColor(yourCat);

        cat.sayMaw();
        myCat.sayMaw();
        myCat.eat();
        yourCat.sayMaw();
        yourCat.slip();
        yourCat.setTail("LONG");
        System.out.println(yourCat.getTail());
        yourCat.jump();
    }

}