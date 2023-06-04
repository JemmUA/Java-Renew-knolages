package hilelll.hibernate.relationships;

import hilelll.hibernate.relationships.model.Car;
import hilelll.hibernate.relationships.model.Driver;
import hilelll.hibernate.relationships.model.Role;
import hilelll.hibernate.relationships.model.User;
import hilelll.hibernate.relationships.model.enums.*;
import hilelll.hibernate.relationships.service.CarService;
import hilelll.hibernate.relationships.service.DriverService;
import hilelll.hibernate.relationships.service.RoleService;
import hilelll.hibernate.relationships.service.UserService;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.logging.XMLFormatter;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        CarService carService = new CarService();
        RoleService roleService = new RoleService();
        UserService userService = new UserService();
        DriverService driverService = new DriverService();

        // Set roles
/*        Role userRole = new Role();
        userRole.setRole(RoleEnum.USER);
        Role moderatorRole = new Role();
        moderatorRole.setRole(RoleEnum.MODERATOR);
        Role adminRole = new Role();
        adminRole.setRole(RoleEnum.ADMIN);
        roleService.save(userRole);
        roleService.save(moderatorRole);
        roleService.save(adminRole);*/

// ManyToMany: User - Role
        User user = new User();
        user.setName("OneMore");
        user.setSurname("Racer");
        user.setPassword("212");
        user.setEmail("s@mail.ua");
        user.setAge(9);
        user.setSex(SexEnum.FEMALE);

        Set<Role> roles = new HashSet<>();
        roles.add(roleService.getById(1));
        roles.add(roleService.getById(2));
        roles.add(roleService.getById(3));
        user.setRoles(roles);
        userService.save(user);

        Set<User> users = new HashSet(userService.getAll());

        Role role = new Role();
        role.setUsers(users);

// OneToOne: User - Driver
        Driver driver = new Driver();
        driver.setLicense(LicenseEnum.PLATINUM);
        driver.setNick("Speedy");
        driverService.save(driver);
//        user.setDriver(driverService.getById(1));
//        driverService.getById(1);
        driver.setUser(user);

// ManyToOne: Car - Driver
        Car car = new Car();
        car.setModel(ModelEnum.LAMBORGHINI);
        car.setCarClass(CarClassEnum.GT3);
        car.setDriver(driver);
        System.out.println(car);
//
//        Set<Car> cars = new HashSet();
//        cars.add(car);
//        driver.setCars(cars);

        carService.save(car);



    }
}
