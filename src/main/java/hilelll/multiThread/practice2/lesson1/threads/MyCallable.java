package hilelll.multiThread.practice2.lesson1.threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " is started");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println(Thread.currentThread().getName() + " finished");
        return "result of callable";
}
}
