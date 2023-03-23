package main.java.dateTimeCalendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime() + "  - Amount of milliseconds since 1970");

        Calendar calendar = Calendar.getInstance();
//        calendar.setTime();
        LocalTime nowTime = LocalTime.now();
        LocalDate nowDate = LocalDate.now();
        LocalDateTime nowDateTime = LocalDateTime.now();

        System.out.println(nowTime);
        System.out.println(nowDate);
        System.out.println(nowDateTime);

        System.out.println(LocalTime.of(4, 24,27));
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.NOON);
        System.out.println(LocalTime.ofSecondOfDay(34325));

        LocalTime nowTime1 = LocalTime.now();
        System.out.println(nowTime1);
        LocalTime nowTime2 = LocalTime.now();
        System.out.println(nowTime2);

    }
}
