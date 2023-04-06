package codeBro;

public class FormatText {
    public static void main(String[] args) {
        // printf =     an optional method of control, format and display text to the console window
        //              two arguments = format string + (object, variable, value)
        //              % [flags] [precision] [width] [conversion-character]
        long x = 10345430277l;
        double y = -33;
        double yy = 33;
        boolean b = true;
        String s = "text";

        /*
        * flags
        * adds an effect to output based on the flag added to format specifier
        * - : left-justify
        * + : output plus ( + ) or minus ( - ) sign for numeric value
        * 0 : numeric values are zero-padded
        * , : comma grouping separator if number > 1000
        */


        // format, width
        System.out.printf("Lets print: %-7d", x);
        System.out.printf("Lets print: %-20f", y);
        System.out.printf("Lets print: %20f", y);
        System.out.printf("Lets print: %7d", x);
        System.out.println();

        //precision
        System.out.printf("Lets print: %.2f", y);
        System.out.println();

        //flags
        System.out.printf("Lets print: %+2f", y);
        System.out.printf("Lets print: %+2f", yy);
        System.out.println();

        System.out.printf("Lets print: %020f", yy);
        System.out.printf("Lets print: %011f", yy);
        System.out.printf("Lets print: %011d", x);
        System.out.printf("Lets print: %,d", x);


    }
}
