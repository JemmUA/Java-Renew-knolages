package hilelll.hibernate.practicing.practice2.dao;

import hilelll.hibernate.practicing.practice2.model.Driver;

import java.util.List;

public interface DriverDao {
    void save(Driver driver);
    Driver getById(int id);
    List<Driver> getAll();
    void update(Driver driver);
}
