import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ContactsManagerApp {

    public static void main(String[] args) throws IOException {
        boolean running = true;

        while (running) {
            System.out.println(Contact.displayMainMenu());

            int userChoice = Contact.promptUserForChoice();
            running = Contact.executeUserChoice(userChoice);
        }

        Data.setUpDataFile();

    }
}
