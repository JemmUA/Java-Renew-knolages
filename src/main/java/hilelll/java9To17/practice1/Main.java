package hilelll.java9To17.practice1;

import hilelll.java9To17.practice1.entjty.Child;
import hilelll.java9To17.practice1.entjty.Man;
import hilelll.java9To17.practice1.entjty.Woman;

public class Main {

    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        Child child = new Child();
        man.work();
        woman.sleep();
        child.play();
    }
}
