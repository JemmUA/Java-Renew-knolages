package hilelll.dateTime.dateCalendar;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Date
        // Methods: getTime(); equals(); after(); before();
        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getTime() + " - Amount of milliseconds since 1970");

/*
        Date dateCustom = new Date();
        dateCustom.setTime(3000);
        System.out.println(dateCustom);
        System.out.println(dateCustom.equals(date));
        System.out.println(dateCustom.after(date));
        System.out.println(dateCustom.before(date));
*/

/*
        Date date1 = new Date();
        System.out.println("get time 1 and wait 1000 ms");
        long ms1 = date1.getTime();
        Thread.sleep(1000);
        Date date2 = new Date();
        System.out.println("get time 2");
        long ms2 = date2.getTime();
        long delta = ms2 - ms1;
        System.out.println("time delta: " + delta);
*/

        // Calendar
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        calendar.setTimeInMillis(0);
//        calendar.setTimeZone();

        // Localtime, LocalDate, LocalDateTime, ChronoUnit
//        LocalTime nowTime = LocalTime.now();
//        LocalDate nowDate = LocalDate.now();
//        LocalDateTime nowDateTime = LocalDateTime.now();

//        System.out.println(nowTime);
//        System.out.println(nowDate);
//        System.out.println(nowDateTime);

//        System.out.println(LocalTime.of(4, 24,27));
//        System.out.println(LocalTime.MAX);
//        System.out.println(LocalTime.NOON);
//        System.out.println(LocalTime.ofSecondOfDay(34325));

/*
        LocalTime nowTime1 = LocalTime.now();
        System.out.println(nowTime1);

        Thread.sleep(1000);
        LocalTime nowTime2 = LocalTime.now();
        System.out.println(nowTime2);
*/

/*
        System.out.println(nowTime.getNano());
        System.out.println(nowTime.getSecond());
        System.out.println(nowTime.range();
        System.out.println("Time is: " + nowTime.getHour()+" : "+nowTime.getMinute()+" : "+nowTime.getSecond());
*/
    }
}
