package codeBro.javaCore.enums;

public enum Planet {

    MERCURY(1,"Mercury"),VENUS(2,"Vanus"),

    EARTH(3,"Earth"),MARS(4,"Mars"),

    JUPITER(5,"Jupiter"),SATURN(6,"Saturn"),

    URANUS(7,"Uranus"),NEPTUNE(8,"Neptune"),

    PLUTO(9,"Pluto");

    int number;
    String name;


    Planet(){

    }
    Planet(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
