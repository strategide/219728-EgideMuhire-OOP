// 1 - Package declaration (optional)
package beginner;

/**
 * 
 * @author strategide
 */

// 2 - Import statement (optional)
import java.util.Scanner;

// 3 Class Declaration
public class HelloWorld {
    
    // 4. Main method
    public static void main(String[] args) {
        // 5. Statements
        System.out.println("Hello, world!");
        
        // Scanner to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Welcome, " + name + "!");
    }
    
    public static void greet() {
        System.out.println("This is another method.");
    }
}
