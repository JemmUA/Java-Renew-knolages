package hilelll.multiThread.practice2.lesson1;

import java.util.concurrent.ExecutionException;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Threads: Thread, Runnable, Runnable(quick), Callable
        // Methods:
        //          start(), aliveCount(), isAlive(), interrupt(), setName(), getName(),
        //          sleep(), yield(), join(), Thread.currentThread()
        // Runnable (quick): Thread thread = new Thread(() -> { });
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Here is My method in thread");
            }
        });
        // Or
        Thread threadQ = new Thread(() -> System.out.println("Here is My method in thread"));

        //        MyThread myThread1 = new MyThread();
//        MyThread myThread2 = new MyThread();
//        MyThread myThread3 = new MyThread();
//        MyThread myThread4 = new MyThread();
//
//        MyRunnable myRunnable = new MyRunnable();
//        Thread myThreadR1 = new Thread(myRunnable);
//        Thread myThreadR2 = new Thread(myRunnable);
//        Thread myThreadR3 = new Thread(myRunnable);
//        Thread myThreadR4 = new Thread(myRunnable);


//        CustomCallable customCallable = new CustomCallable();
//        FutureTask<String> taskCallable = new FutureTask<>(customCallable);
//        Thread threadCallable = new Thread(taskCallable);
//        threadCallable.start();
//        System.out.println(taskCallable.get());
//
//
//        MyCallable myCallable = new MyCallable();
//        FutureTask<String> myFutureTask = new FutureTask<>(myCallable);
//        Thread myThreadC1 = new Thread(myFutureTask);
//
//        Object stringResult = myFutureTask.get();
//        System.out.println(stringResult);

//        myThread1.start();
//        myThread2.start();
//        myThread3.start();
//        myThread4.start();
//

//        myThreadC1.start();

        // Tht way to crate thread without additional class
        Thread threadQuick = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                 System.out.println("quick thread");
            }
        });
        threadQuick.start();
        threadQuick.join();
//
//        myThreadR1.start();
//        myThreadR2.start();
//        myThreadR3.start();
//        myThreadR4.start();

    }
}
