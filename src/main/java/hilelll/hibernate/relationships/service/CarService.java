package hilelll.hibernate.relationships.service;

import hilelll.hibernate.relationships.dao.CarDao;
import hilelll.hibernate.relationships.model.Car;

public class CarService {
    CarDao carDao = new CarDao();
    public void save(Car car) {
        carDao.save(car);
    }
}
