package hilelll.referenceMethods;

public class Boy {
    private String name;
    private static Integer boysCount = 0;

    public Boy() {
        boysCount += 1;
    }

    public Boy(String name) {
        this.name = name;
        boysCount += 1;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                '}';
    }


    public void say(String say) {
        System.out.println(say);
    }
    public static Integer showBoysCount() {
        System.out.println(boysCount);
        return boysCount;
    }

}
