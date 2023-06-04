package hilelll.hibernate.practicing.lesson03.service;

import hilelll.hibernate.practicing.lesson03.dao.RoleDao;
import hilelll.hibernate.practicing.lesson03.model.Role;

public class RoleService {
    RoleDao roleDao = new RoleDao();

    public void save(Role role) {
        roleDao.save(role);
    }

}
