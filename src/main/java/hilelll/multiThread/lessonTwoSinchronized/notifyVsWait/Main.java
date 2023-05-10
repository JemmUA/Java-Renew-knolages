package hilelll.multiThread.lessonTwoSinchronized.notifyVsWait;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Thread thread = new Thread(() -> {
            synchronized (object) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                object.notify();//notify wakes waiting thread, notifyAll wakes all threads
            }
        });
        thread.start();
        synchronized (object) {

            object.wait();
        }
        System.out.println("Maaaaain!!");
    }
}
