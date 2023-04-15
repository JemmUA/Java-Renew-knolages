package codeBro.javaCore.threads;

public class MyThread extends Thread {
    @Override
    public void run() {
//        if (!Thread.currentThread().isDaemon()) {
//            System.out.println("this is a user thread and is running");
//        } else {
//            System.out.println("This thread is a Deamon thread. And is runnig");
//        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Thread #1: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #1 is finished");
    }
}
