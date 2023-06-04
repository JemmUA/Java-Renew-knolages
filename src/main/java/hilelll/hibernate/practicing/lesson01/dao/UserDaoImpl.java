package hilelll.hibernate.practicing.lesson01.dao;

import hilelll.hibernate.practicing.lesson01.model.User;
import hilelll.hibernate.practicing.lesson01.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public User getById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        User user = session.byId(User.class).getReference(id);
        User user = session.get(User.class, id);


        transaction.commit();
        session.close();
        
        return user;
    }

    @Override
    public List<User> getAll() {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<User> users = session.createQuery("from User").list();

        transaction.commit();
        session.close();

        return users;
    }

    @Override
    public void save(User user) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(user);

//        Entity entity = session.byId(Entity.class),getReference(id);
//        (List<User>) HibernateUtil.getSessionFactory().openSession().creatQuery("From path.User").list;
        transaction.commit();
        session.close();
    }
}
