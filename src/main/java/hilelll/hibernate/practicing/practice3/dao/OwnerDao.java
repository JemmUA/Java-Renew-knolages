package hilelll.hibernate.practicing.practice3.dao;

import hilelll.hibernate.practicing.practice3.entity.Owner;
import hilelll.hibernate.practicing.practice3.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OwnerDao {

    public void save(Owner owner) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(owner);

        transaction.commit();
        session.close();
    }
    public Owner getById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Owner owner = session.get(Owner.class,id);

        transaction.commit();
        session.close();

        return owner;

    }

}
