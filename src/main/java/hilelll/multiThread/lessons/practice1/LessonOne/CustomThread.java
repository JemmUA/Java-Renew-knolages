package hilelll.multiThread.lessons.practice1.LessonOne;

public class CustomThread extends Thread{
    @Override
    public void run() {
//        super.run();

//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("My thread started!");
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" - " + Thread.currentThread().getName());
        }

    }
}
