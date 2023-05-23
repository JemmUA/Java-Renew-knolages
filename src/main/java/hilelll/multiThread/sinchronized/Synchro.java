package hilelll.multiThread.sinchronized;

public class Synchro {
    public void syncOnThis(Object o) {
        for (int i = 0; i < 10; i++) {
            System.out.println("not sync");
        }
        for (int i = 0; i < 3; i++) {
            // synchronizing part of code on ' this '
            synchronized (this) {
                System.out.println("SYNC");
            }
            // synchronizing on object
//            Object o = new Object(); // wrong - need synchronizing on single object
            synchronized (o) {
                for (int i1 = 0; i1 < 10; i1++) {
                    System.out.println("Object");
                }
            }
        }
    }
}
