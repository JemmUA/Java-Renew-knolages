package hilelll.hibernate.practicing.lesson01.dao;

import hilelll.hibernate.practicing.lesson01.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    User getById(int id);

    List<User> getAll();
}
