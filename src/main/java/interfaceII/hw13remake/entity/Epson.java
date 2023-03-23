package main.java.interfaceII.hw13remake.entity;

import main.java.interfaceII.hw13remake.interfaces.InterfaceOne;
import main.java.interfaceII.hw13remake.interfaces.InterfaceTwo;

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
