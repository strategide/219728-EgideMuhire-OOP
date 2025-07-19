package beginner;

// Import java.util.Scanner class.
import java.util.Scanner;

/**
 *
 * @author saladthieves
 */
public class InputTest {
    // Main method
    public static void main(String[] args) {
        // Variable declarations
        String firstName;
        String middleName;
        String lastName;
        int age;
        
        // Create object of the Scanner class.
        Scanner input = new Scanner(System.in);
        
        // Prompt and capture the first name from user
        System.out.println("Enter the first name: ");
        firstName = input.nextLine();   // String input
        
        // Prompt and capture the middle name from user
        System.out.println("Enter the middle name: ");
        middleName = input.nextLine();  // String input
        
        // Prompt and capture the last name from user
        System.out.println("Enter the last name: ");
        lastName = input.nextLine();    // String input
        
        // Prompt the user for the age
        System.out.println("Enter the age(number): ");
        age = input.nextInt();  // integer input
        
        System.out.println();
        
        // Show the output on the screen
        // 1 - show the full name (first + middle + last)
        System.out.println("Hi " + firstName + " " + middleName + " " + lastName);
        System.out.println("You are " + age + " years old.");
    }
}
