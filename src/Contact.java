import java.util.Scanner;

public class Contact {

    // add first name
    private static String addFirstName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact's first name: ");
        return scan.nextLine();
    }


    // add last name
    private static String addLastName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact's last name: ");
        return scan.nextLine();
    }

    //add phone number, use recursion if not entered properly
    private static String addPhoneNumber(){
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



}
