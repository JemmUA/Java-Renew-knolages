package hilelll.dateTime.systemCurrentTimeMilles;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // System.currentTimeMillis
        long cut1 = System.currentTimeMillis();
//        System.out.println(cut1);
        Thread.sleep(100);
        long cut2 = System.currentTimeMillis();
        System.out.println(cut2-cut1+"ms");
    }
}
