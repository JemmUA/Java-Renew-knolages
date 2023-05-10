package hilelll.hibernate.practicePlus.dao;

import hilelll.hibernate.practicePlus.model.Apprentice;
import hilelll.hibernate.practicePlus.util.HibernateConfig;
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
