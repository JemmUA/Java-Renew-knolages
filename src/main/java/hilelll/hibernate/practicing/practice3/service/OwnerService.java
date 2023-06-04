package hilelll.hibernate.practicing.practice3.service;

import hilelll.hibernate.practicing.practice3.dao.OwnerDao;
import hilelll.hibernate.practicing.practice3.entity.Car;
import hilelll.hibernate.practicing.practice3.entity.Owner;

public class OwnerService {
    OwnerDao ownerDao = new OwnerDao();
    public void save (Owner owner) {
        ownerDao.save(owner);
    }
}
