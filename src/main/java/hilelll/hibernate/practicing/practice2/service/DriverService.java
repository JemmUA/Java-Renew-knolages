package hilelll.hibernate.practicing.practice2.service;

import hilelll.hibernate.practicing.practice2.dao.DriverDaoImpl;
import hilelll.hibernate.practicing.practice2.model.Driver;

import java.util.List;

public class DriverService {
    DriverDaoImpl driverDao = new DriverDaoImpl();

    public void save(Driver driver){
        if (driver == null) {
            System.err.println("Driver is null");
        }
        // some logic ...
        driverDao.save(driver);
    }

    public Driver getById(int id){
        return driverDao.getById(id);
    }

    public List<Driver> getAll(){
        return driverDao.getAll();
    };

    public void update(Driver driver) {
        driverDao.update(driver);
    }

}
