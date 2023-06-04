package hilelll.hibernate.relationship2.dao;

import hilelll.hibernate.relationship2.model.User;
import hilelll.hibernate.relationship2.util.HibConf;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDao {
    public void save(User user) {
        SessionFactory sessionFactory = HibConf.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(user);

        transaction.commit();
        session.close();
    }

}
