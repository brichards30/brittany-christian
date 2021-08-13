import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ContactsManagerApp {



    public static void main(String[] args) throws IOException {
        Data.setUpDataFile();
        System.out.println(Contact.displayMainMenu());
        Contact.promptUserForChoice();
//        Data.appendToFile("Brittany");



    }
}
