package hilelll.enum_;

public class Main {




    public static void main(String[] args) {
        DayTimes dayTime = DayTimes.DAY_TIME;
        System.out.println(dayTime);
        System.out.println(dayTime instanceof DayTimes);
        System.out.println(dayTime instanceof Enum);
        System.out.println(dayTime.getClass().getName());
        System.out.println("dayTime");
        System.out.println(dayTime.EVENING_TIME.getUkrainianTranslation());
        System.out.println(DayTimes.valueOf(dayTime.name()));

        System.out.println();
        System.out.println("Ordinals and Values of enum: ");
        for (DayTimes dt:DayTimes.values()) {
            System.out.println(dt.ordinal());
            System.out.println(dt.getUkrainianTranslation());
        }
        System.out.println();
        System.out.println(DayTimes.NIGHT_TIME.toSTring());
        System.out.println(DayTimes.MORNING_TIME.toSTring());

        System.out.println(dayTime);
        System.out.println(dayTime.name());
        System.out.println(DayTimes.DAY_TIME.ordinal());
        System.out.println(DayTimes.valueOf("DAY_TIME").getUkrainianTranslation());
        System.out.println("Ordinal of EVENING_TIME " + DayTimes.EVENING_TIME.ordinal());
        System.out.println("Ordinal of NIGHT_TIME " + DayTimes.NIGHT_TIME.ordinal());

        for (DayTimes dt : DayTimes.values()) {
            System.out.println(dt);
            System.out.println(dt.getUkrainianTranslation());
            System.out.println(dt.getEnglishTranslation());
        }
        System.out.println(DayTimes.values()[2]);
    }
}
