package hilelll.multiThread.deadlock;

public class Right  {
    private Left left;
    private String name;

    public void setLeft(Left left) {
        this.left = left;
    }

    public synchronized String getName() {
        return name;
    }

    public Right(String name) {
        this.name = name;
    }
    public synchronized String getFromLeft() {
        return left.getName();
    }
}
