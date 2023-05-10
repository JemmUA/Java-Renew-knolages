package codeBro.javaCore.hashMaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap implements the Map interface
        // HashMap contains Key:Value pairs
        // Stores referral variables and Wrapper Classes
        // (User, String, Integer, Double, Boolean ...)

        HashMap<String, String> countries = new HashMap<>();
        countries.put("USA", "Washington");
        countries.put("Great Brittan", "London");
        countries.put("Ukraine", "Kyiv");
        countries.put("Poland", "Warsaw");
        countries.put("Belarus", "Minsk");

        countries.remove("Belarus");
        countries.get("USA");
        countries.size();
        countries.replace("Ukraine", "KYIV");
        countries.containsKey("USA");
        countries.containsValue("Warsaw");
//        countries.clear();

        for (String country: countries.keySet()) {
            System.out.print(country+" - ");
            System.out.println(countries.get(country));
        }

        System.out.println(countries.keySet());
        System.out.println(countries.values());


    }
}
