package hilelll.hibernate.practicing.practice1.service;

import hilelll.hibernate.practicing.practice1.dao.ApprenticeDao;
import hilelll.hibernate.practicing.practice1.model.Apprentice;

public class ApprenticeService {
    ApprenticeDao apprenticeDao = new ApprenticeDao();
    public void save(Apprentice apprentice) {
        apprenticeDao.save(apprentice);
    }
}
