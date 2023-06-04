package hilelll.hibernate.relationships.dao;

import hilelll.hibernate.relationships.model.Car;
import hilelll.hibernate.relationships.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CarDao {
    public void save(Car car) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(car);

        transaction.commit();
        session.close();
    }

}
