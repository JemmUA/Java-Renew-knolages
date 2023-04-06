package codeBro;

import java.util.stream.Stream;

public class Arrays {
    public static void main(String[] args) {
        CarJ[] carsArr = new CarJ[5];
        carsArr[0] = new CarJ("Ferrari");
        carsArr[1] = new CarJ("Mercedes");
        carsArr[2] = new CarJ("Porsche");
        carsArr[3] = new CarJ("Audi");
        carsArr[4] = new CarJ("BMW");

        System.out.println(carsArr[4]);
//        for (int i = 0; i < carsArr.length; i++) {
//            System.out.println(carsArr[i].toString());
//        }
//        Stream.of(carsArr)
//                .forEach(System.out::println);


        String[][] cars2 = {{"Camaro","Corvette","Silverado"},
                            {"Mustang","Ranger","Ferrari"},
                            {"Tesla","Lamborghini","Ford"}};

        String[][] cars = new String[3][3];
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "Ferrari";
        cars[2][0] = "Tesla";
        cars[2][1] = "Lamborghini";
        cars[2][2] = "Ford";

        for (int i = 0; i < cars2.length; i++) {
            System.out.println();
            for (int j = 0; j < cars2[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }


    }


    static class CarJ{
        String model;

        CarJ() {

        }

        CarJ(String model) {
            this.model = model;
        }

        public String getModel() {
            return model;
        }
        @Override
        public String toString() {
            return "Car model: " + model;
        }
    }

}
