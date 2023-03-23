package main.java.interfaceII.hw13remake;

import main.java.interfaceII.hw13remake.entity.Cannon;
import main.java.interfaceII.hw13remake.entity.Epson;
import main.java.interfaceII.hw13remake.interfaces.InterfaceFour;
import main.java.interfaceII.hw13remake.interfaces.InterfaceOne;
import main.java.interfaceII.hw13remake.interfaces.InterfaceThree;
import main.java.interfaceII.hw13remake.interfaces.InterfaceTwo;

public class Main {
    public static void main(String[] args) {
        InterfaceOne.diagnostics();
        InterfaceTwo.diagnostics();
        InterfaceThree.diagnostics();
        InterfaceFour.diagnostics();

        Cannon cannon = new Cannon();
        Epson epson = new Epson();

        cannon.On();
        cannon.print();
        cannon.Off();

        epson.On();
        epson.print();
        epson.Off();


    }
}
