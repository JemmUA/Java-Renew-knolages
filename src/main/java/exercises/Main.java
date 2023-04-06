package exercises;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        One one = new One();
        Echo echo = new Echo();

        one.print(1);
        one.print("One");

        echo.print(1);
        echo.print("One");

        {
            int x = 10;
            System.out.println(x);
        }
        int x = 3;
        System.out.println(x);


        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 12345);
        map.put("Alex", 123777);
        map.put("Jerry", 93712);

        System.out.println(map);

        System.out.println(map.containsKey("Alex"));
        System.out.println(map.containsValue(123777));
        System.out.println(map.get("Alex"));
        map.replace("Alex", 333);
        map.put("Alex", 777);
        System.out.println(map.get("Alex"));

        map.putIfAbsent("John", 222);
        System.out.println(map.get("John"));
        map.putIfAbsent("Johny", 222);
        System.out.println(map.get("Johny"));
    }
}
