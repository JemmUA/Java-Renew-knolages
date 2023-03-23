package hibernate.lesson03.service;

import hibernate.lesson03.dao.PassportDao;
import hibernate.lesson03.model.Passport;

public class PassportService {
    PassportDao passportDao = new PassportDao();
    public void save(Passport passport) {
        passportDao.save(passport);
    }

}
