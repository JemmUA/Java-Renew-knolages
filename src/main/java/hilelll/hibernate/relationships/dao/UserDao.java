package hilelll.hibernate.relationships.dao;

import hilelll.hibernate.relationships.model.User;
import hilelll.hibernate.relationships.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class UserDao {
    public void save(User user) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(user);

        transaction.commit();
        session.close();
    }
    public User getById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = session.get(User.class,id);

        transaction.commit();
        session.close();

        return user;
    }

    public List<User> getAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        List<User> users = session.createNativeQuery("select * from racing.drivers").list();
        Query query = session.createNativeQuery("select * from portal.users");
        List<User> users = query.getResultList();


        transaction.commit();
        session.close();

        return users;
    }

}
