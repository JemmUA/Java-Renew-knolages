package codeBro;

public class Loops {
    public static void main(String[] args) {
        label1:
        for (int j = 0; j < 5; j++) {
            System.out.println();
//            if (j==5) {
//                break label2; // break label works only for outer loops
//            }

            label2:
            for (int i = 0; i < 5; i++) {
                if (j==3) {
                    break label1;
                }
                System.out.print("o");
            }
        }
    }
}
