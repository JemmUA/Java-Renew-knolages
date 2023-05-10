package hilelll.interfaces.practice1;

public interface Activity {
    String var = "interfaces"; // All variables of interfaces are CONSTANT and static

    void work();
    void doSports();
    static void sayHello() {
        System.out.println("Hello - static interface method. " + var);
    }

    static void sayHelloThreeTimes() {
        for (int i = 0; i < 3; i++) {
            sayHello();
        }
    }

    default void say(String say) {
        System.out.println(say);
    }

    default void shout(String shout) {
        System.out.println(shout);
    }
}
