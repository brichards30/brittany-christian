import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Data {
    static String directory = "data";
    static String filename = "contacts.txt";

    static Path dataDirectory = Paths.get(directory);
    static Path dataFile = Paths.get(directory, filename);

    static Scanner scanner = new Scanner(System.in);

    public static void setUpDataFile() throws IOException {


        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

    }

    public static void appendToContacts(String contentToAppend) throws IOException {
        Files.write(
                Paths.get(directory, filename),
                Arrays.asList(contentToAppend), // list with one item
                StandardOpenOption.APPEND
        );

    }

    public static void viewAllContacts() throws IOException {
        List<String> showAllContacts = Files.readAllLines(dataFile);

        System.out.println("Name | Phone number");
        System.out.println("---------------");
        for (String contact : showAllContacts) {

            System.out.println(contact);
        }
    }

    public static void searchForContact() throws IOException {
        String userResponse = scanner.nextLine();
        List<String> showAllContacts = Files.readAllLines(Paths.get(directory, filename));

        for (String contact : showAllContacts) {

            if (contact.contains(userResponse.toLowerCase())) {
                System.out.println(contact);
            }
        }
    }

    public static void removeContact() throws IOException {
        String userChoice = scanner.nextLine();
        List<String> showAllContacts = Files.readAllLines(Paths.get(directory, filename));
        List<String> newContactList = new ArrayList<>();

        for (String contact : showAllContacts) {
            if (!contact.contains(userChoice.toLowerCase())) {
                newContactList.add(contact);
            }else if (contact.contains(userChoice.toLowerCase())){
                newContactList.add("Empty");
            }
            newContactList.add(contact);
        }
            Files.write(Paths.get(directory, filename), newContactList);
        }

    }


