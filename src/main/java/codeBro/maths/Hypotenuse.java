package codeBro.maths;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side X");
        x = scan.nextDouble();
        System.out.println("Enter side Y");
        y = scan.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("Hypotenuse equals: " + z);
        scan.close();
    }
}
