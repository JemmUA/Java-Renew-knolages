package codeBro.javaCore.threads;

public class Part2 {
    public static void main(String[] args) throws InterruptedException {


        /*
         * Multithreading = Process of executing multiply threads simultaneously
         *                   Helps maximum utilization of CPU
         *                   Threads are independent, they don't affect execution of other threads.
         *                   An exception in one thread will not interrupt other threads
         *                   useful for serving multiply clients, multiplayer games, ot other mutually independent tasks
         *
         *
         * */

        MyThread thread1 = new MyThread();
        MyRunnable runnable1 = new MyRunnable(); // Runnable allows to extend another class
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
//        thread1.join();//main thread waits until thread1 finished
        thread1.join(3000);//main thread waits 3000 ms
        thread2.start();

//        System.out.println(1/0); // exception do not interrupt other threads
    }
}
