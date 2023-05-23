package hilelll.multiThread.waitNotify;

import hilelll.multiThread.deadlock.Left;

public class Main {
    /*
    Object.wait() to suspend a thread
    Object.notify() to wake a thread up
*/
    /*
    https://www.baeldung.com/cs/monitor
    * A monitor is a synchronization mechanism that allows threads to have:
            * mutual exclusion – only one thread can execute the method
              at a certain point in time, using locks
            * cooperation – the ability to make threads
              wait for certain conditions to be met, using wait-set
    *
    * it monitors how threads access some resources.

    wait() orders the calling thread to release the monitor
    and go to sleep until some other thread enters this monitor
    and calls notify().

    Also, notify() wakes up the first thread that called wait() on the specific object.

    * */

    public static void main(String[] args) throws InterruptedException {
        // wait vs notify example

        Object o = new Object();
        Thread thread = new Thread(() -> {
            synchronized (o) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread running " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
//                o.notifyAll();
                o.notify();
            }
        }) ;
        thread.start();
        synchronized (o) {
//            o.wait(5000);
            o.wait();
        }
        System.out.println("finished");
    }

}
