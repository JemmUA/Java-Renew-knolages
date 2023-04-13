package codeBro.javaCore.files;

import java.io.*;

public class Files {
    public static void main(String[] args) {
//        File file = new File("C:/Users/Jemm/IdeaProjects/refreshKnowlages/src/main/resources/text.txt");
//
//        if (file.exists()) {
//            System.out.println("My file exists");
//            System.out.println(file.getPath());
//            System.out.println(file.getAbsolutePath());
//            System.out.println(file.isFile()); //not folder
//            file.delete();
//        } else {
//            System.out.println("I can't find the file");
//        }

        try {
            FileWriter writer = new FileWriter("C:/Users/Jemm/IdeaProjects/refreshKnowlages/src/main/java/codeBro/poem.txt");
            writer.write("POEM\nThis is my text file.\n" +
                    "I do not know what to write here.\n" +
                    "So.\n" +
                    "Hello\n" +
                    "and\n" +
                    "see ya!)\n\n");
            writer.append("The end\n");
            writer.append("The end\n");
            writer.write("haha\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader reader = new FileReader("C:/Users/Jemm/IdeaProjects/refreshKnowlages/src/main/java/codeBro/poem.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
