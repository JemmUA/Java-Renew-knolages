package hilelll.hibernate.practicing.practice1.service;

import hilelll.hibernate.practicing.practice1.dao.SportDao;
import hilelll.hibernate.practicing.practice1.model.Sport;

public class SportService {
    SportDao sportDao = new SportDao();
    public void save(Sport sport) {
        sportDao.save(sport);
    }
}
