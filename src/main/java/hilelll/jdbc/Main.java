package hilelll.jdbc;

import hilelll.jdbc.practice2.entity.Driver;
import hilelll.jdbc.practice2.service.DriverService;
import hilelll.jdbc.practice2.util.Database;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        /**
         * Java Database Connectivity (JDBC)
         * STRUCTURE:
         *  Java Application
         *  JDBC APi
         *  Driver Manager
         *  Diver Driver Driver ...
         *  DB DB DB ...
         *
         * Interaction with database:
         * Statement, Prepared Statement, Callable Statement
         *
         */

//        Connection connection = Database.getConnection();

        DriverService driverService = new DriverService();


        Driver driver = new Driver();
        driver.setName("Lens");
        driver.setSurname("Sirell");
        driver.setEmail("ls@mail.ua");
        driver.setPassword("6534");
        driver.setAge(19);
//        driverService.save(driver);
//        driverService.deleteById(7);
        driverService.updateById(13, driver);
        driverService.getAll().forEach(System.out::println);
    }
}
