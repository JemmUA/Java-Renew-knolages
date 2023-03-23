package patternsDesign.factory.domain;

public class PDFFactory implements Factory{
    @Override
    public Document getDocument() {
        return new PDFDocument();
    }
}
