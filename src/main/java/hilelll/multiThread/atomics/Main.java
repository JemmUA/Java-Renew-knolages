package hilelll.multiThread.atomics;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // import java.util.concurrent.atomic.*;
        //          Integer         AtomicInteger
        //          Boolean         AtomicBoolean
        //          Long            AtomicLong
        //          IntegerArray    AtomicIntegerArray
        // Atomic + LongArray       AtomicLongArray
        //          ...
        //          ...
        //          ...
        //

        AtomicInteger atomicInteger = new AtomicInteger();
//        atomicInteger.incrementAndGet(); // i++
//        atomicInteger.incrementAndGet(); // i++
//        atomicInteger.incrementAndGet(); // i++
//        System.out.println(atomicInteger.get());
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    atomicInteger.incrementAndGet();
                }
//                System.out.println("atomic: " + atomicInteger.get());

            });
            thread.start();

        }

        Thread.sleep(1);// delay for incrementing was finished
        System.out.println("atomic: " + atomicInteger.get());

    }
}
