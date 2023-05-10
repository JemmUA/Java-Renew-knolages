package hilelll.multiThread.LessonOne;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<String> {


    @Override
    public String call() throws Exception {
        System.out.println("Callable started " + Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
//        Scanner scanner = new Scanner(System.in);
//        String inputString = scanner.nextLine();
        return "Result of CALLABLE: "+Thread.currentThread().getName();
    }
}
