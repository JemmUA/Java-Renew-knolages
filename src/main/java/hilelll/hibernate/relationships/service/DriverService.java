package hilelll.hibernate.relationships.service;

import hilelll.hibernate.relationships.dao.DriverDao;
import hilelll.hibernate.relationships.model.Driver;

public class DriverService {
    DriverDao driverDao = new DriverDao();
    public void save(Driver driver) {
        driverDao.save(driver);
    }

    public Driver getById(int id) {
        return driverDao.getById(id);
    }


}
