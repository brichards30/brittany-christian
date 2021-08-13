import java.util.Scanner;

public class Input {
        //From Ry's walkthru
//    public class Input{
//    private Scanner scanner;
//    public Input(){
//    this.scanner = new Scanner(System.in);
//    }

        private Scanner scanner = new Scanner(System.in);


        public String getString() {
//        System.out.println("Say something: ");
            String userInput = scanner.nextLine();
            return userInput;
        }

        public boolean yesNo() {
//        System.out.println("Do you like pizza (y/n)?");
            String userResponse = scanner.nextLine();
            if (userResponse.equalsIgnoreCase("yes") || userResponse.contains("y")) {
                return true;
            } else {
                return false;
            }
        }

        public int getInt(int min, int max) {
            //System.out.println("See if your number is within the range: ");
            int userResponse = scanner.nextInt();
            if (userResponse >= min && userResponse <= max) {
                //System.out.println("Yay! " + userResponse + " is within the range!");
                return userResponse;
            } else {
                //System.out.println("Dust your self off and try again!");
                return getInt(min, max);
            }
        }
//    public int getInt() {
//        //System.out.println("Enter a whole number: ");
//        int usersInteger = scanner.nextInt();
//        return usersInteger;
//    }

        public int getInt(){
            System.out.println("Enter a number: ");
            String s = getString();

            try {
                return Integer.valueOf(s);
            }catch(NumberFormatException e) {
                System.out.println("Not a number. Try again!");
                return getInt();
            }
        }

        public double getDouble(double min, double max) {
            System.out.println("See if your number with a decimal is within range: ");
            double userInput = scanner.nextDouble();
            if (userInput >= min && userInput <= max) {
                System.out.println("Yay! " + userInput + " is within the range!");
                return userInput;
            } else {
                System.out.println("Try again.");
                return getDouble(min, max);
            }
        }
//    public double getDouble() {
//        System.out.println("Enter a number with a decimal: ");
//        double userNumber = scanner.nextDouble();
//        return userNumber;
//    }

        public double getDouble(){
            System.out.println("Enter a number: ");
            String s = getString();

            try {
                return Double.valueOf(s);
            }catch(NumberFormatException e) {
                System.out.println("Not a number. Try again!");
                return getDouble();
            }
        }
        public static void main(String[] args) {
            Input input = new Input();

            //System.out.println(input.getInt());
            System.out.println(input.getDouble());
        }
    }


