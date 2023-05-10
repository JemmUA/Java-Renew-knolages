package hilelll.multiThread.lessonTwoSinchronized;

public class SynchService {
    public int counter;

    public int getCounter() {
        return counter;
    }

    public synchronized void synchroMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            counter++;
        }
    }

    public void synchronizedThisLogicPartMethod() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Synchronized this part " + Thread.currentThread().getName());

            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("NOT Synchronized this part " + Thread.currentThread().getName());

        }

    }

    public void synchronizedOnObjectLogicPartMethod(Object o) {
//        Object o = new Object();
        synchronized (o) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Synchronized this part on object " + Thread.currentThread().getName());

            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("NOT Synchronized this part on object " + Thread.currentThread().getName());

        }

    }

}
