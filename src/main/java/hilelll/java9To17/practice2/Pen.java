package hilelll.java9To17.practice2;

public sealed class Pen implements Pens permits Pencil {
    private String color;

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                '}';
    }

    public Pen(String color) {
        this.color = color;
    }

    void draw (){
        System.out.println("I draw the line");
    }
    @Override
    public void eraser() {
        System.out.println("Erase assign");
    }
    public void eraser(int doErase) {
        System.out.println("I erase hard");
    }
}
