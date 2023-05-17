package hilelll.dateTime.localDateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // LocalDate
        /*
         * now() - returns current date
         * of() - set date
         * getYear() - returns Year
         * getMonthValue() - returns Month
         * getDayOfMonth() - returns Day of Month
         * getDayOfWeek() - returns Day of Weak
         * plusDays() - add to Date amount of Days
         * plusWeeks() - add Weeks
         * minusMonths() - subtract Months
         * minusYears() - subtract Years
         */

        LocalDate localDate = LocalDate.now();
        LocalDate localDateSet = LocalDate.of(2023, 5, 12);
        System.out.println("Today is: " + localDate);
        System.out.println("I set date: " + localDateSet);
        System.out.println(localDateSet.plusDays(8));
        System.out.println(localDateSet.plusWeeks(1));
        System.out.println(localDateSet.plusYears(1));
        System.out.println(localDateSet.minusYears(1));

        // ChronoUnit
        LocalDate now = LocalDate.now();
        LocalDate war = LocalDate.of(2022, 2, 24); // war begun
        System.out.println(ChronoUnit.MONTHS.between(war, now) + " months");

        LocalTime nowTime1 = LocalTime.parse("04:00");
        LocalTime nowTime2 = LocalTime.now();
        System.out.println(ChronoUnit.HOURS.between(nowTime1, nowTime2)+ " hours");


    }
}
