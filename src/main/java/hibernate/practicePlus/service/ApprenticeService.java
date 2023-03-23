package hibernate.practicePlus.service;

import hibernate.lesson03.dao.UserDao;
import hibernate.lesson03.model.User;
import hibernate.practicePlus.dao.ApprenticeDao;
import hibernate.practicePlus.model.Apprentice;

public class ApprenticeService {
    ApprenticeDao apprenticeDao = new ApprenticeDao();
    public void save(Apprentice apprentice) {
        apprenticeDao.save(apprentice);
    }
}
