package hilelll.hibernate.practicePlus.dao;

import hilelll.hibernate.practicePlus.model.Sport;
import hilelll.hibernate.practicePlus.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SportDao {
    public void save(Sport sport) {

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(sport);

        transaction.commit();
        session.close();
    }
}
