package hibernate.lesson03.service;

import hibernate.lesson03.dao.UserDao;
import hibernate.lesson03.model.User;

public class UserService {
    UserDao userDao = new UserDao();
    public void save(User user) {
        userDao.save(user);
    }

}
