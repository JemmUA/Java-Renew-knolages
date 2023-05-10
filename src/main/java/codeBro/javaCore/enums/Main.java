package codeBro.javaCore.enums;

public class Main {
    public static void main(String[] args) {
        // enum =   enumerated (ordered listing of items in collection)
        //          grouping of constants that behave similarly to objects
        Planet homePlanet = Planet.EARTH;
        canILiveHere(Planet.EARTH);
        canILiveHere(Planet.JUPITER);

        System.out.println(Planet.valueOf("EARTH"));

        System.out.println("My planet is: " + Planet.values()[2].getName());

        // get/print list of enums
        System.out.println("List of planets: ");
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
        }
    }

    static void canILiveHere(Planet planet) {
        switch (planet) {
            case EARTH:
                System.out.format("Plane #%d. %s: You can live here! \n", planet.getNumber(), planet.getName());
                break;
            default:
                System.out.format("Plane #%d. %s: You can not live here! \n", planet.getNumber(), planet.getName());
        }
    }
}
