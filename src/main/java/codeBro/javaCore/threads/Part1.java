package codeBro.javaCore.threads;

public class Part1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        * A thread of execution in a program (kind of like a virtual GPU
        * The JVM allows an application to have multiple threads running concurrently
        * Each thread can execute parts your code in parallel with the main thread
        * Each thread has priority
        * Thread with higher priority are executed in preference compared to threads with lower priority
        *
        * The Java Virtual Machine continues to execute threads until either of the following occurs
        * 1. The exit method of class Runtime has been called
        * 2. All user threads have died
        *
        * When JVM starts up, there is a thread which calls the main method
        * This thread is called "main"
        *
        * Deamon thread is a low priority thread that runs in background to perform task like a garbage collector
        * JVM terminates itself when all user threads (non-deamon threads) finish their execution
        *
        * */

//        System.out.println(Thread.activeCount());
//
//        Thread.currentThread().setName("MAIN");
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setPriority(3); // from 1 to 10, where 1 - lowest priority, 10 - higher priority
//
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().isAlive());

//        for (int i = 3; i >= 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("You are done");

        Thread thread2 = new Thread();
        Thread thread3 = new Thread();
        Thread thread4 = new Thread();

        thread2.setName("SECOND thread");

        thread2.start();
        thread3.start();
        thread4.start();
        System.out.println(thread2.getName());
        System.out.println(thread3.getName());
        System.out.println(thread4.getName());

        System.out.println(thread2.isAlive());
        System.out.println(Thread.activeCount());

        System.out.println(thread3.isDaemon());
        thread3.setDaemon(true);
        System.out.println(thread3.isDaemon());

    }
}
