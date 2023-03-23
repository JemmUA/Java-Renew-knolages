package hibernate.lesson02.dao;

import hibernate.lesson02.entity.Car;
import hibernate.lesson02.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CarDao {

    public void save(Car car) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(car);

//        Entity entity = session.byId(Entity.class),getReference(id);
//        (List<User>) HibernateUtil.getSessionFactory().openSession().creatQuery("From path.User").list;
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
    public void deleteById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNamedQuery("deleteById");
//        query.getSingleResult();
        //        session.delete(Car.class, id);

        transaction.commit();
        session.close();
    }
    public List<Car> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNamedQuery("getAll");
        List<Car> cars = query.getResultList();

        transaction.commit();
        session.close();

        return cars;
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
    public Car getByVinCode(String vinCode) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


//        Query query = session.createNativeQuery("select * from cars where vin_code = :vinCode", Car.class);
        Query<Car> query = session.createNamedQuery("getByVinCode", Car.class);
        query.setParameter("vinCode", vinCode);
        Car car = (Car) query.getSingleResult();


        transaction.commit();
        session.close();

        return car;
    }

    public List<Car> getByModel(String model) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


//        Query query = session.createNativeQuery("select * from cars where vin_code = :vinCode", Car.class);
        Query<Car> query = session.createNamedQuery("getByModel", Car.class);
        query.setParameter("model", model);
        List<Car> cars = query.getResultList();

        transaction.commit();
        session.close();

        return cars;
    }

    public List<Car> getByType(String type) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query<Car> query = session.createNamedQuery("getByType", Car.class);
        query.setParameter("type", type);
        List<Car> cars = query.getResultList();

        transaction.commit();
        session.close();

        return cars;
    }
}
