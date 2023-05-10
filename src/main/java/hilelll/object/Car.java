package hilelll.object;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
