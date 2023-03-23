package main.java.interfaceII.hw13remake.entity;

import main.java.interfaceII.hw13remake.interfaces.InterfaceFour;
import main.java.interfaceII.hw13remake.interfaces.InterfaceThree;

public class Cannon implements InterfaceThree, InterfaceFour {
    @Override
    public void print() {
//        System.out.println("Override 4");
        InterfaceFour.super.print();
    }

    @Override
    public void On() {
        System.out.println("Cannon ON");
    }

    @Override
    public void Off() {
        System.out.println("Cannon OFF");

    }
}
