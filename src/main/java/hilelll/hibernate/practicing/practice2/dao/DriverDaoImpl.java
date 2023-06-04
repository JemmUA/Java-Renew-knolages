package hilelll.hibernate.practicing.practice2.dao;

import hilelll.hibernate.practicing.lesson02.entity.Car;
import hilelll.hibernate.practicing.lesson02.util.HibernateUtil;
import hilelll.hibernate.practicing.practice2.model.Driver;
import hilelll.hibernate.practicing.practice2.util.HibernateUtilConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class DriverDaoImpl implements DriverDao{
    @Override
    public void save(Driver driver) {
        SessionFactory sessionFactory = HibernateUtilConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(driver);

        transaction.commit();
        session.close();

    }

    @Override
    public Driver getById(int id) {
        SessionFactory sessionFactory = HibernateUtilConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Driver driver = session.get(Driver.class,id);
//        Driver driver = session.byId(Driver.class).getReference(id); // works incorrectly


        transaction.commit();
        session.close();
        return driver;
    }

    @Override
    public List<Driver> getAll() {
        SessionFactory sessionFactory = HibernateUtilConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        List<Driver> drivers = session.createNativeQuery("select * from racing.drivers").list();
        Query query = session.createNativeQuery("select * from racing.drivers");
        List<Driver> drivers = query.getResultList();

        transaction.commit();
        session.close();
        return drivers;
    }

    @Override
    public void update(Driver driver) {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            session.update(driver);

            transaction.commit();
            session.close();
    }
}
