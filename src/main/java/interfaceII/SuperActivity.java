package interfaceII;

public interface SuperActivity {
    void work();
    void doSports();

    void haveRest();

    default void shout(String shout) {
        System.out.println(shout+ "    AAAAAAAAAAAAAAAAAA");
    }
}

