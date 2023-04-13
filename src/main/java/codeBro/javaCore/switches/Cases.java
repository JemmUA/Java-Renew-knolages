package codeBro.javaCore.switches;

public class Cases {
    public static void main(String[] args) {
        String day = "pizza";

        switch (day) {
            case "Sunday":
                showDay(day);
                break;
            case "Monday":
                showDay(day);
                break;
            case "Tuesday":
                showDay(day);
                break;
            case "Wednesday":
                showDay(day);
                break;
            case "Thursday":
                showDay(day);
                break;
            case "Friday":
                showDay(day);
                break;
            case "Saturday":
                showDay(day);
                break;
            default:
                System.out.println(day + "? It's not a kind of week days! ");





//            The New switch Expression
//              Let's see what the new switch expression looks like when switching over months:

//                var result = switch(month) {
//                    case JANUARY, JUNE, JULY -> 3;
//                    case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
//                    case MARCH, MAY, APRIL, AUGUST -> 2;
//                    default -> 0;
//                };

//            Sending in a value such as Month.JUNE would set result to 3.
//            Notice that the new syntax uses the -> operator instead of the colon we're used to with switch statements. Also, there's no break keyword: The switch expression doesn't fall through cases.
//            Another addition is the fact that we can now have comma-delimited criteria.
        }
    }

    private static void showDay(String day) {
        System.out.println("It's " + day);
    }
}
