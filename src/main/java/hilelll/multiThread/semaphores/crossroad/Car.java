package hilelll.multiThread.semaphores.crossroad;

import java.util.concurrent.Semaphore;

public class Car extends Thread {
    Semaphore semaphore;
    String name;

    public Car(String name, Semaphore semaphore) {
        super(name);
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": I wait");
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + ": Now i go!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + ": I passed over crossroad");
        semaphore.release();
        System.out.println("Active threads: " + Thread.activeCount());
    }

    public void setSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
}
