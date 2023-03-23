package hibernate.practicePlus.service;

import hibernate.practicePlus.dao.ApprenticeDao;
import hibernate.practicePlus.dao.SportDao;
import hibernate.practicePlus.model.Apprentice;
import hibernate.practicePlus.model.Sport;

public class SportService {
    SportDao sportDao = new SportDao();
    public void save(Sport sport) {
        sportDao.save(sport);
    }
}
