package hilelll.hibernate.practicing.lesson03.dao;

import hilelll.hibernate.practicing.lesson03.model.Passport;
import hilelll.hibernate.practicing.lesson03.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PassportDao {
    public void save(Passport passport) {

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(passport);

        transaction.commit();
        session.close();
    }
}
