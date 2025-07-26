package beginner;

/**
 * Using the unlabeled break statement.
 *
 * @author strategide
 */
public class UnlabeledBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
