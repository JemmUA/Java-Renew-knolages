package hilelll.multiThread.lessons.practice2.lesson1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("thread 1 started");
            for (int i = 0; i < 500; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("thread 1 finished");
        }
        );
        Thread t2 = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            String typed = scanner.nextLine();
            System.out.println(typed);

        }
        );
        t1.start();
        t2.start();

    }
}
