package hilelll.hibernate.practicing.practice1.dao;

import hilelll.hibernate.practicing.practice1.model.Apprentice;
import hilelll.hibernate.practicing.practice1.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ApprenticeDao {
    public void save(Apprentice apprentice) {

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(apprentice);

        transaction.commit();
        session.close();
    }
}
