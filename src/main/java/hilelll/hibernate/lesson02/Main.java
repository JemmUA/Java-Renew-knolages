package hilelll.hibernate.lesson02;

import hilelll.hibernate.lesson02.entity.Car;
import hilelll.hibernate.lesson02.service.CarService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();

//        Car car = new Car();
//        car.setModel("Aston Martin");
//        car.setVinCode("23328327999");
//        car.setType("SportCar");
//        carService.save(car);

//        System.out.println(carService.getByVinCode("238744346380987"));

//        Car carById = carService.getById(2);
//        System.out.println("Car by ID: " + carById);

//        carById.setType("SportTruck");
//        carService.update(carById);

//        carService.delete(carById);

//        carService.deleteById(15);

//        carService.getByModel("Lamborghini").forEach(System.out::println);
//        carService.getByType("SportTruck").forEach(System.out::println);
//        carService.getByType("SportCar").forEach(System.out::println);

        List<Car> cars = carService.getAll();
        cars.forEach(System.out::println);

    }
}
