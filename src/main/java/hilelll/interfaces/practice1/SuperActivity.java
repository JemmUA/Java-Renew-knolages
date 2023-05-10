package hilelll.interfaces.practice1;

public interface SuperActivity {
    void work();
    void doSports();

    void haveRest();

    default void shout(String shout) {
        System.out.println(shout+ "    AAAAAAAAAAAAAAAAAA");
    }
}

