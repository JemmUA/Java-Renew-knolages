package hilelll.multiThread.practice2.lesson1.threads;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName()+" is started");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println(Thread.currentThread().getName()+ " finished");
    }
}
