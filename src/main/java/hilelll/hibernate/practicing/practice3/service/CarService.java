package hilelll.hibernate.practicing.practice3.service;

import hilelll.hibernate.practicing.practice3.dao.CarDao;
import hilelll.hibernate.practicing.practice3.entity.Car;

import java.util.List;

public class CarService {
    CarDao carDao = new CarDao();
    public void save(Car car){
        System.out.println("car for saving: " + car);
        carDao.save(car);
    }
    public Car getById(int id) {
        return carDao.getById(id);
    }
    public void update(Car car) {
        carDao.update(car);
    }
    public void delete(Car car) {
        carDao.delete(car);
    }

    public Car getByVinCode(String vinCode) {
        return carDao.getByVinCode(vinCode);
    }

    public List<Car> getAll() {
        return carDao.getAll();
    }
    public Car getByModel(String model) {
        return carDao.getByModel(model);
    }

}
