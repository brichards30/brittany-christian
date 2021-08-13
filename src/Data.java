import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Data {
    static String directory = "data";
    static String filename = "contacts.txt";

    static Path dataDirectory = Paths.get(directory);
    static Path dataFile = Paths.get(directory, filename);

    public static void setUpDataFile() throws IOException {


        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

    }

    public static void appendToFile(String contentToAppend) throws IOException {
        Files.write(
                dataFile,
                Arrays.asList(contentToAppend), // list with one item
                StandardOpenOption.APPEND
        );

    }

    public static void viewAllContacts() throws IOException {
        List<String> showAllContacts = Files.readAllLines(dataFile);


        for (String contact : showAllContacts) {
            System.out.println(contact);
        }


    }

}

