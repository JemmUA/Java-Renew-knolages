package hilelll.hibernate.relationships.dao;


import hilelll.hibernate.relationships.model.Role;
import hilelll.hibernate.relationships.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RoleDao {
    public void save(Role role) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(role);

        transaction.commit();
        session.close();
    }
    public Role getById(int id) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Role role = session.get(Role.class,id);

        transaction.commit();
        session.close();

        return role;
    }
}
