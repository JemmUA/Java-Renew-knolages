package hilelll.hibernate.practicePlus.service;

import hilelll.hibernate.practicePlus.dao.SportDao;
import hilelll.hibernate.practicePlus.model.Sport;

public class SportService {
    SportDao sportDao = new SportDao();
    public void save(Sport sport) {
        sportDao.save(sport);
    }
}
