package hilelll.hibernate.relationships.dao;

import hilelll.hibernate.relationships.model.Car;
import hilelll.hibernate.relationships.model.Driver;
import hilelll.hibernate.relationships.model.User;
import hilelll.hibernate.relationships.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DriverDao {
    public void save(Driver driver) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(driver);

        transaction.commit();
        session.close();
    }
    public Driver getById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Driver driver = session.get(Driver.class,id);

        transaction.commit();
        session.close();

        return driver;
    }

}
