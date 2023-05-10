package hilelll.exercises;

public class Echo extends One{
    @Override
    public void print(String string) {
        super.print(string.repeat(3));
    }

    @Override
    public void print(int inta) {
        super.print(inta*3);
    }
}
