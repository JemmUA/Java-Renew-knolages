package hilelll.patternsDesign.factory.domain;

public class TXTDocument implements Document{
    @Override
    public void print() {
        System.out.println("TXT Document");
    }
}
