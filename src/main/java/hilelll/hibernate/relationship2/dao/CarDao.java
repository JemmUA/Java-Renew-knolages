package hilelll.hibernate.relationship2.dao;

import hilelll.hibernate.relationship2.util.HibConf;
import hilelll.hibernate.relationships.model.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CarDao {
    public void save(Car car) {
        SessionFactory sessionFactory = HibConf.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(car);

        transaction.commit();
        session.close();
    }

}
