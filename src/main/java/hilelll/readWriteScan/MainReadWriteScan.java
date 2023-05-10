package hilelll.readWriteScan;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainReadWriteScan {

    public static void main(String[] args) throws IOException {
        String file = "text.txt";
        String path = "src/main/resources/readwrite/";
        String pathFile = path + file;

        // create directory
        Path pathToFile = Paths.get(path);
        Path parentPath = pathToFile.getParent();
        if (!Files.exists(parentPath)) {
            Files.createDirectories(parentPath);
        }


        System.out.println("Input text: ");
        write(input(), pathFile, true);

        System.out.println("read from file: ");
        System.out.println(read(pathFile));
    }

    private static void write(String text, String pathFile, boolean append) throws IOException {
        Path pathToFile = Paths.get(pathFile);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
        try (FileWriter fileWriter = new FileWriter(pathFile, append)) {
            fileWriter.write(text + "\n");
        } catch (IOException e) {
            System.err.println("panic!!! )))");
            e.printStackTrace();
        }
    }

    private static String read(String pathFile) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(pathFile)) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine()).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }

    private static String input() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString;
    }

}
