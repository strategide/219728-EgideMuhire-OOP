package beginner;

/**
 * Working with arrays in Java.
 *
 * @author strategide
 */
public class Arrays {

    public static void main(String[] args) {
        int[] myNumbers = new int[5];      // initializing an empty array of size 5
        int[] myValues = {1, 2, 3, 4, 5};  // initialize an array from a list of values

        // Accessing elements of an array via index values
        myNumbers[0] = 15;
        myNumbers[1] = 16;
        myNumbers[2] = 17;
        myNumbers[3] = 18;
        myNumbers[4] = 19;
        
        // Reading an element from an array
        System.out.println("myNumbers[0] = " + myNumbers[0]);
        System.out.println("myNumbers[1] = " + myNumbers[1]);
        System.out.println("myNumbers[2] = " + myNumbers[2]);
        System.out.println("myNumbers[3] = " + myNumbers[3]);
        System.out.println("myNumbers[4] = " + myNumbers[4]);
        
        System.out.println();
        
        // Copying array
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortads",
            "Doppio", "Espresso", "Frappuchino", "Freddo", "Lingo", "Macchiato",
            "Marroochino", "Ristretto"
        };
        
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        
        /*
          Binary search on array
        */
        
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        
    }
}
