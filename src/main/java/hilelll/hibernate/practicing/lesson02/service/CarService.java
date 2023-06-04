package hilelll.hibernate.practicing.lesson02.service;

import hilelll.hibernate.practicing.lesson02.dao.CarDao;
import hilelll.hibernate.practicing.lesson02.entity.Car;

import java.util.List;

public class CarService {
    private CarDao carDao= new CarDao();
    public void save(Car car) {
        carDao.save(car);
    }

    public Car getById(int id) {
        return carDao.getById(id);
    }
    public List<Car> getAll() {
        return carDao.getAll();
    }

    public void update(Car car) {
        carDao.update(car);
    }
    public void delete(Car car) {
        carDao.delete(car);
    }
    public void deleteById(int id) {
        carDao.deleteById(id);
    }
    public Car getByVinCode(String vinCode) {
        return carDao.getByVinCode(vinCode);
    }

    public List<Car> getByModel(String model) {
        return carDao.getByModel(model);
    }
    public List<Car> getByType(String type) {
        return carDao.getByType(type);
    }
}
