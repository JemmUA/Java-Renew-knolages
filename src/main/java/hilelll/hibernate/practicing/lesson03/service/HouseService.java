package hilelll.hibernate.practicing.lesson03.service;

import hilelll.hibernate.practicing.lesson03.dao.HouseDao;
import hilelll.hibernate.practicing.lesson03.model.House;

public class HouseService {
    HouseDao houseDao = new HouseDao();
    public void save(House house) {
        houseDao.save(house);
    }
}
