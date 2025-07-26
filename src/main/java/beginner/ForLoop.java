package beginner;

/**
 * Using a for loop.
 * 
 * @author strategide
 */
public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int var = 20; var <= 25; var++) {
            sum += var;
        }
        
        System.out.println("The sum of whole numbers between 20 and 25 is " + sum);
        
    }
}
