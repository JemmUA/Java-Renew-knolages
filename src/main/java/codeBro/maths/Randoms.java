package codeBro.maths;

import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt();
        System.out.println(x);
        x = random.nextInt(3);//0-2
        System.out.println(x);

        double y = random.nextDouble();// 0 - 1
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z);

    }
}
