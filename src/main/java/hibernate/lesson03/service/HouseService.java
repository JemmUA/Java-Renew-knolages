package hibernate.lesson03.service;

import hibernate.lesson03.dao.HouseDao;
import hibernate.lesson03.model.House;

public class HouseService {
    HouseDao houseDao = new HouseDao();
    public void save(House house) {
        houseDao.save(house);
    }
}
