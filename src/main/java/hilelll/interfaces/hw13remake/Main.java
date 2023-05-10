package hilelll.interfaces.hw13remake;

import hilelll.interfaces.hw13remake.entity.Cannon;
import hilelll.interfaces.hw13remake.entity.Epson;
import hilelll.interfaces.hw13remake.interfaces.InterfaceFour;
import hilelll.interfaces.hw13remake.interfaces.InterfaceOne;
import hilelll.interfaces.hw13remake.interfaces.InterfaceThree;
import hilelll.interfaces.hw13remake.interfaces.InterfaceTwo;

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
