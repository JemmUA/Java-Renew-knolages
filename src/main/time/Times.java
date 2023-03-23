package main.time;

import java.time.Instant;


public class Times {
    public static void main(String[] args) {

        System.out.println(java.sql.Time.from(Instant.ofEpochSecond(1749374329L)));
        System.out.println(java.sql.Time.from(Instant.now()));
        System.out.println(Instant.now().getEpochSecond());
        while (true) {
            System.out.println(Instant.now().getEpochSecond() % 2);
            System.out.println("\b\b");

        }


    }
}
