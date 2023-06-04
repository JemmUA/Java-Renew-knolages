package hilelll.hibernate.practicing.lesson03.util;

import hilelll.hibernate.practicing.lesson03.model.House;
import hilelll.hibernate.practicing.lesson03.model.Passport;
import hilelll.hibernate.practicing.lesson03.model.Role;
import hilelll.hibernate.practicing.lesson03.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();//for hibernate.cfg.xml

                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(House.class);
                configuration.addAnnotatedClass(Passport.class);
                configuration.addAnnotatedClass(Role.class);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Session factory Error: " + e);
            }
        }
        return sessionFactory;
    }
}