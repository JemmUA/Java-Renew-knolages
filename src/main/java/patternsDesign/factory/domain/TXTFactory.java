package patternsDesign.factory.domain;

public class TXTFactory implements Factory{
    @Override
    public Document getDocument() {
        return new TXTDocument();
    }
}
