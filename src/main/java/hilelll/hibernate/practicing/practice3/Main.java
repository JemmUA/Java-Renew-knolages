package hilelll.hibernate.practicing.practice3;

import hilelll.hibernate.practicing.practice3.entity.Car;
import hilelll.hibernate.practicing.practice3.entity.Gender;
import hilelll.hibernate.practicing.practice3.entity.Info;
import hilelll.hibernate.practicing.practice3.entity.Owner;
import hilelll.hibernate.practicing.practice3.service.CarService;
import hilelll.hibernate.practicing.practice3.service.OwnerService;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        CarService carService = new CarService();
        Car car = new Car();
        car.setModel("Toyota");
        car.setVinCode("1133345");
        car.setType("track");
//        carService.save(car);
//        Car carById = carService.getById(4);
//        carService.update(carById);
//        carService.delete(carById);
//        System.out.println(carService.getByVinCode("11122233345"));
//        carService.getAll().forEach(System.out::println);
//        System.out.println(carService.getByModel("Mercedes"));


        OwnerService ownerService = new OwnerService();
        Owner owner = new Owner();
        owner.setName("Al");
//        owner.setGender(Gender.MALE);
        owner.setInfo(new Info(
                "Kiev",
                "Ukraine",
                LocalDateTime.of(2023, 5,30,19,00),
                "summer ends")
        );
        ownerService.save(owner);
    }
}
