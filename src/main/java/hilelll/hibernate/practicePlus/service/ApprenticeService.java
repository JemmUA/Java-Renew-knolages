package hilelll.hibernate.practicePlus.service;

import hilelll.hibernate.practicePlus.dao.ApprenticeDao;
import hilelll.hibernate.practicePlus.model.Apprentice;

public class ApprenticeService {
    ApprenticeDao apprenticeDao = new ApprenticeDao();
    public void save(Apprentice apprentice) {
        apprenticeDao.save(apprentice);
    }
}
