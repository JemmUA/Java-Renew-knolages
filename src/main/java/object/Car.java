package main.java.object;

public class Car {
    private String model;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        System.out.println("this.model: "+this.model);
        System.out.println("model: " + model);
        this.model = model;
        System.out.println("this.model set: "+this.model);

        System.out.println();


    }
}
