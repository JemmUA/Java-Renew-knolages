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

        int delay = 500;
        thread1.start();
//        thread1.join();//other threads waits until thread1 finished
        thread1.join(delay);//other threads waits delay (ms)
        thread2.start();

//        System.out.println(1/0); // exception do not interrupt other threads


    MyThread thread3 = new MyThread();
    MyRunnable runnable2 = new MyRunnable(); // Runnable allows to extend another class
    Thread thread4 = new Thread(runnable2);



        for(
    int i = 0;
    i< 10;i++)

    {
        System.out.println("Thread MAIN: " + i);
        try {
            Thread.sleep(100);
//                System.out.println(1/0); // exception do not interrupt other threads
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
        System.out.println("Thread MAIN is finished");
        MyThread thread5 = new MyThread(){
            public void run() {
        if (!Thread.currentThread().isDaemon()) {
            System.out.println("this is a user thread and is running");
        } else {
            System.out.println("This thread is a Deamon thread. And is runnig");
        }

                for (int i = 10; i > 0; i--) {
                    System.out.println("Thread #5: " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Thread #5 is finished");
            }

        };
        thread5.setDaemon(false);
        thread5.start();
    }
}
