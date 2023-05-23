package hilelll.multiThread.deadlock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        * Deadlock in Java is a part of multithreading.
        * Deadlock can occur in a situation when a thread is waiting for an object lock,
        * that is acquired by another thread and second thread is waiting for an object lock
        * that is acquired by first thread.
        * Since, both threads are waiting for each other to release the lock,
        * the condition is called deadlock.
        * https://www.javatpoint.com/deadlock-in-java
        * */
        Left left = new Left("left");
        Right right = new Right("right");

        left.setRight(right);
        right.setLeft(left);

        Thread leftThread = new Thread(() -> System.out.println(left.getFromRight()));
        Thread rightThread = new Thread(() -> System.out.println(right.getFromLeft()));

        leftThread.start();
        leftThread.join(); // avoid deadlock
        rightThread.start();

    }
}
