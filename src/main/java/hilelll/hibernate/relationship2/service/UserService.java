package hilelll.hibernate.relationship2.service;


import hilelll.hibernate.relationship2.dao.UserDao;
import hilelll.hibernate.relationship2.model.Role;
import hilelll.hibernate.relationship2.model.User;

public class UserService {
    UserDao userDao = new UserDao();
    public void save(User user) {
        userDao.save(user);
    }

}
