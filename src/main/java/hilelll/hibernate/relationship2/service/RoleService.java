package hilelll.hibernate.relationship2.service;

import hilelll.hibernate.relationship2.dao.RoleDao;
import hilelll.hibernate.relationship2.model.Role;

public class RoleService {
    RoleDao roleDao = new RoleDao();

    public void save(Role role) {
        roleDao.save(role);
    }
    public Role getById(int id) {
        return roleDao.getById(id);
    }
}
