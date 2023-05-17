package hilelll.multiThread.practice1.LessonOne;

public class CustomRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable started");
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }
}
