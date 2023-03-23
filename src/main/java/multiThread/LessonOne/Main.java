package main.java.multiThread.LessonOne;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main extends Thread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println(Thread.currentThread().getName());
        CustomThread customThread = new CustomThread();
//        customThread.run();
        customThread.start();
        customThread.yield();
        CustomThread customThread2 = new CustomThread();
        customThread2.start();
        customThread2.join();
        customThread2.interrupt();
        System.out.println(customThread2.getName() + " is interrupted " + customThread2.isInterrupted());
        System.out.println(customThread2.getName() + " is alive " + customThread2.isAlive());

//        CustomRunnable customRunnable = new CustomRunnable();
//        Thread threadRunnable = new Thread(customRunnable);
//        threadRunnable.start();

        CustomCallable customCallable = new CustomCallable();
        FutureTask<String> taskCallable = new FutureTask<>(customCallable);
        Thread threadCallable = new Thread(taskCallable);
        threadCallable.start();
        System.out.println(taskCallable.get());

//        customThread.start();
//        customThread2.start();
//        treadCallable.start();
//        threadRunnable.start();
//        Thread fastThread = getFastThread();
//        fastThread.start();
//
//        System.out.println("Join thread: " + customThread.getName());
//        customThread.yield();

//        System.out.println(customThread.getName() + " is alive - " + customThread.isAlive());
//        System.out.println(customThread2.getName() + " is alive - " + customThread2.isAlive());
//        System.out.println(Thread.currentThread().getName() + " is alive - " + Thread.currentThread().isAlive());

//        manyThreads();


        System.out.println("Active threads count: " + Thread.activeCount());

        System.out.println("finished - " + Thread.currentThread().getName());
    }

    private static Thread getFastThread() {
        Thread fastThread = new Thread(() -> {
            System.out.println("Thread without creating custom class");
            for (int i = 0; i < 4; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                System.out.println("Active threads: " + Thread.activeCount());
                System.out.println("Priority of current threads: " + Thread.currentThread().getPriority());
            }
        }
        );
        return fastThread;
    }

    private static void manyThreads() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(() ->
                    System.out.println("Current thread: " + Thread.currentThread().getName()))
                    .start();
            Thread.sleep(1000);
            System.out.println("Active threads: " + Thread.activeCount());
            currentThread().setPriority(10);
            System.out.println("Priority of current threads: " + Thread.currentThread().getPriority());// 1-10 (10 is highest)
        }
    }
}
