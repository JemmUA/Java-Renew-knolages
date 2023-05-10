package hilelll.interfaces.practice1;

public interface Second extends First {
    public default void conflict() {
        System.out.println("I'm SECOND");

    }

    default void conflictOld() {
                First.super.conflict();
    }

    default void conflictNew() {
        conflict();
    }
}
