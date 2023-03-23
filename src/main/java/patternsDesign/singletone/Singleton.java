package patternsDesign.singletone;


public class Singleton {
    private static Singleton instance;
    private String configuration;

    private Singleton(String configuration) {
        this.configuration = configuration;
    }

    public static synchronized Singleton instance(String configuration) {
        if (instance == null) {
            instance = new Singleton(configuration);
        }
        return instance;
    }
}
