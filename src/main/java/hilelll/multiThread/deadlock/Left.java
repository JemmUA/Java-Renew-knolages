package hilelll.multiThread.deadlock;

public class Left {
    private Right right;
    private String name;

    public synchronized String getName() {
        return name;
    }

    public void setRight(Right right) {
        this.right = right;
    }

    public Left(String name) {
        this.name = name;
    }

    public synchronized String getFromRight() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return right.getName();
    }
}
