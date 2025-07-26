package beginner;

import java.util.Scanner;

/**
 * Exception handling.
 * 
 * @author strategide
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers for division.");
        
        System.out.print("Value 1: ");
        int value1 = input.nextInt();
        
        System.out.print("Value 2: ");
        int value2 = input.nextInt();
        
        try {
            int division = value1 / value2;
            System.out.println("Division: " + division);
        } catch (Exception e) {
            System.out.println("An exception has occurred - division by zero not allowed.");
        }
    }
}
