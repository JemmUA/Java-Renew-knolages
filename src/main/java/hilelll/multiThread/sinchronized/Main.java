package hilelll.multiThread.sinchronized;

public class Main {
    static int counter = 0;
    public static void main(String[] args) {
        Object o = new Object(); // right - synchronizing on single object

        Synchro synchro = new Synchro();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
//                syncMethod();
                synchro.syncOnThis(o);
            });

            thread.start();
        }
        System.out.println(counter);

    }

    public static synchronized void syncMethod() {
        for (int i = 0; i < 10; i++) {
            counter++;
            System.out.println(Thread.currentThread().getName());
        }
    }

}
