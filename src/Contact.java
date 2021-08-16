import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Contact {

    // add first name
    public static String addFirstName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact's first name: ");
        return scan.nextLine().trim();
    }


    // add last name
    public static String addLastName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact's last name: ");
        return scan.nextLine().trim();
    }

    //add phone number, use recursion if not entered properly
    public static String addPhoneNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact's phone number in this format [xxx-xxx-xxxx]: ");
        String phoneNumber = scan.nextLine();
        if (phoneNumber.length() == 12){
            return phoneNumber;
        }else{
            System.out.println("Please try again");
            return addPhoneNumber();
        }

    }

    public static String displayMainMenu(){
        String options = "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):";
        return options;
    }

    public static int promptUserForChoice () {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int userChoice = input.getInt(1, 5);
        return userChoice;
    }

    public static boolean executeUserChoice (int choice) throws IOException {
        boolean continueApp = true;

        switch (choice) {
            case 1: //View All Contacts
                Data.viewAllContacts();
                break;
            case 2: //Add a new contact
                String newContact =
                Contact.addFirstName() + " " +  Contact.addLastName() + " " + Contact.addPhoneNumber();
                Data.appendToContacts(newContact);
                break;
            case 3: //Search a contact by name
                System.out.println("\nEnter contact name: ");
                Data.searchForContact();
                System.out.println("\n");
                break;

          case 4: //Delete an existing contact2
              System.out.println("Which contact would you like to delete? ");
              Data.removeContact();
              break;

        }
        return continueApp;
    }



}
