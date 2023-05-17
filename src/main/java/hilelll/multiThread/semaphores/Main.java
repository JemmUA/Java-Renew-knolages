package hilelll.multiThread.semaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore table = new Semaphore(2);

        Visitor visitor1 = new Visitor();
        Visitor visitor2 = new Visitor();
        Visitor visitor3 = new Visitor();
        Visitor visitor4 = new Visitor();
        Visitor visitor5 = new Visitor();
        Visitor visitor6 = new Visitor();
        Visitor visitor7 = new Visitor();

        visitor1.setTable(table);
        visitor2.setTable(table);
        visitor3.setTable(table);
        visitor4.setTable(table);
        visitor5.setTable(table);
        visitor6.setTable(table);
        visitor7.setTable(table);

        visitor1.start();
        visitor2.start();
        visitor3.start();
        visitor4.start();
        visitor5.start();
        visitor6.start();
        visitor7.start();

    }

}
