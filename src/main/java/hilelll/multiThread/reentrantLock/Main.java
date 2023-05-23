package hilelll.multiThread.reentrantLock;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            LockExample lockExample = new LockExample();

            @Override
            public void run() {
                lockExample.print();
                lockExample.write();

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            LockExample lockExample = new LockExample();

            @Override
            public void run() {
                lockExample.print();
                lockExample.write();

            }
        });
        thread1.start();
        thread2.start();
    }

}
