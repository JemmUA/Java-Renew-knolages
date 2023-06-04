package hilelll.hibernate.relationship2.dao;

import hilelll.hibernate.practicing.practice2.model.Driver;
import hilelll.hibernate.relationship2.util.HibConf;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DriverDao {
    public void save(Driver driver) {
        SessionFactory sessionFactory = HibConf.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(driver);

        transaction.commit();
        session.close();
    }

}
