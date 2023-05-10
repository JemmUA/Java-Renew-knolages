package hilelll.object;

public class Main {


    public static void main(String[] args) {

        // Methods of class Object:
        //      getClass();
        //      hashCode();
        //      equals(Object o);
        //      toString();
        //      clone();
        //      notify();
        //      notifyAll();
        //      wait();
        //      finalize(); - deprecated

//
//        int x = 100;
//
//        Object o = new Object();
//        Object oo = new Object();
//        Class<?> classO = o.getClass();
//        System.out.println(classO.getName());
//
//
//        System.out.println(o.toString());
//        System.out.println(o.getClass());
//        System.out.println(o.getClass().getName());
//        System.out.println(o.hashCode());
//        System.out.println(o.equals(oo));
//
//        House house = new House(2, "white");
//        House house2 = new House(2, "blue");
//        System.out.println(house.equals(house2));
//        Car car = new Car();
//        System.out.println(house.equals(car));
//        System.out.println(house.hashCode());
//        System.out.println(house2.hashCode());
//        System.out.println(car.hashCode());
//
//        System.out.println(x);
//
////        car.setModel("Merc");
//        car.setModel("Audi");
//        System.out.println(car.getModel());
//
//
//        RaceCar raceCar = new RaceCar();
//        raceCar.setModel("bmw");
//        System.out.println(raceCar.getModel());
//
//
//        Car car2 = new Car();
//        Car car3 = car2;
//        System.out.println(car2.hashCode());
//        System.out.println(car3.hashCode());
//
        Car car5 = new Car("Mercedes");
//        car5.setModel("Audi");
        System.out.println("car5.getModel()"+car5.getModel());
        changeModel(car5);
        System.out.println("car5.getModel()"+car5.getModel());
    }

    public static void changeModel(Car car) {
        car.setModel("Audi");
    }

}
