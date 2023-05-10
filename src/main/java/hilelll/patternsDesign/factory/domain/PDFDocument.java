package hilelll.patternsDesign.factory.domain;

public class PDFDocument implements Document{
    @Override
    public void print() {
        System.out.println("PDF Document");
    }
}
