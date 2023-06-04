package hilelll.hibernate.practicing.lesson03.service;

import hilelll.hibernate.practicing.lesson03.dao.UserDao;
import hilelll.hibernate.practicing.lesson03.model.User;

public class UserService {
    UserDao userDao = new UserDao();
    public void save(User user) {
        userDao.save(user);
    }

}
