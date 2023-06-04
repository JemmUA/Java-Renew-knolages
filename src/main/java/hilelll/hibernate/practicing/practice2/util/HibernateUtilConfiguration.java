package hilelll.hibernate.practicing.practice2.util;



import hilelll.hibernate.practicing.practice2.model.Driver;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtilConfiguration {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();  // Looking for configuration file: hibernate.cfg.xml or hibernate.properties (by default in folder 'resources'
                                                                                // Or configure in code (not recommended).
                configuration.addAnnotatedClass(Driver.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
                        applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.err.println("Session factory error: " + e);
            }
        }
        return sessionFactory;
    };
}
