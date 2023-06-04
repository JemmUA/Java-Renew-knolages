package hilelll.hibernate.relationships.service;

import hilelll.hibernate.relationships.dao.UserDao;
import hilelll.hibernate.relationships.model.User;

import java.util.List;

public class UserService {
    UserDao userDao = new UserDao();
    public void save(User user) {
        userDao.save(user);
    }
    public User getById(int id) {
        return userDao.getById(id);
    }
    public List<User> getAll() {
        return userDao.getAll();
    }
}
