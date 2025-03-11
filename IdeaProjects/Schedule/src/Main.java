// Import the Scanner
import java.util.Scanner;

// Beginning of the main class. The name of the main class and the file should be same.
public class Main {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String []args) {

        // Create a Scanner variable named "keyboard"
        Scanner keyboard = new Scanner(System.in);

        // A variable for getting the day of the week is given below
        int dayOfTheWeek = 1;

        // Display a menu to get the day of the week from the user
        System.out.println("********** MENU *****************");
        System.out.println("These are the choices for week of the day. \\n Please enter only values from 1-7: ");
        System.out.println("1. MONDAY\n2. TUESDAY\n3. WEDNESDAY\n4. THURSDAY\n5. FRIDAY\n6. SATURDAY\n7. SUNDAY");
        System.out.println("***********************************");

        // Prompt Toni for input. Also let Toni know the valid choices like (1-7).
        System.out.println("Enter your choice (1-7): ");
        dayOfTheWeek = keyboard.nextInt();

        // Create a switch with case values from 1-7 to handle the schedule for the input in "dayOfTheWeek"
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");
                System.out.println("*********** SUB MENU FOR MONDAY ******");
                System.out.println("* 1. Yes, I had my breakfast");
                System.out.println("* 2. No, I would like one");
                System.out.println("**************************************");

                // After the sub-menu inside case 1, prompt for input on choice
                System.out.print("Enter your choice: ");

                // After the creation of Scanner variable and declare a variable "subChoice"
                int subChoice = keyboard.nextInt();

                // Display appropriate response to Toni, based on value in variable subChoice using if, if-else, else
                if (subChoice == 1) {
                    System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");
                } else if (subChoice == 2) {
                    System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
                } else {
                    System.out.println("NO such choice available");
                }
                break;
            case 2:
                System.out.println("Tuesday: Let's keep the momentum going!");
                break;
            case 3:
                System.out.println("Wednesday: Midweek hustle!");
                break;
            case 4:
                System.out.println("Thursday: Almost at the weekend...");
                break;
            case 5:
                System.out.println("Friday: TGIF!");
                break;
            case 6:
                System.out.println("Saturday: Time to relax.");
                break;
            case 7:
                System.out.println("Sunday: A day for rest and reset.");
                break;

            // Implement "default" to handle Toni entering values less than 1 or more than 7
            default:
                System.out.println("Invalid input! Please enter a value between 1 and 7.");
        }

    } //end of main method

} //end of the main class