package main.java.object;

import java.util.Objects;

public class House {
private Integer flours;
private String color;

    public House() {
    }

    public House(Integer flours, String color) {
        this.flours = flours;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(flours, house.flours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flours);
    }
}
