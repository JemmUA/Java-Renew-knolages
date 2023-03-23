package inharitance.animals;

public abstract class Animal {
    private String tail = "SHORT";
    private int LEGS = 4;

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public abstract void jump()
//    {
//        System.out.println("I jump");
//    }
    ;
}
