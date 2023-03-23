package java9To17;

import java9To17.entjty.Child;
import java9To17.entjty.Man;
import java9To17.entjty.Woman;

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
