package hilelll.hibernate.practicing.practice2;

import hilelll.hibernate.practicing.practice2.model.Driver;
import hilelll.hibernate.practicing.practice2.model.User;
import hilelll.hibernate.practicing.practice2.service.DriverService;

public class Main {

    public static void main(String[] args) {

        DriverService driverService = new DriverService();

        User user = new User("Kimmi", "R", "777", "kimi@mail.net", 21);
        Driver driver = new Driver(user);
//        driverService.save(driver);
//        System.out.println(driverService.getById(19));
//        driverService.getAll().forEach(System.out::println);
        driverService.getAll();
//        System.out.println(driverService.getById(2));
//        driverService.update(driver);
    }
}
