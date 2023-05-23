package hilelll.multiThread.volatiles;

public class Main {
    static private volatile int counter = 0;

    public static void main(String[] args) {
        // volatile + primitives = cache off
        // 1. volatile does not resolve atomicity problem
        // 2. recording to this variable must not depend from previous value of this variable
        // 3. volatile not suitable for increment, decrement and other operations

        // wrong result of increment for volatile
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(() -> {
//                for (int j = 0; j < 10; j++) {
//                    counter++;
//                }
//            });
//            thread.start();
//        }
//        System.out.println(counter);



        // volatile example
        volatileExample();
    }
    private static void volatileExample() {
        counter = 0;
        Thread thread1 = new Thread (() -> {
            while (counter < 10) {
                System.out.println("thread1 "+ ++counter);
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() ->{
                int incrementCached = counter;
            while (counter < 10) {
                if (incrementCached != counter) {
                    System.out.println("thread2 counter " + counter);
                    System.out.println("thread2 incrementCached " + incrementCached);
                    incrementCached = counter;
                }
            }
        }
        );
        thread2.start();
    }
}
