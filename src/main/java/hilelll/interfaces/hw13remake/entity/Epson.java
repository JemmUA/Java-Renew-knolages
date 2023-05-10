package hilelll.interfaces.hw13remake.entity;

import hilelll.interfaces.hw13remake.interfaces.InterfaceOne;
import hilelll.interfaces.hw13remake.interfaces.InterfaceTwo;

public class Epson implements InterfaceOne, InterfaceTwo {
    @Override
    public void On() {
        System.out.println("Epson ON");
    }

    @Override
    public void Off() {
        System.out.println("Epson OFF");

    }
}
