package hilelll.multiThread.lessons.practice1.lessonTwoSinchronized.deadLock;

public class MainDeadLock {
    public static void main(String[] args) {
        RightHand rightHand = new RightHand();
        LeftHand leftHand = new LeftHand();
        rightHand.setLeftHand(leftHand);
        leftHand.setRightHand(rightHand);

        Thread thread1 = new Thread(() -> System.out.println(leftHand.callRightHand()));
        Thread thread2 = new Thread(() -> System.out.println(rightHand.callLeftHand()));
        thread1.start();
        try {
            thread1.join();//exit deadlock
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();

    }
}
