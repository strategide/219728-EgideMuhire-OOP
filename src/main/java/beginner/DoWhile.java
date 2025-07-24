package beginner;

import java.util.Scanner;

/**
 *
 * @author strategide
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        
        // Loop using do-while
        do {
            // Ask the user to enter in the number
            System.out.print("Enter in a number: ");
            
            // Read in the number
            number = input.nextInt();
            sum += number;
            
        } while (number != 0);  // Exit loop if number is zero
        
        System.out.println("Total sum of values: " + sum);
    }
}
