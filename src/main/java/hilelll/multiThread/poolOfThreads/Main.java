package hilelll.multiThread.poolOfThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    // ExecutorService for pool of threads
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();//  auto regulated count of threads
        ExecutorService executorServiceSingle = Executors.newSingleThreadExecutor();//  single thread
        ExecutorService executorServiceDefined = Executors.newFixedThreadPool(5); // defined count of threads
        executorService.execute(()-> System.out.println("Executors.newCachedThreadPool()"));
        executorServiceSingle.execute(()-> System.out.println("Executors.newSingleThreadExecutor()"));
        executorServiceDefined.execute(()-> System.out.println("Executors.newFixedThreadPool()"));
        executorService.shutdown();
        executorService.shutdownNow();
        System.out.println(Thread.activeCount());
    }
}
