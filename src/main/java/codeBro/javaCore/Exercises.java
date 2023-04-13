package codeBro.javaCore;
import codeBro.javaCore.entity.Driver;
public class Exercises {

    public static String event = "Monaco GP";
        public static void main(String[] args) {

            Driver driver1 = new Driver("John",22,"B");
            Driver driver2 = new Driver("Alex", 33, "A");

            driver1.drive();
            System.out.println(driver1.getAge());
            System.out.println(driver2.getName());
            System.out.println(driver2.getLicense());
            System.out.println(driver2.getName());
    }
}
