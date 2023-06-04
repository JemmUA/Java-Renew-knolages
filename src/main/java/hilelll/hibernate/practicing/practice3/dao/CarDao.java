package hilelll.hibernate.practicing.practice3.dao;

import hilelll.hibernate.practicing.practice3.entity.Car;
import hilelll.hibernate.practicing.practice3.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class CarDao {
    public void save(Car car) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(car);

        transaction.commit();
        session.close();
    }
    public Car getById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Car car = session.get(Car.class, id);

        transaction.commit();
        session.close();

        return car;
    }

    public void update(Car car) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(car);

        transaction.commit();
        session.close();

    }

    public void delete(Car car) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(car);

        transaction.commit();
        session.close();

    }

    public Car getByVinCode(String vinCode) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

         Query query = session.createNativeQuery("select * from car_shop.cars where vin_code = :vinCode", Car.class);
         query.setParameter("vinCode", vinCode);
         Car carByVinCode = (Car) query.getSingleResult();

        transaction.commit();
        session.close();

        return carByVinCode;
    }

    public List<Car> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        Query query = session.createNativeQuery("select * from car_shop.cars", Car.class);
        Query query = session.createNamedQuery("getAll");
        List<Car> cars = query.getResultList();

        transaction.commit();
        session.close();

        return cars;
    }

    public Car getByModel(String model) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNamedQuery("getByModel");
        query.setParameter("model", model);
        Car carByModel = (Car) query.getSingleResult();

        transaction.commit();
        session.close();

        return carByModel;
    }


}
