package hilelll.multiThread.semaphores.crossroad;

import java.util.concurrent.Semaphore;

public class CrossRoad {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Active threads: " + Thread.activeCount());
        System.out.println("Cars approach crossroad");
        Semaphore semaphore = new Semaphore(1);

        Car car1 = new Car("Red", semaphore);
        Car car2 = new Car("Green", semaphore);
        Car car3 = new Car("Blue", semaphore);
        Car car4 = new Car("Cops", semaphore);
        car1.start();
        car2.start();
        car3.start();
        car4.start();

//        System.out.println(car3.getName()+ " - i must go last");
//        car3.yield();
//        System.out.println(car4.getName()+ " turned on their blinkers");
//        car4.join();
    }
}
