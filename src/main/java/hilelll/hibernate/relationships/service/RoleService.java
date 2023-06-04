package hilelll.hibernate.relationships.service;

import hilelll.hibernate.relationships.dao.RoleDao;
import hilelll.hibernate.relationships.model.Role;

public class RoleService {
    RoleDao roleDao = new RoleDao();

    public void save(Role role) {
        roleDao.save(role);
    }
    public Role getById(Integer id) {
        return roleDao.getById(id);
    }

}
