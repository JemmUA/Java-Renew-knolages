package hilelll.hibernate.relationship2;

import hilelll.hibernate.relationship2.model.Role;
import hilelll.hibernate.relationship2.model.User;
import hilelll.hibernate.relationship2.service.RoleService;
import hilelll.hibernate.relationship2.service.UserService;
import hilelll.hibernate.relationships.model.enums.RoleEnum;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        RoleService roleService = new RoleService();
        UserService userService = new UserService();

/*        Role userRole = new Role();
        userRole.setRole(RoleEnum.USER);
        Role moderatorRole = new Role();
        moderatorRole.setRole(RoleEnum.MODERATOR);
        Role adminRole = new Role();
        adminRole.setRole(RoleEnum.ADMIN);
        roleService.save(userRole);
        roleService.save(moderatorRole);
        roleService.save(adminRole);*/


//        User user = new User();
//        user.setName("Alex");
//        user.setRole(roleService.getById(3));
//        userService.save(user);
//        user.setName("Den");
//        user.setRole(roleService.getById(1));
        System.out.println(roleService.getById(2));
//        userService.save(user);


    }
}
