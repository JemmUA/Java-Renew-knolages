package hilelll.multiThread.lessons.practice2.lesson1.threads;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is started");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println(Thread.currentThread().getName()+ " finished");

    }
}
