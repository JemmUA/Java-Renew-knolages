package hibernate.lesson03.dao;

import hibernate.lesson03.model.Passport;
import hibernate.lesson03.util.HibernateConfig;
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
