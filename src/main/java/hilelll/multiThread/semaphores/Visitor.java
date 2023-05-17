package hilelll.multiThread.semaphores;

import java.util.concurrent.Semaphore;

public class Visitor extends Thread {
    private Semaphore table;

    @Override
    public void run() {
        System.out.println(this.getName() + " waiting for table");
        try {
            table.acquire();
            System.out.println(this.getName() + " is eating");
            System.out.println(this.getName() + " release table");
            table.release();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void setTable(Semaphore table) {
        this.table = table;
    }
}

