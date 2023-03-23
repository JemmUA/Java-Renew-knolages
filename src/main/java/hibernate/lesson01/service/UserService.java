package hibernate.lesson01.service;

import hibernate.lesson01.dao.UserDao;
import hibernate.lesson01.dao.UserDaoImpl;
import hibernate.lesson01.model.User;

import java.util.List;

public class UserService {
    UserDao userDao = new UserDaoImpl();

    public void save(User user) {
        if (user == null) {
            System.out.println("User is null");
        }

        // some logic...

        userDao.save(user);
    }

    public User getById(int id) {
        User user = userDao.getById(id);
        //some validation...
        return user;
    }

    public List<User> gerAll() {
        return userDao.getAll();
    }

}
