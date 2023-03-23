package interfaceII;

public interface First {
    public default void conflict() {
        System.out.println("I'm FIRST");
    }

}
