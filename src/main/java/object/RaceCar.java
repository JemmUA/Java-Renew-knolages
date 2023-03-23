package main.java.object;

public class RaceCar extends Car {

//    public String getSuperModel() {
//        super(model);
//                this.model = super(model);
//        return model;

//    }
private String color;

    public RaceCar() {
    }

    public RaceCar(String model) {
        super(model);
    }

    public RaceCar(String model, String color) {
        super(model);
        this.color = color;
    }
}
