package hilelll.multiThread.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    // way to lock n methods
    // Lock lock = new ReentrantLock();
    //    lock.lock();
    //    lock.tryLock();
    //    lock.unlock();

     Lock lock = new ReentrantLock();

     public void print() {
         lock.lock();
         for (int i = 0; i < 10; i++) {
             System.out.println("print");
         }
     }
    public void write() {
        for (int i = 0; i < 10; i++) {
            System.out.println("writewritewrite");
        }
        lock.unlock();
    }

}
