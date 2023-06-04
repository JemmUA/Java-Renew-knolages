package hilelll.hibernate.relationship2.dao;

import hilelll.hibernate.relationship2.model.Role;
import hilelll.hibernate.relationship2.util.HibConf;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RoleDao {
    public void save(Role role) {
        SessionFactory sessionFactory = HibConf.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(role);

        transaction.commit();
        session.close();
    }

    public Role getById(int id) {
        SessionFactory sessionFactory = HibConf.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Role role = session.get(Role.class,id);

        transaction.commit();
        session.close();

        return role;
    }
}
