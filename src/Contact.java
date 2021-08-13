import java.io.IOException;
import java.util.Scanner;

public class Contact {

    // add first name
    public static String addFirstName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact's first name: ");
        return scan.nextLine();
    }


    // add last name
    public static String addLastName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact's last name: ");
        return scan.nextLine();
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
                addFirstName();
                addLastName();
                addPhoneNumber();
                break;
//            case 2: //VIEW ALL ANIMATED MOVIES
//                System.out.println("\n");
//                viewMoviesByCategory("animated");
//                System.out.println("\n");
//                break;
//
//            case 3: //VIEW ALL DRAMA MOVIES
//                System.out.println("\n");
//                viewMoviesByCategory("drama");
//                System.out.println("\n");
//                break;
//            case 4: //VIEW ALL HORROR MOVIES
//                System.out.println("\n");
//                viewMoviesByCategory("horror");
//                System.out.println("\n");
//                break;
//
//            case 5: //VIEW ALL SCI-FI MOVIES
//                System.out.println("\n");
//                viewMoviesByCategory("scifi");
//                System.out.println("\n");
//                break;
        }
        return continueApp;
    }



}
