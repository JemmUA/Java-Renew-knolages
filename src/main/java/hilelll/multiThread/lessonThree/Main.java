package hilelll.multiThread.lessonThree;

import hilelll.multiThread.lessonThree.lock.LockExample;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static volatile int counter = 0;
    private static AtomicInteger atomicInteger = new AtomicInteger(0);


    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(() -> {
//                for (int j = 0; j < 10; j++) {
//
//                    counter++;
//                }
//            });
//            thread.start();
//        }
//        System.out.println("counter: "+ counter);

//        Thread thread1 = new Thread(() -> {
//            while (counter < 3) {
//                System.out.println("counter: " + ++counter);
//                System.out.println("atomicInteger: " + atomicInteger.incrementAndGet());
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//        });
//        thread1.start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("atomicInteger: " + atomicInteger);
//
//
//        Thread thread2 = new Thread(() -> {
//            int counter2 = counter;
//            System.out.println(counter2);
//            while (counter < 3) {
//                if (counter2 != counter) {
//                    System.out.println("counter 2: " + counter2 + " != counter " + counter);
//                }
//            }
//        });
//        thread2.start();

        // bad move for multiThread
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        Set<String> synchronizesSet = Collections.synchronizedSet(new HashSet<>());
        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap<>());

        // good move for multiThread
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        Set<String> keySet = ConcurrentHashMap.newKeySet();
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

//        lockExample();

        // Pool of threads
        ExecutorService executorServiceSingle = Executors.newSingleThreadExecutor();
        ExecutorService executorServiceFixed = Executors.newFixedThreadPool(5);

        ExecutorService executorServiceCached = Executors.newCachedThreadPool();
        executorServiceCached.execute(() -> System.out.println("Cached pool "));
        executorServiceCached.shutdown();
    }

    private static void lockExample() {
        LockExample lockExample = new LockExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                lockExample.print();
                lockExample.write();
            }
        });
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {

                lockExample.print();
                lockExample.write();
            }
        });
        thread1.start();
        thread2.start();

    }
}

