package hilelll.hibernate.lesson03.service;

import hilelll.hibernate.lesson03.dao.UserDao;
import hilelll.hibernate.lesson03.model.User;

public class UserService {
    UserDao userDao = new UserDao();
    public void save(User user) {
        userDao.save(user);
    }

}
