package hilelll.patternsDesign;

import hilelll.patternsDesign.builder.Configuration;
import hilelll.patternsDesign.factory.domain.Document;
import hilelll.patternsDesign.factory.domain.Factory;
import hilelll.patternsDesign.factory.domain.PDFFactory;
import hilelll.patternsDesign.factory.domain.TXTFactory;
import hilelll.patternsDesign.prototype.Human;
import hilelll.patternsDesign.prototype.Parrot;
import hilelll.patternsDesign.singletone.Singleton;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Document documentTXT = getRequiredDocument(new TXTFactory());
        documentTXT.print();
        Document documentPDF = getRequiredDocument(new PDFFactory());
        documentPDF.print();

        Singleton pathToConfig = Singleton.instance("path to config");

        Human human = new Human("Alex", "men",11,new Parrot("Piastr"));
        Human humanClone = (Human)human.clone();
        System.out.println(human);
        humanClone.setName("Bob");
        humanClone.getParrot().setName("PIPIASTR");
        System.out.println(humanClone);

        Configuration configuration = new Configuration.Builder()
                .withPrefix("prefix")
                .withHost("host")
                .withPort(8080)
                .withPath("path").
                build();


    }

    public static Document getRequiredDocument(Factory factory) {
        return factory.getDocument();
    }
}
