package hilelll.hibernate.relationship2.service;

import hilelll.hibernate.relationships.dao.DriverDao;
import hilelll.hibernate.relationships.model.Driver;

public class DriverService {
    DriverDao driverDao = new DriverDao();
    public void save(Driver driver) {
        driverDao.save(driver);
    }

}
