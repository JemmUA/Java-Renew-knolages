package hilelll.hibernate.lesson03;

import hilelll.hibernate.lesson03.model.House;
import hilelll.hibernate.lesson03.model.Passport;
import hilelll.hibernate.lesson03.model.Role;
import hilelll.hibernate.lesson03.model.User;
import hilelll.hibernate.lesson03.service.HouseService;
import hilelll.hibernate.lesson03.service.UserService;

import java.util.HashSet;

/**
 * hibernate
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Hibernate");

        HouseService houseService = new HouseService();
        UserService userService = new UserService();
//
//        for (RolesEnum currentRole : RolesEnum.values()) {
//            Role role = new Role();
//            role.setName(currentRole);
//        roleService.save(role);
//        }


        House house = new House();
        house.setAddress("Lviv");

//
        User user = new User();
        user.setName("Alex");
        user.setSurname("Krutenko");
        user.setEmail("allex@mail.ua");
        user.setPassword("uefhhe87");
        user.setAge(23);

        HashSet<Role> roles = new HashSet<>();
        HashSet<User> users = new HashSet<>();
        users.add(user);
//
//        roles.add(new Role(null, RolesEnum.USER, users));
//        roles.add(new Role(null, RolesEnum.ADMIN, users));
//        roles.add(new Role(null, RolesEnum.SUPERADMIN, users));
        user.setRoles(roles);
        Passport passport = new Passport();
        passport.setUser(user);
        user.setPassport(passport);

        house.setUser(user);

        System.out.println(user);
        System.out.println(house);
//        System.out.println(role);
        roles.forEach(System.out::println);
//        System.out.println(passport);

        userService.save(user);
//        houseService.save(house);
    }
}
