package beginner;

/**
 * Working with the while loop.
 * 
 * @author strategide
 */
public class WhileLoop {
    public static void main(String[] args) {
        // While loop - show even values from 12 up to (and including) 28
        int count = 12;
        int stop = 28;
        while (count <= stop) {
            System.out.println(count);
            count += 2;
        }
        
        // While loop - sum up the values from 20 to 25.
        int sum = 0;
        int num = 20;
        while (num <= 25) {
            sum += num;
            num++;
        }
        System.out.println("Sum of whole numbers from 20 to 25 = " + sum);
        
        // Do-while loop - sum up the values from 20 to 25.
        sum = 0;
        num = 20;
        do {
            sum += num;
            num++;
        } while (num <= 25);
        System.out.println("Sum of whole numbers from 20 to 25 = " + sum);
        
        
    }
}
