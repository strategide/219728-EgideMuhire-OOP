package beginner;


/**
 * Testing the Variable.java class
 *
 * @author strategide
 */
public class VariableMain {

    public static void main(String[] args) {
        // Create and initialize two instances of the Variables class.
        Variables first = new Variables();
        Variables second = new Variables();
        
        // Set and show the id instance variable for the first object.
        first.setId(123);
        System.out.println("ID 1 = " + first.getId());

        // Set and show the id instance variable for the second object.
        second.setId(219728);
        System.out.println("ID 2 = " + second.getId());
    }
}
