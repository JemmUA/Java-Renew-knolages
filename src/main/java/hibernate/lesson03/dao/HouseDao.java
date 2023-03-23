package hibernate.lesson03.dao;

import hibernate.lesson03.model.House;
import hibernate.lesson03.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HouseDao {
    public void save(House house) {

    SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();

        session.save(house);

        transaction.commit();
        session.close();
}

}
