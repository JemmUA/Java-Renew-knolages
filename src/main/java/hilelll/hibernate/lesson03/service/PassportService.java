package hilelll.hibernate.lesson03.service;

import hilelll.hibernate.lesson03.dao.PassportDao;
import hilelll.hibernate.lesson03.model.Passport;

public class PassportService {
    PassportDao passportDao = new PassportDao();
    public void save(Passport passport) {
        passportDao.save(passport);
    }

}
